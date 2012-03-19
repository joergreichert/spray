#!/bin/sh

# see https://docs.sonatype.org/display/M2ECLIPSE/Staging+and+releasing+new+M2Eclipse+release

# EXECUTE THIS SCRIPT FROM THE org.eclipselabs.spray.distribution DIRECTORY
ARGCOUNT=2
ERRCODE=0
E_WRONGARGS=1
E_WRONG_EXEC_DIRECTORY=2

REL_VERSION=$1
DEV_VERSION=$2
DISTRO_DIR=`pwd | sed "s/spray\/releng\/org.eclipselabs.spray.distribution/spray.distribution/"`
BASEDIR=`pwd | sed "s/releng\/org.eclipselabs.spray.distribution//"`
BUILDQUALIFIER=`date  +"%Y%m%d-%H%M"`


pushd .

if [ $# -ne $ARGCOUNT ]; 
then
    ERRCODE=$E_WRONGARGS
fi

#if [ ! -f scripts ] ;
#then
#    ERRCODE=$E_WRONG_EXEC_DIRECTORY
#fi

#if [ ! -f $DISTRO_DIR ];
#then
#    echo "Distribution directory $DISTRO_DIR not found"
#    ERRCODE=$E_DISTRIBUTION_DIR_NOT_EXISTS
#fi

# Check for error code
if test $ERRCODE -ne 0
then
    echo "ERROR $ERRCODE"
    echo "Usage: release.sh REL_VERSION DEV_VERSION"
    exit $ERRCODE 
fi

# -------------------------------------------------------------------------------------------------
# PREPARE PHASE
# -------------------------------------------------------------------------------------------------

echo "[spray-release] create release branch"
git branch release-$REL_VERSION

echo "[spray-release] update master to next -SNAPSHOT version ($DEV_VERSION-SNAPSHOT)"
# TODO: versions of POM type modules are not replaced:
# o.e.spray.distribution,o.e.spray.repository, o.e.spray.repository.parent, o.e.spray.targetplatform 
mvn -f $BASEDIR/releng/org.eclipselabs.spray.parent/pom.xml org.eclipse.tycho:tycho-versions-plugin:set-version -Prelease -DnewVersion=$DEV_VERSION-SNAPSHOT || exit

echo "[spray-release] commit master"
git commit -s -a -m "[spray-release] increment development to version $DEV_VERSION-SNAPSHOT"


# -------------------------------------------------------------------------------------------------
# STAGE PHASE
# -------------------------------------------------------------------------------------------------
echo "[spray-release] checkout the release branch"
git checkout release-$REL_VERSION

#pick release BUILDQUALIFIER (eg, 20100924-1107) and update release branch to the release version
BUILDQUALIFIER=`date  +"%Y%m%d-%H%M"`
echo "[spray-release] using BUILDQUALIFIER=$BUILDQUALIFIER" 

echo "[spray-release] update version to $REL_VERSION.v$BUILDQUALIFIER"
# TODO: versions of POM type modules are not replaced:
# o.e.spray.distribution,o.e.spray.repository, o.e.spray.repository.parent, o.e.spray.targetplatform 
mvn -f $BASEDIR/releng/org.eclipselabs.spray.parent/pom.xml org.eclipse.tycho:tycho-versions-plugin:set-version -Prelease -DnewVersion=$REL_VERSION.v$BUILDQUALIFIER || exit

echo "[spray-release] commit and tag the changes" 
git commit -s -a -m "[spray-release] new release $REL_VERSION.v$BUILDQUALIFIER"

echo "[spray-release] perform release build" 
mvn clean verify -Pskip-ui-tests,modules-default,modules-targetplatform,modules-assembly,modules-docs || exit
git commit -s -a -m "[spray-release] checking in sources generated within the build"

echo "[spray-release] create release tag v$REL_VERSION"
git tag v$REL_VERSION

echo "[spray-release] rename repositories"
mv $BASEDIR/releng/org.eclipselabs.spray.repository/target/org.eclipselabs.spray.releng.repository.zip $BASEDIR/releng/org.eclipselabs.spray.repository/target/spray-3rdparty-$REL_VERSION.zip 
mv $BASEDIR/releng/org.eclipselabs.spray.updatesite/target/org.eclipselabs.spray.releng.updatesite.zip $BASEDIR/releng/org.eclipselabs.spray.updatesite/target/spray-$REL_VERSION.zip 

echo "[spray-release] copy content of Spray repository to distribution Git repo"
cp -R $BASEDIR/releng/org.eclipselabs.spray.updatesite/target/repository/* $DISTRO_DIR/releases


echo "[spray-release] add, commit and push files in the spray.distribution repository"
# Switch to the root directoy of spray.distribution
cd $DISTRO_DIR
echo "[spray-release] add, commit and tag files in the spray.distribution repository"
git add *
git commit -m "releasing version $REL_VERSION"
git tag v$REL_VERSION


# -------------------------------------------------------------------------------------------------
# PROMOTE PHASE
# -------------------------------------------------------------------------------------------------
echo "[spray-release] push spray repository"
cd $BASEDIR
git push origin master

echo "[spray-release] push spray.distribution repository"
cd $DISTRO_DIR
git push origin master


echo "[spray-release] Process successfully completed."
echo "[spray-release] Please upload $pwd/../org.eclipselabs.spray.updatesite/target/spray-$REL_VERSION.zip to the project downloads http://code.google.com/a/eclipselabs.org/p/spray/downloads/list."
