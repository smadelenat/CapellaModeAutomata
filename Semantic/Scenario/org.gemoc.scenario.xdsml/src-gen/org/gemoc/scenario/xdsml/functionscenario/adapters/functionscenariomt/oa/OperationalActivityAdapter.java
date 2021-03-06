package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.oa.OperationalActivity;

@SuppressWarnings("all")
public class OperationalActivityAdapter extends EObjectAdapter<OperationalActivity> implements org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivity {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public OperationalActivityAdapter() {
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
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.fa.FunctionKind.get(o.getValue()));
  }
  
  @Override
  public String getCondition() {
    return adaptee.getCondition();
  }
  
  @Override
  public void setCondition(final String o) {
    adaptee.setCondition(o);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Trace> */Object ownedTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Trace> */Object getOwnedTraces() {
    if (ownedTraces_ == null)
    	ownedTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTraces(), adaptersFactory, eResource);
    return ownedTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.GenericTrace> */Object containedGenericTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.GenericTrace> */Object getContainedGenericTraces() {
    if (containedGenericTraces_ == null)
    	containedGenericTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedGenericTraces(), adaptersFactory, eResource);
    return containedGenericTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsTrace> */Object containedRequirementsTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsTrace> */Object getContainedRequirementsTraces() {
    if (containedRequirementsTraces_ == null)
    	containedRequirementsTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedRequirementsTraces(), adaptersFactory, eResource);
    return containedRequirementsTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamingRule> */Object namingRules_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamingRule> */Object getNamingRules() {
    if (namingRules_ == null)
    	namingRules_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getNamingRules(), adaptersFactory, eResource);
    return namingRules_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvingInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvingInvolvements() {
    if (involvingInvolvements_ == null)
    	involvingInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingInvolvements(), adaptersFactory, eResource);
    return involvingInvolvements_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object ownedFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getOwnedFunctionalChains() {
    if (ownedFunctionalChains_ == null)
    	ownedFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalChains(), adaptersFactory, eResource);
    return ownedFunctionalChains_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPartition getInActivityPartition() {
    return () adaptersFactory.createAdapter(adaptee.getInActivityPartition(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion getInInterruptibleRegion() {
    return () adaptersFactory.createAdapter(adaptee.getInInterruptibleRegion(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion getInStructuredNode() {
    return () adaptersFactory.createAdapter(adaptee.getInStructuredNode(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object outgoing_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object incoming_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ExceptionHandler> */Object ownedHandlers_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ExceptionHandler> */Object getOwnedHandlers() {
    if (ownedHandlers_ == null)
    	ownedHandlers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedHandlers(), adaptersFactory, eResource);
    return ownedHandlers_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint getLocalPrecondition() {
    return () adaptersFactory.createAdapter(adaptee.getLocalPrecondition(), eResource);
  }
  
  @Override
  public void setLocalPrecondition(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint o) {
    if (o != null)
    	adaptee.setLocalPrecondition(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) o).getAdaptee());
    else adaptee.setLocalPrecondition(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint getLocalPostcondition() {
    return () adaptersFactory.createAdapter(adaptee.getLocalPostcondition(), eResource);
  }
  
  @Override
  public void setLocalPostcondition(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint o) {
    if (o != null)
    	adaptee.setLocalPostcondition(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) o).getAdaptee());
    else adaptee.setLocalPostcondition(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType getContext() {
    return () adaptersFactory.createAdapter(adaptee.getContext(), eResource);
  }
  
  @Override
  public void setContext(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType o) {
    if (o != null)
    	adaptee.setContext(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter) o).getAdaptee());
    else adaptee.setContext(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object inputs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object getInputs() {
    if (inputs_ == null)
    	inputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputs(), adaptersFactory, eResource);
    return inputs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.OutputPin> */Object outputs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.OutputPin> */Object getOutputs() {
    if (outputs_ == null)
    	outputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputs(), adaptersFactory, eResource);
    return outputs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object arguments_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object getArguments() {
    if (arguments_ == null)
    	arguments_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArguments(), adaptersFactory, eResource);
    return arguments_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.OutputPin> */Object results_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.OutputPin> */Object getResults() {
    if (results_ == null)
    	results_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getResults(), adaptersFactory, eResource);
    return results_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior getBehavior() {
    return () adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior o) {
    if (o != null)
    	adaptee.setBehavior(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object abstractTypedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object getAbstractTypedElements() {
    if (abstractTypedElements_ == null)
    	abstractTypedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAbstractTypedElements(), adaptersFactory, eResource);
    return abstractTypedElements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object ownedFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getOwnedFunctions() {
    if (ownedFunctions_ == null)
    	ownedFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctions(), adaptersFactory, eResource);
    return ownedFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization> */Object ownedFunctionRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization> */Object getOwnedFunctionRealizations() {
    if (ownedFunctionRealizations_ == null)
    	ownedFunctionRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionRealizations(), adaptersFactory, eResource);
    return ownedFunctionRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object ownedFunctionalExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object getOwnedFunctionalExchanges() {
    if (ownedFunctionalExchanges_ == null)
    	ownedFunctionalExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalExchanges(), adaptersFactory, eResource);
    return ownedFunctionalExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object subFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getSubFunctions() {
    if (subFunctions_ == null)
    	subFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubFunctions(), adaptersFactory, eResource);
    return subFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization> */Object outFunctionRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization> */Object getOutFunctionRealizations() {
    if (outFunctionRealizations_ == null)
    	outFunctionRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutFunctionRealizations(), adaptersFactory, eResource);
    return outFunctionRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization> */Object inFunctionRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization> */Object getInFunctionRealizations() {
    if (inFunctionRealizations_ == null)
    	inFunctionRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInFunctionRealizations(), adaptersFactory, eResource);
    return inFunctionRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object componentFunctionalAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object getComponentFunctionalAllocations() {
    if (componentFunctionalAllocations_ == null)
    	componentFunctionalAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getComponentFunctionalAllocations(), adaptersFactory, eResource);
    return componentFunctionalAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunctionalBlock> */Object allocationBlocks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunctionalBlock> */Object getAllocationBlocks() {
    if (allocationBlocks_ == null)
    	allocationBlocks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocationBlocks(), adaptersFactory, eResource);
    return allocationBlocks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State> */Object availableInStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State> */Object getAvailableInStates() {
    if (availableInStates_ == null)
    	availableInStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableInStates(), adaptersFactory, eResource);
    return availableInStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object involvingCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object getInvolvingCapabilities() {
    if (involvingCapabilities_ == null)
    	involvingCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingCapabilities(), adaptersFactory, eResource);
    return involvingCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object involvingCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object getInvolvingCapabilityRealizations() {
    if (involvingCapabilityRealizations_ == null)
    	involvingCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingCapabilityRealizations(), adaptersFactory, eResource);
    return involvingCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object involvingFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getInvolvingFunctionalChains() {
    if (involvingFunctionalChains_ == null)
    	involvingFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingFunctionalChains(), adaptersFactory, eResource);
    return involvingFunctionalChains_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine getLinkedStateMachine() {
    return () adaptersFactory.createAdapter(adaptee.getLinkedStateMachine(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification getLinkedFunctionSpecification() {
    return () adaptersFactory.createAdapter(adaptee.getLinkedFunctionSpecification(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivityPkg> */Object ownedOperationalActivityPkgs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivityPkg> */Object getOwnedOperationalActivityPkgs() {
    if (ownedOperationalActivityPkgs_ == null)
    	ownedOperationalActivityPkgs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedOperationalActivityPkgs(), adaptersFactory, eResource);
    return ownedOperationalActivityPkgs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.ActivityAllocation> */Object activityAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.ActivityAllocation> */Object getActivityAllocations() {
    if (activityAllocations_ == null)
    	activityAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getActivityAllocations(), adaptersFactory, eResource);
    return activityAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.Swimlane> */Object ownedSwimlanes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.Swimlane> */Object getOwnedSwimlanes() {
    if (ownedSwimlanes_ == null)
    	ownedSwimlanes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedSwimlanes(), adaptersFactory, eResource);
    return ownedSwimlanes_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalProcess> */Object ownedProcess_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalProcess> */Object getOwnedProcess() {
    if (ownedProcess_ == null)
    	ownedProcess_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedProcess(), adaptersFactory, eResource);
    return ownedProcess_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.Entity> */Object allocatorEntities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.Entity> */Object getAllocatorEntities() {
    if (allocatorEntities_ == null)
    	allocatorEntities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatorEntities(), adaptersFactory, eResource);
    return allocatorEntities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemFunction> */Object realizingSystemFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemFunction> */Object getRealizingSystemFunctions() {
    if (realizingSystemFunctions_ == null)
    	realizingSystemFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingSystemFunctions(), adaptersFactory, eResource);
    return realizingSystemFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.Role> */Object allocatingRoles_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.Role> */Object getAllocatingRoles() {
    if (allocatingRoles_ == null)
    	allocatingRoles_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingRoles(), adaptersFactory, eResource);
    return allocatingRoles_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivity> */Object containedOperationalActivities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivity> */Object getContainedOperationalActivities() {
    if (containedOperationalActivities_ == null)
    	containedOperationalActivities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedOperationalActivities(), adaptersFactory, eResource);
    return containedOperationalActivities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivity> */Object childrenOperationalActivities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivity> */Object getChildrenOperationalActivities() {
    if (childrenOperationalActivities_ == null)
    	childrenOperationalActivities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getChildrenOperationalActivities(), adaptersFactory, eResource);
    return childrenOperationalActivities_;
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
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionKind.FUNCTION;
  
  protected final static String CONDITION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.eINSTANCE.getOperationalActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_ABSTRACT:
    		return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_STATIC:
    		return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBILITY:
    		return getVisibility();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ABSTRACT_TYPE:
    		return getAbstractType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__TYPE:
    		return getType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ORDERED:
    		return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__UNIQUE:
    		return isUnique() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__MIN_INCLUSIVE:
    		return isMinInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__MAX_INCLUSIVE:
    		return isMaxInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_VALUE:
    		return getOwnedMinValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_VALUE:
    		return getOwnedMaxValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_NULL_VALUE:
    		return getOwnedNullValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_CARD:
    		return getOwnedMinCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_LENGTH:
    		return getOwnedMinLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_CARD:
    		return getOwnedMaxCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__AGGREGATION_KIND:
    		return getAggregationKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_DERIVED:
    		return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_READ_ONLY:
    		return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_PART_OF_KEY:
    		return isIsPartOfKey() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ASSOCIATION:
    		return getAssociation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REPRESENTING_INSTANCE_ROLES:
    		return getRepresentingInstanceRoles();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONAL_CHAINS:
    		return getOwnedFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INCOMING:
    		return getIncoming();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_HANDLERS:
    		return getOwnedHandlers();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LOCAL_PRECONDITION:
    		return getLocalPrecondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LOCAL_POSTCONDITION:
    		return getLocalPostcondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTEXT:
    		return getContext();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INPUTS:
    		return getInputs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTPUTS:
    		return getOutputs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ARGUMENTS:
    		return getArguments();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__RESULTS:
    		return getResults();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__BEHAVIOR:
    		return getBehavior();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONDITION:
    		return getCondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONS:
    		return getOwnedFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTION_REALIZATIONS:
    		return getOwnedFunctionRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONAL_EXCHANGES:
    		return getOwnedFunctionalExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SUB_FUNCTIONS:
    		return getSubFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUT_FUNCTION_REALIZATIONS:
    		return getOutFunctionRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_FUNCTION_REALIZATIONS:
    		return getInFunctionRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__COMPONENT_FUNCTIONAL_ALLOCATIONS:
    		return getComponentFunctionalAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ALLOCATION_BLOCKS:
    		return getAllocationBlocks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__AVAILABLE_IN_STATES:
    		return getAvailableInStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_CAPABILITIES:
    		return getInvolvingCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_CAPABILITY_REALIZATIONS:
    		return getInvolvingCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_FUNCTIONAL_CHAINS:
    		return getInvolvingFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LINKED_STATE_MACHINE:
    		return getLinkedStateMachine();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LINKED_FUNCTION_SPECIFICATION:
    		return getLinkedFunctionSpecification();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
    		return getOwnedOperationalActivityPkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
    		return getActivityAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES:
    		return getOwnedSwimlanes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS:
    		return getOwnedProcess();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
    		return getAllocatorEntities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
    		return getRealizingSystemFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES:
    		return getAllocatingRoles();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
    		return getContainedOperationalActivities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES:
    		return getChildrenOperationalActivities();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements() != null && !getInvolvingInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_ABSTRACT:
    		return isIsAbstract() != IS_ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_STATIC:
    		return isIsStatic() != IS_STATIC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBILITY:
    		return getVisibility() != VISIBILITY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ABSTRACT_TYPE:
    		return getAbstractType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__TYPE:
    		return getType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ORDERED:
    		return isOrdered() != ORDERED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__UNIQUE:
    		return isUnique() != UNIQUE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__MIN_INCLUSIVE:
    		return isMinInclusive() != MIN_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__MAX_INCLUSIVE:
    		return isMaxInclusive() != MAX_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_VALUE:
    		return getOwnedMinValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_VALUE:
    		return getOwnedMaxValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_NULL_VALUE:
    		return getOwnedNullValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_CARD:
    		return getOwnedMinCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_LENGTH:
    		return getOwnedMinLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_CARD:
    		return getOwnedMaxCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__AGGREGATION_KIND:
    		return getAggregationKind() != AGGREGATION_KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_DERIVED:
    		return isIsDerived() != IS_DERIVED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_READ_ONLY:
    		return isIsReadOnly() != IS_READ_ONLY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_PART_OF_KEY:
    		return isIsPartOfKey() != IS_PART_OF_KEY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ASSOCIATION:
    		return getAssociation() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REPRESENTING_INSTANCE_ROLES:
    		return getRepresentingInstanceRoles() != null && !getRepresentingInstanceRoles().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONAL_CHAINS:
    		return getOwnedFunctionalChains() != null && !getOwnedFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_HANDLERS:
    		return getOwnedHandlers() != null && !getOwnedHandlers().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LOCAL_PRECONDITION:
    		return getLocalPrecondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LOCAL_POSTCONDITION:
    		return getLocalPostcondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTEXT:
    		return getContext() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTPUTS:
    		return getOutputs() != null && !getOutputs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ARGUMENTS:
    		return getArguments() != null && !getArguments().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__RESULTS:
    		return getResults() != null && !getResults().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__BEHAVIOR:
    		return getBehavior() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONDITION:
    		return getCondition() != CONDITION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONS:
    		return getOwnedFunctions() != null && !getOwnedFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTION_REALIZATIONS:
    		return getOwnedFunctionRealizations() != null && !getOwnedFunctionRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONAL_EXCHANGES:
    		return getOwnedFunctionalExchanges() != null && !getOwnedFunctionalExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SUB_FUNCTIONS:
    		return getSubFunctions() != null && !getSubFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUT_FUNCTION_REALIZATIONS:
    		return getOutFunctionRealizations() != null && !getOutFunctionRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IN_FUNCTION_REALIZATIONS:
    		return getInFunctionRealizations() != null && !getInFunctionRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__COMPONENT_FUNCTIONAL_ALLOCATIONS:
    		return getComponentFunctionalAllocations() != null && !getComponentFunctionalAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ALLOCATION_BLOCKS:
    		return getAllocationBlocks() != null && !getAllocationBlocks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__AVAILABLE_IN_STATES:
    		return getAvailableInStates() != null && !getAvailableInStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_CAPABILITIES:
    		return getInvolvingCapabilities() != null && !getInvolvingCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_CAPABILITY_REALIZATIONS:
    		return getInvolvingCapabilityRealizations() != null && !getInvolvingCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INVOLVING_FUNCTIONAL_CHAINS:
    		return getInvolvingFunctionalChains() != null && !getInvolvingFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LINKED_STATE_MACHINE:
    		return getLinkedStateMachine() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LINKED_FUNCTION_SPECIFICATION:
    		return getLinkedFunctionSpecification() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
    		return getOwnedOperationalActivityPkgs() != null && !getOwnedOperationalActivityPkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
    		return getActivityAllocations() != null && !getActivityAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES:
    		return getOwnedSwimlanes() != null && !getOwnedSwimlanes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS:
    		return getOwnedProcess() != null && !getOwnedProcess().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
    		return getAllocatorEntities() != null && !getAllocatorEntities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
    		return getRealizingSystemFunctions() != null && !getRealizingSystemFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES:
    		return getAllocatingRoles() != null && !getAllocatingRoles().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
    		return getContainedOperationalActivities() != null && !getContainedOperationalActivities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES:
    		return getChildrenOperationalActivities() != null && !getChildrenOperationalActivities().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_ABSTRACT:
    		setIsAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_STATIC:
    		setIsStatic(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__VISIBILITY:
    		setVisibility(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ABSTRACT_TYPE:
    		setAbstractType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ORDERED:
    		setOrdered(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__UNIQUE:
    		setUnique(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__MIN_INCLUSIVE:
    		setMinInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__MAX_INCLUSIVE:
    		setMaxInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_DEFAULT_VALUE:
    		setOwnedDefaultValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_VALUE:
    		setOwnedMinValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_VALUE:
    		setOwnedMaxValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_NULL_VALUE:
    		setOwnedNullValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_CARD:
    		setOwnedMinCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MIN_LENGTH:
    		setOwnedMinLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_CARD:
    		setOwnedMaxCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_MAX_LENGTH:
    		setOwnedMaxLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__AGGREGATION_KIND:
    		setAggregationKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_DERIVED:
    		setIsDerived(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_READ_ONLY:
    		setIsReadOnly(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__IS_PART_OF_KEY:
    		setIsPartOfKey(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONAL_CHAINS:
    		getOwnedFunctionalChains().clear();
    		getOwnedFunctionalChains().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_HANDLERS:
    		getOwnedHandlers().clear();
    		getOwnedHandlers().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LOCAL_PRECONDITION:
    		setLocalPrecondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__LOCAL_POSTCONDITION:
    		setLocalPostcondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONTEXT:
    		setContext(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OUTPUTS:
    		getOutputs().clear();
    		getOutputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__ARGUMENTS:
    		getArguments().clear();
    		getArguments().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__RESULTS:
    		getResults().clear();
    		getResults().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__BEHAVIOR:
    		setBehavior(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__CONDITION:
    		setCondition(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONS:
    		getOwnedFunctions().clear();
    		getOwnedFunctions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTION_REALIZATIONS:
    		getOwnedFunctionRealizations().clear();
    		getOwnedFunctionRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_FUNCTIONAL_EXCHANGES:
    		getOwnedFunctionalExchanges().clear();
    		getOwnedFunctionalExchanges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__AVAILABLE_IN_STATES:
    		getAvailableInStates().clear();
    		getAvailableInStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
    		getOwnedOperationalActivityPkgs().clear();
    		getOwnedOperationalActivityPkgs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
