/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.generator.graphiti.util.mm;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.BehaviorGroup;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;

@SuppressWarnings("all")
public class MetaClassExtensions {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  public String getCreateFeatureLabel(final MetaClass metaClass) {
    String _xblockexpression = null;
    {
      final CreateBehavior createBehavior = this.getCreateBehavior(metaClass);
      String _xifexpression = null;
      boolean _and = false;
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(createBehavior, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        String _label = createBehavior.getLabel();
        boolean _notEquals_1 = (!Objects.equal(_label, null));
        _and_1 = _notEquals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _label_1 = createBehavior.getLabel();
        int _length = _label_1.length();
        boolean _greaterThan = (_length > 0);
        _and = _greaterThan;
      }
      if (_and) {
        _xifexpression = createBehavior.getLabel();
      } else {
        _xifexpression = this._namingExtensions.getVisibleName(metaClass);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String getCreateFeatureDescription(final MetaClass metaClass) {
    String _createFeatureLabel = this.getCreateFeatureLabel(metaClass);
    return ("Create new " + _createFeatureLabel);
  }
  
  public CreateBehavior getCreateBehavior(final MetaClass metaClass) {
    EList<Behavior> _behaviors = metaClass.getBehaviors();
    Iterable<CreateBehavior> _filter = Iterables.<CreateBehavior>filter(_behaviors, CreateBehavior.class);
    return IterableExtensions.<CreateBehavior>head(_filter);
  }
  
  public boolean hasCreateBehavior(final MetaClass mc) {
    EList<Behavior> _behaviors = mc.getBehaviors();
    Iterable<CreateBehavior> _filter = Iterables.<CreateBehavior>filter(_behaviors, CreateBehavior.class);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    return (!_isEmpty);
  }
  
  /**
   * @return <code>true</code> when the MetaClass is represented by a Connection Shape
   */
  public boolean isRepresentedByConnection(final MetaClass mc) {
    ShapeInSpray _representedBy = mc.getRepresentedBy();
    return (_representedBy instanceof ConnectionInSpray);
  }
  
  /**
   * Returns the ICustomFeature instances for a MetaClass
   */
  public Set<String> getCustomFeatureClassNames(final MetaClass mc) {
    TreeSet<String> _xblockexpression = null;
    {
      final TreeSet<String> result = new TreeSet<String>();
      Iterable<Behavior> _allBehaviors = this.getAllBehaviors(mc);
      Iterable<CustomBehavior> _filter = Iterables.<CustomBehavior>filter(_allBehaviors, CustomBehavior.class);
      for (final CustomBehavior b : _filter) {
        String _customFeatureClassName = this._namingExtensions.getCustomFeatureClassName(b);
        String _shortName = this._namingExtensions.shortName(_customFeatureClassName);
        result.add(_shortName);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  /**
   * Combines the direct Behaviors with those from the referred BehaviorGroups.
   */
  public Iterable<Behavior> getAllBehaviors(final MetaClass mc) {
    LinkedList<Behavior> _xblockexpression = null;
    {
      EList<Behavior> _behaviors = mc.getBehaviors();
      final LinkedList<Behavior> result = new LinkedList<Behavior>(_behaviors);
      EList<BehaviorGroup> _behaviorGroups = mc.getBehaviorGroups();
      for (final BehaviorGroup g : _behaviorGroups) {
        EList<Behavior> _behaviors_1 = g.getBehaviors();
        Iterables.<Behavior>addAll(result, _behaviors_1);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
