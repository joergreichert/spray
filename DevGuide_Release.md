# Introduction #
Follow these steps if you want to release a new version of Spray.
Later we plan to leverage the Maven Release Plugin to facilitate these steps.

  1. Pull the latest state from the repository
  1. Open a command-line and go to the `releng` directory
  1. Set project version to release version with the Tycho Versions plugin
```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=0.1.0
```
  1. Manually change the `releng/repository/category.xml` file. Replace `0.1.0.qualifier` by `0.1.0`
  1. Execute a Maven build with goals `clean verify` to assure that everything builds
```
mvn clean verify
```
  1. Copy the created repository to the `releases` directory of the `spray.distribution` repository.
```
cp -R repository/target/repository/* ../../spray.distribution/releases/
```
  1. Commit the changed files
```
git commit -a -m "prepare for release"
```
  1. Create a release tag with pattern `v<version>`
```
git tag v0.1.0
```
  1. Increment to next development version
```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=0.2.0-SNAPSHOT
```
  1. Manually change the `releng/repository/category.xml` file. Replace `0.1.0` by `0.2.0.qualifier`
  1. Execute a Maven build with goals `clean verify` to assure that everything builds
```
mvn clean verify
```
  1. Commit the changes
```
git commit -a -m "increment to next development version"
```
  1. Go one directory up to the root of the repository
```
cd ..
```
  1. Push the changes including the tag to the server
```
git --tags push origin master
```
  1. Switch to the root directoy of `spray.distribution`
  1. Add, commit and push files in the `spray.distribution` repository
```
git add *
git commit -m "releasing version 0.1.0"
git push origin master
```
  1. Change to the releases directory and zip the contents
```
cd releases
zip -r spray-0.1.0.zip *
```
  1. Upload the file to the [Downloads](http://code.google.com/a/eclipselabs.org/p/spray/downloads/list) section of the project
  1. Announce the release on the spray-dev mailing list