package org.eclipselabs.spray.generator.graphiti.util.mm;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.Shape;

@SuppressWarnings("all")
public class MetaClassExtensions {
  @Inject
  private NamingExtensions _namingExtensions;
  
  public String getCreateFeatureLabel(final MetaClass metaClass) {
    String _xblockexpression = null;
    {
      CreateBehavior _createBehavior = this.getCreateBehavior(metaClass);
      final CreateBehavior createBehavior = _createBehavior;
      String _xifexpression = null;
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(createBehavior, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        String _label = createBehavior.getLabel();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_label, null);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        String _label_1 = createBehavior.getLabel();
        _xifexpression = _label_1;
      } else {
        String _visibleName = this._namingExtensions.getVisibleName(metaClass);
        _xifexpression = _visibleName;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String getCreateFeatureDescription(final MetaClass metaClass) {
    String _createFeatureLabel = this.getCreateFeatureLabel(metaClass);
    String _operator_plus = StringExtensions.operator_plus("Create new ", _createFeatureLabel);
    return _operator_plus;
  }
  
  public CreateBehavior getCreateBehavior(final MetaClass metaClass) {
    EList<Behavior> _behaviorsList = metaClass.getBehaviorsList();
    Iterable<CreateBehavior> _filter = IterableExtensions.<CreateBehavior>filter(_behaviorsList, org.eclipselabs.spray.mm.spray.CreateBehavior.class);
    CreateBehavior _head = IterableExtensions.<CreateBehavior>head(_filter);
    return _head;
  }
  
  public boolean hasCreateBehavior(final MetaClass mc) {
    Behavior[] _behaviors = mc.getBehaviors();
    Iterable<CreateBehavior> _filter = IterableExtensions.<CreateBehavior>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_behaviors)), org.eclipselabs.spray.mm.spray.CreateBehavior.class);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    return _operator_not;
  }
  
  /**
   * @return <code>true</code> when the MetaClass is represented by a Container Shape
   */
  public boolean isRepresentedByContainer(final MetaClass mc) {
    Shape _representedBy = mc.getRepresentedBy();
    return (_representedBy instanceof Container);
  }
  
  /**
   * @return <code>true</code> when the MetaClass is represented by a Connection Shape
   */
  public boolean isRepresentedByConnection(final MetaClass mc) {
    Shape _representedBy = mc.getRepresentedBy();
    return (_representedBy instanceof Connection);
  }
}
