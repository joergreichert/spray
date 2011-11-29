package org.eclipselabs.spray.generator.graphiti.util.mm;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class MetaClassExtensionsTest {
  @Inject
  private MetaClassExtensions ext;
  
  @Before
  public void setUp() {
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasNoName__ExpectEClassName() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      EClass _eClass = EcorePackage.eINSTANCE.getEClass();
      metaClass.setType(_eClass);
      String _createFeatureLabel = this.ext.getCreateFeatureLabel(metaClass);
      final String label = _createFeatureLabel;
      Assert.assertEquals("EClass", label);
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasName__ExpectLabel() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      EClass _eClass = EcorePackage.eINSTANCE.getEClass();
      metaClass.setType(_eClass);
      metaClass.setAlias("testName");
      String _createFeatureLabel = this.ext.getCreateFeatureLabel(metaClass);
      final String label = _createFeatureLabel;
      Assert.assertEquals("testName", label);
  }
  
  @Test
  public void getCreateFeatureDescription() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      EClass _eClass = EcorePackage.eINSTANCE.getEClass();
      metaClass.setType(_eClass);
      String _createFeatureDescription = this.ext.getCreateFeatureDescription(metaClass);
      final String description = _createFeatureDescription;
      Assert.assertEquals("Create new EClass", description);
  }
  
  @Test
  public void getCreateBehavior() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      EClass _eClass = EcorePackage.eINSTANCE.getEClass();
      metaClass.setType(_eClass);
      CreateBehavior _createBehavior = this.ext.getCreateBehavior(metaClass);
      final CreateBehavior behavior = _createBehavior;
      Assert.assertNull(behavior);
  }
}
