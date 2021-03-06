package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.ComponentPort;

@SuppressWarnings("all")
public class ComponentPortAdapter extends EObjectAdapter<ComponentPort> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ComponentPortAdapter() {
    super(org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  @Override
  public String getSid() {
    return adaptee.getSid();
  }
  
  @Override
  public void setSid(final String o) {
    adaptee.setSid(o);
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isVisibleInDoc() {
    return adaptee.isVisibleInDoc();
  }
  
  @Override
  public void setVisibleInDoc(final boolean o) {
    adaptee.setVisibleInDoc(o);
  }
  
  @Override
  public boolean isVisibleInLM() {
    return adaptee.isVisibleInLM();
  }
  
  @Override
  public void setVisibleInLM(final boolean o) {
    adaptee.setVisibleInLM(o);
  }
  
  @Override
  public String getSummary() {
    return adaptee.getSummary();
  }
  
  @Override
  public void setSummary(final String o) {
    adaptee.setSummary(o);
  }
  
  @Override
  public String getDescription() {
    return adaptee.getDescription();
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o);
  }
  
  @Override
  public String getReview() {
    return adaptee.getReview();
  }
  
  @Override
  public void setReview(final String o) {
    adaptee.setReview(o);
  }
  
  @Override
  public boolean isIsAbstract() {
    return adaptee.isIsAbstract();
  }
  
  @Override
  public void setIsAbstract(final boolean o) {
    adaptee.setIsAbstract(o);
  }
  
  @Override
  public boolean isIsStatic() {
    return adaptee.isIsStatic();
  }
  
  @Override
  public void setIsStatic(final boolean o) {
    adaptee.setIsStatic(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind getVisibility() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.get(adaptee.getVisibility().getValue());
  }
  
  @Override
  public void setVisibility(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind o) {
    adaptee.setVisibility(org.polarsys.capella.core.data.capellacore.VisibilityKind.get(o.getValue()));
  }
  
  @Override
  public boolean isOrdered() {
    return adaptee.isOrdered();
  }
  
  @Override
  public void setOrdered(final boolean o) {
    adaptee.setOrdered(o);
  }
  
  @Override
  public boolean isUnique() {
    return adaptee.isUnique();
  }
  
  @Override
  public void setUnique(final boolean o) {
    adaptee.setUnique(o);
  }
  
  @Override
  public boolean isMinInclusive() {
    return adaptee.isMinInclusive();
  }
  
  @Override
  public void setMinInclusive(final boolean o) {
    adaptee.setMinInclusive(o);
  }
  
  @Override
  public boolean isMaxInclusive() {
    return adaptee.isMaxInclusive();
  }
  
  @Override
  public void setMaxInclusive(final boolean o) {
    adaptee.setMaxInclusive(o);
  }
  
  @Override
  public boolean isFinal() {
    return adaptee.isFinal();
  }
  
  @Override
  public void setFinal(final boolean o) {
    adaptee.setFinal(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind getAggregationKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind.get(adaptee.getAggregationKind().getValue());
  }
  
  @Override
  public void setAggregationKind(final org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind o) {
    adaptee.setAggregationKind(org.polarsys.capella.core.data.information.AggregationKind.get(o.getValue()));
  }
  
  @Override
  public boolean isIsDerived() {
    return adaptee.isIsDerived();
  }
  
  @Override
  public void setIsDerived(final boolean o) {
    adaptee.setIsDerived(o);
  }
  
  @Override
  public boolean isIsReadOnly() {
    return adaptee.isIsReadOnly();
  }
  
  @Override
  public void setIsReadOnly(final boolean o) {
    adaptee.setIsReadOnly(o);
  }
  
  @Override
  public boolean isIsPartOfKey() {
    return adaptee.isIsPartOfKey();
  }
  
  @Override
  public void setIsPartOfKey(final boolean o) {
    adaptee.setIsPartOfKey(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.OrientationPortKind getOrientation() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.OrientationPortKind.get(adaptee.getOrientation().getValue());
  }
  
  @Override
  public void setOrientation(final org.gemoc.scenario.xdsml.functionscenariomt.fa.OrientationPortKind o) {
    adaptee.setOrientation(org.polarsys.capella.core.data.fa.OrientationPortKind.get(o.getValue()));
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.fa.ComponentPortKind.get(o.getValue()));
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.emde.ElementExtension> */Object ownedExtensions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.emde.ElementExtension> */Object getOwnedExtensions() {
    if (ownedExtensions_ == null)
    	ownedExtensions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExtensions(), adaptersFactory, eResource);
    return ownedExtensions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object constraints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object getConstraints() {
    if (constraints_ == null)
    	constraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstraints(), adaptersFactory, eResource);
    return constraints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object ownedConstraints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object getOwnedConstraints() {
    if (ownedConstraints_ == null)
    	ownedConstraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedConstraints(), adaptersFactory, eResource);
    return ownedConstraints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object incomingTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object getIncomingTraces() {
    if (incomingTraces_ == null)
    	incomingTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTraces(), adaptersFactory, eResource);
    return incomingTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object outgoingTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object getOutgoingTraces() {
    if (outgoingTraces_ == null)
    	outgoingTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTraces(), adaptersFactory, eResource);
    return outgoingTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object ownedPropertyValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object getOwnedPropertyValues() {
    if (ownedPropertyValues_ == null)
    	ownedPropertyValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValues(), adaptersFactory, eResource);
    return ownedPropertyValues_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType> */Object ownedEnumerationPropertyTypes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType> */Object getOwnedEnumerationPropertyTypes() {
    if (ownedEnumerationPropertyTypes_ == null)
    	ownedEnumerationPropertyTypes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedEnumerationPropertyTypes(), adaptersFactory, eResource);
    return ownedEnumerationPropertyTypes_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object appliedPropertyValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object getAppliedPropertyValues() {
    if (appliedPropertyValues_ == null)
    	appliedPropertyValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedPropertyValues(), adaptersFactory, eResource);
    return appliedPropertyValues_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object ownedPropertyValueGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object getOwnedPropertyValueGroups() {
    if (ownedPropertyValueGroups_ == null)
    	ownedPropertyValueGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValueGroups(), adaptersFactory, eResource);
    return ownedPropertyValueGroups_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object appliedPropertyValueGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object getAppliedPropertyValueGroups() {
    if (appliedPropertyValueGroups_ == null)
    	appliedPropertyValueGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedPropertyValueGroups(), adaptersFactory, eResource);
    return appliedPropertyValueGroups_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral getStatus() {
    return () adaptersFactory.createAdapter(adaptee.getStatus(), eResource);
  }
  
  @Override
  public void setStatus(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral o) {
    if (o != null)
    	adaptee.setStatus(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter) o).getAdaptee());
    else adaptee.setStatus(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral> */Object features_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral> */Object getFeatures() {
    if (features_ == null)
    	features_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFeatures(), adaptersFactory, eResource);
    return features_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.Requirement> */Object appliedRequirements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.Requirement> */Object getAppliedRequirements() {
    if (appliedRequirements_ == null)
    	appliedRequirements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedRequirements(), adaptersFactory, eResource);
    return appliedRequirements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object incomingPortRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object getIncomingPortRealizations() {
    if (incomingPortRealizations_ == null)
    	incomingPortRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingPortRealizations(), adaptersFactory, eResource);
    return incomingPortRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object outgoingPortRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object getOutgoingPortRealizations() {
    if (outgoingPortRealizations_ == null)
    	outgoingPortRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPortRealizations(), adaptersFactory, eResource);
    return outgoingPortRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine> */Object ownedProtocols_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine> */Object getOwnedProtocols() {
    if (ownedProtocols_ == null)
    	ownedProtocols_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedProtocols(), adaptersFactory, eResource);
    return ownedProtocols_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object incomingPortAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object getIncomingPortAllocations() {
    if (incomingPortAllocations_ == null)
    	incomingPortAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingPortAllocations(), adaptersFactory, eResource);
    return incomingPortAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object outgoingPortAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object getOutgoingPortAllocations() {
    if (outgoingPortAllocations_ == null)
    	outgoingPortAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPortAllocations(), adaptersFactory, eResource);
    return outgoingPortAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object providedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getProvidedInterfaces() {
    if (providedInterfaces_ == null)
    	providedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvidedInterfaces(), adaptersFactory, eResource);
    return providedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object requiredInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRequiredInterfaces() {
    if (requiredInterfaces_ == null)
    	requiredInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRequiredInterfaces(), adaptersFactory, eResource);
    return requiredInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object ownedPortRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object getOwnedPortRealizations() {
    if (ownedPortRealizations_ == null)
    	ownedPortRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPortRealizations(), adaptersFactory, eResource);
    return ownedPortRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object ownedPortAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object getOwnedPortAllocations() {
    if (ownedPortAllocations_ == null)
    	ownedPortAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPortAllocations(), adaptersFactory, eResource);
    return ownedPortAllocations_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType getAbstractType() {
    return () adaptersFactory.createAdapter(adaptee.getAbstractType(), eResource);
  }
  
  @Override
  public void setAbstractType(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType o) {
    if (o != null)
    	adaptee.setAbstractType(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter) o).getAdaptee());
    else adaptee.setAbstractType(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type getType() {
    return () adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedDefaultValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedDefaultValue(), eResource);
  }
  
  @Override
  public void setOwnedDefaultValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedDefaultValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedDefaultValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedMinValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinValue(), eResource);
  }
  
  @Override
  public void setOwnedMinValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedMinValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedMaxValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxValue(), eResource);
  }
  
  @Override
  public void setOwnedMaxValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedMaxValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedNullValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedNullValue(), eResource);
  }
  
  @Override
  public void setOwnedNullValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedNullValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedNullValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMinCard() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinCard(), eResource);
  }
  
  @Override
  public void setOwnedMinCard(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMinCard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinCard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMinLength() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinLength(), eResource);
  }
  
  @Override
  public void setOwnedMinLength(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMinLength(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinLength(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMaxCard() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxCard(), eResource);
  }
  
  @Override
  public void setOwnedMaxCard(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMaxCard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxCard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMaxLength() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxLength(), eResource);
  }
  
  @Override
  public void setOwnedMaxLength(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMaxLength(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxLength(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Association getAssociation() {
    return () adaptersFactory.createAdapter(adaptee.getAssociation(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.InstanceRole> */Object representingInstanceRoles_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.InstanceRole> */Object getRepresentingInstanceRoles() {
    if (representingInstanceRoles_ == null)
    	representingInstanceRoles_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRepresentingInstanceRoles(), adaptersFactory, eResource);
    return representingInstanceRoles_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object incomingInformationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getIncomingInformationFlows() {
    if (incomingInformationFlows_ == null)
    	incomingInformationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingInformationFlows(), adaptersFactory, eResource);
    return incomingInformationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object outgoingInformationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getOutgoingInformationFlows() {
    if (outgoingInformationFlows_ == null)
    	outgoingInformationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingInformationFlows(), adaptersFactory, eResource);
    return outgoingInformationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object informationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getInformationFlows() {
    if (informationFlows_ == null)
    	informationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInformationFlows(), adaptersFactory, eResource);
    return informationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object componentExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object getComponentExchanges() {
    if (componentExchanges_ == null)
    	componentExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getComponentExchanges(), adaptersFactory, eResource);
    return componentExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object allocatedFunctionPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object getAllocatedFunctionPorts() {
    if (allocatedFunctionPorts_ == null)
    	allocatedFunctionPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedFunctionPorts(), adaptersFactory, eResource);
    return allocatedFunctionPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object delegatedComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getDelegatedComponentPorts() {
    if (delegatedComponentPorts_ == null)
    	delegatedComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDelegatedComponentPorts(), adaptersFactory, eResource);
    return delegatedComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object delegatingComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getDelegatingComponentPorts() {
    if (delegatingComponentPorts_ == null)
    	delegatingComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDelegatingComponentPorts(), adaptersFactory, eResource);
    return delegatingComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPort> */Object allocatingPhysicalPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPort> */Object getAllocatingPhysicalPorts() {
    if (allocatingPhysicalPorts_ == null)
    	allocatingPhysicalPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingPhysicalPorts(), adaptersFactory, eResource);
    return allocatingPhysicalPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object realizedComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getRealizedComponentPorts() {
    if (realizedComponentPorts_ == null)
    	realizedComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedComponentPorts(), adaptersFactory, eResource);
    return realizedComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object realizingComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getRealizingComponentPorts() {
    if (realizingComponentPorts_ == null)
    	realizingComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingComponentPorts(), adaptersFactory, eResource);
    return realizingComponentPorts_;
  }
  
  @Override
  public void destroy() {
    adaptee.destroy();
  }
  
  @Override
  public String getFullLabel() {
    return adaptee.getFullLabel();
  }
  
  @Override
  public String getLabel() {
    return adaptee.getLabel();
  }
  
  @Override
  public boolean hasUnnamedLabel() {
    return adaptee.hasUnnamedLabel();
  }
  
  protected final static String ID_EDEFAULT = null;
  
  protected final static String SID_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean VISIBLE_IN_DOC_EDEFAULT = true;
  
  protected final static boolean VISIBLE_IN_LM_EDEFAULT = true;
  
  protected final static String SUMMARY_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static String REVIEW_EDEFAULT = null;
  
  protected final static boolean IS_ABSTRACT_EDEFAULT = false;
  
  protected final static boolean IS_STATIC_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind VISIBILITY_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.UNSET;
  
  protected final static boolean ORDERED_EDEFAULT = false;
  
  protected final static boolean UNIQUE_EDEFAULT = false;
  
  protected final static boolean MIN_INCLUSIVE_EDEFAULT = false;
  
  protected final static boolean MAX_INCLUSIVE_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind AGGREGATION_KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind.UNSET;
  
  protected final static boolean IS_DERIVED_EDEFAULT = false;
  
  protected final static boolean IS_READ_ONLY_EDEFAULT = false;
  
  protected final static boolean IS_PART_OF_KEY_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.fa.OrientationPortKind ORIENTATION_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.fa.OrientationPortKind.UNSET;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortKind.STANDARD;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getComponentPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_PORT_REALIZATIONS:
    		return getIncomingPortRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_PORT_REALIZATIONS:
    		return getOutgoingPortRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROTOCOLS:
    		return getOwnedProtocols();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_PORT_ALLOCATIONS:
    		return getIncomingPortAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_PORT_ALLOCATIONS:
    		return getOutgoingPortAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__PROVIDED_INTERFACES:
    		return getProvidedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REQUIRED_INTERFACES:
    		return getRequiredInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PORT_REALIZATIONS:
    		return getOwnedPortRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PORT_ALLOCATIONS:
    		return getOwnedPortAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_ABSTRACT:
    		return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_STATIC:
    		return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBILITY:
    		return getVisibility();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
    		return getAbstractType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__TYPE:
    		return getType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORDERED:
    		return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__UNIQUE:
    		return isUnique() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
    		return isMinInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
    		return isMaxInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
    		return getOwnedMinValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
    		return getOwnedMaxValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
    		return getOwnedNullValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
    		return getOwnedMinCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
    		return getOwnedMinLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
    		return getOwnedMaxCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
    		return getAggregationKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_DERIVED:
    		return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_READ_ONLY:
    		return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
    		return isIsPartOfKey() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ASSOCIATION:
    		return getAssociation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES:
    		return getRepresentingInstanceRoles();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS:
    		return getIncomingInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS:
    		return getOutgoingInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INFORMATION_FLOWS:
    		return getInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORIENTATION:
    		return getOrientation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__COMPONENT_EXCHANGES:
    		return getComponentExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS:
    		return getAllocatedFunctionPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DELEGATED_COMPONENT_PORTS:
    		return getDelegatedComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DELEGATING_COMPONENT_PORTS:
    		return getDelegatingComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ALLOCATING_PHYSICAL_PORTS:
    		return getAllocatingPhysicalPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REALIZED_COMPONENT_PORTS:
    		return getRealizedComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REALIZING_COMPONENT_PORTS:
    		return getRealizingComponentPorts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_PORT_REALIZATIONS:
    		return getIncomingPortRealizations() != null && !getIncomingPortRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_PORT_REALIZATIONS:
    		return getOutgoingPortRealizations() != null && !getOutgoingPortRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROTOCOLS:
    		return getOwnedProtocols() != null && !getOwnedProtocols().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_PORT_ALLOCATIONS:
    		return getIncomingPortAllocations() != null && !getIncomingPortAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_PORT_ALLOCATIONS:
    		return getOutgoingPortAllocations() != null && !getOutgoingPortAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__PROVIDED_INTERFACES:
    		return getProvidedInterfaces() != null && !getProvidedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REQUIRED_INTERFACES:
    		return getRequiredInterfaces() != null && !getRequiredInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PORT_REALIZATIONS:
    		return getOwnedPortRealizations() != null && !getOwnedPortRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PORT_ALLOCATIONS:
    		return getOwnedPortAllocations() != null && !getOwnedPortAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_ABSTRACT:
    		return isIsAbstract() != IS_ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_STATIC:
    		return isIsStatic() != IS_STATIC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBILITY:
    		return getVisibility() != VISIBILITY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
    		return getAbstractType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__TYPE:
    		return getType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORDERED:
    		return isOrdered() != ORDERED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__UNIQUE:
    		return isUnique() != UNIQUE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
    		return isMinInclusive() != MIN_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
    		return isMaxInclusive() != MAX_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
    		return getOwnedMinValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
    		return getOwnedMaxValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
    		return getOwnedNullValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
    		return getOwnedMinCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
    		return getOwnedMinLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
    		return getOwnedMaxCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
    		return getAggregationKind() != AGGREGATION_KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_DERIVED:
    		return isIsDerived() != IS_DERIVED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_READ_ONLY:
    		return isIsReadOnly() != IS_READ_ONLY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
    		return isIsPartOfKey() != IS_PART_OF_KEY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ASSOCIATION:
    		return getAssociation() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES:
    		return getRepresentingInstanceRoles() != null && !getRepresentingInstanceRoles().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS:
    		return getIncomingInformationFlows() != null && !getIncomingInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS:
    		return getOutgoingInformationFlows() != null && !getOutgoingInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INFORMATION_FLOWS:
    		return getInformationFlows() != null && !getInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORIENTATION:
    		return getOrientation() != ORIENTATION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__COMPONENT_EXCHANGES:
    		return getComponentExchanges() != null && !getComponentExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS:
    		return getAllocatedFunctionPorts() != null && !getAllocatedFunctionPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DELEGATED_COMPONENT_PORTS:
    		return getDelegatedComponentPorts() != null && !getDelegatedComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DELEGATING_COMPONENT_PORTS:
    		return getDelegatingComponentPorts() != null && !getDelegatingComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ALLOCATING_PHYSICAL_PORTS:
    		return getAllocatingPhysicalPorts() != null && !getAllocatingPhysicalPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REALIZED_COMPONENT_PORTS:
    		return getRealizedComponentPorts() != null && !getRealizedComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REALIZING_COMPONENT_PORTS:
    		return getRealizingComponentPorts() != null && !getRealizingComponentPorts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PROTOCOLS:
    		getOwnedProtocols().clear();
    		getOwnedProtocols().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__PROVIDED_INTERFACES:
    		getProvidedInterfaces().clear();
    		getProvidedInterfaces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REQUIRED_INTERFACES:
    		getRequiredInterfaces().clear();
    		getRequiredInterfaces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PORT_REALIZATIONS:
    		getOwnedPortRealizations().clear();
    		getOwnedPortRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_PORT_ALLOCATIONS:
    		getOwnedPortAllocations().clear();
    		getOwnedPortAllocations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_ABSTRACT:
    		setIsAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_STATIC:
    		setIsStatic(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBILITY:
    		setVisibility(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
    		setAbstractType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORDERED:
    		setOrdered(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__UNIQUE:
    		setUnique(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
    		setMinInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
    		setMaxInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
    		setOwnedDefaultValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
    		setOwnedMinValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
    		setOwnedMaxValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
    		setOwnedNullValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
    		setOwnedMinCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
    		setOwnedMinLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
    		setOwnedMaxCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
    		setOwnedMaxLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
    		setAggregationKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_DERIVED:
    		setIsDerived(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_READ_ONLY:
    		setIsReadOnly(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
    		setIsPartOfKey(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORIENTATION:
    		setOrientation(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.OrientationPortKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Feature.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_ABSTRACT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.FEATURE__IS_ABSTRACT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_STATIC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.FEATURE__IS_STATIC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBILITY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.FEATURE__VISIBILITY;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.TypedElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__TYPE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.TYPED_ELEMENT__TYPE;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.MultiplicityElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORDERED:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__UNIQUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.FinalizableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FINAL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.Property.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__AGGREGATION_KIND;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_DERIVED:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__IS_DERIVED;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_READ_ONLY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__IS_READ_ONLY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__IS_PART_OF_KEY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ASSOCIATION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__ASSOCIATION;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.AbstractInstance.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.Partition.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INFORMATION_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Feature.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.FEATURE__IS_ABSTRACT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_ABSTRACT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.FEATURE__IS_STATIC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_STATIC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.FEATURE__VISIBILITY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__VISIBILITY;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ABSTRACT_TYPE;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.TypedElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.TYPED_ELEMENT__TYPE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__TYPE;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.MultiplicityElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ORDERED;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__UNIQUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MIN_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__MAX_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.FinalizableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__FINAL;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.Property.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__AGGREGATION_KIND:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__AGGREGATION_KIND;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__IS_DERIVED:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_DERIVED;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__IS_READ_ONLY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_READ_ONLY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__IS_PART_OF_KEY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__IS_PART_OF_KEY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.PROPERTY__ASSOCIATION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__ASSOCIATION;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.AbstractInstance.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.Partition.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_PORT__INFORMATION_FLOWS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
