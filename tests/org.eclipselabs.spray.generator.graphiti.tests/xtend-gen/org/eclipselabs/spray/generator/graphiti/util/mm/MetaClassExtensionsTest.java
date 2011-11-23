package org.eclipselabs.spray.generator.graphiti.util.mm;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class MetaClassExtensionsTest {
  @Inject
  private NamingExtensions ne;
  
  private MetaClassExtensions ext;
  
  @Before
  public void setUp() {
    MetaClassExtensions _metaClassExtensions = new MetaClassExtensions();
    this.ext = _metaClassExtensions;
  }
  
  @Ignore
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasNoName__ExpectNull() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      String _createFeatureLabel = this.ext.getCreateFeatureLabel(metaClass);
      final String label = _createFeatureLabel;
      Assert.assertNull(label);
  }
  
  @Ignore
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasName__ExpectLabel() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      metaClass.setAlias("testName");
      String _createFeatureLabel = this.ext.getCreateFeatureLabel(metaClass);
      final String label = _createFeatureLabel;
      Assert.assertEquals("testName", label);
  }
  
  @Ignore
  @Test
  public void getCreateFeatureDescription() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      String _createFeatureDescription = this.ext.getCreateFeatureDescription(metaClass);
      final String description = _createFeatureDescription;
      Assert.assertEquals("", description);
  }
  
  @Ignore
  @Test
  public void getCreateBehavior() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      CreateBehavior _createBehavior = this.ext.getCreateBehavior(metaClass);
      final CreateBehavior behavior = _createBehavior;
      Assert.assertNull(behavior);
  }
}
