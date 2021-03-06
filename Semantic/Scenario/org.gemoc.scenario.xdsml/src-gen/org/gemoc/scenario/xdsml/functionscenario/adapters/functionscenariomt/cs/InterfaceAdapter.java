package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.cs.Interface;

@SuppressWarnings("all")
public class InterfaceAdapter extends EObjectAdapter<Interface> implements org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public InterfaceAdapter() {
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
  public boolean isAbstract() {
    return adaptee.isAbstract();
  }
  
  @Override
  public void setAbstract(final boolean o) {
    adaptee.setAbstract(o);
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
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind getVisibility() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.get(adaptee.getVisibility().getValue());
  }
  
  @Override
  public void setVisibility(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind o) {
    adaptee.setVisibility(org.polarsys.capella.core.data.capellacore.VisibilityKind.get(o.getValue()));
  }
  
  @Override
  public String getMechanism() {
    return adaptee.getMechanism();
  }
  
  @Override
  public void setMechanism(final String o) {
    adaptee.setMechanism(o);
  }
  
  @Override
  public boolean isStructural() {
    return adaptee.isStructural();
  }
  
  @Override
  public void setStructural(final boolean o) {
    adaptee.setStructural(o);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object abstractTypedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object getAbstractTypedElements() {
    if (abstractTypedElements_ == null)
    	abstractTypedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAbstractTypedElements(), adaptersFactory, eResource);
    return abstractTypedElements_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.TypedElement> */Object typedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.TypedElement> */Object getTypedElements() {
    if (typedElements_ == null)
    	typedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTypedElements(), adaptersFactory, eResource);
    return typedElements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object ownedGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object getOwnedGeneralizations() {
    if (ownedGeneralizations_ == null)
    	ownedGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedGeneralizations(), adaptersFactory, eResource);
    return ownedGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object superGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object getSuperGeneralizations() {
    if (superGeneralizations_ == null)
    	superGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSuperGeneralizations(), adaptersFactory, eResource);
    return superGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object subGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object getSubGeneralizations() {
    if (subGeneralizations_ == null)
    	subGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubGeneralizations(), adaptersFactory, eResource);
    return subGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object super_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object getSuper() {
    if (super_ == null)
    	super_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSuper(), adaptersFactory, eResource);
    return super_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object sub_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object getSub() {
    if (sub_ == null)
    	sub_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSub(), adaptersFactory, eResource);
    return sub_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Feature> */Object ownedFeatures_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Feature> */Object getOwnedFeatures() {
    if (ownedFeatures_ == null)
    	ownedFeatures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFeatures(), adaptersFactory, eResource);
    return ownedFeatures_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Property> */Object containedProperties_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Property> */Object getContainedProperties() {
    if (containedProperties_ == null)
    	containedProperties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedProperties(), adaptersFactory, eResource);
    return containedProperties_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object containedOperations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object getContainedOperations() {
    if (containedOperations_ == null)
    	containedOperations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedOperations(), adaptersFactory, eResource);
    return containedOperations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralClass> */Object nestedGeneralClasses_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralClass> */Object getNestedGeneralClasses() {
    if (nestedGeneralClasses_ == null)
    	nestedGeneralClasses_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getNestedGeneralClasses(), adaptersFactory, eResource);
    return nestedGeneralClasses_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object ownedInterfaceAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object getOwnedInterfaceAllocations() {
    if (ownedInterfaceAllocations_ == null)
    	ownedInterfaceAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInterfaceAllocations(), adaptersFactory, eResource);
    return ownedInterfaceAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object provisionedInterfaceAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object getProvisionedInterfaceAllocations() {
    if (provisionedInterfaceAllocations_ == null)
    	provisionedInterfaceAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisionedInterfaceAllocations(), adaptersFactory, eResource);
    return provisionedInterfaceAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object allocatedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getAllocatedInterfaces() {
    if (allocatedInterfaces_ == null)
    	allocatedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedInterfaces(), adaptersFactory, eResource);
    return allocatedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object implementorComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getImplementorComponents() {
    if (implementorComponents_ == null)
    	implementorComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImplementorComponents(), adaptersFactory, eResource);
    return implementorComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object userComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getUserComponents() {
    if (userComponents_ == null)
    	userComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getUserComponents(), adaptersFactory, eResource);
    return userComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation> */Object interfaceImplementations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation> */Object getInterfaceImplementations() {
    if (interfaceImplementations_ == null)
    	interfaceImplementations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInterfaceImplementations(), adaptersFactory, eResource);
    return interfaceImplementations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse> */Object interfaceUses_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse> */Object getInterfaceUses() {
    if (interfaceUses_ == null)
    	interfaceUses_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInterfaceUses(), adaptersFactory, eResource);
    return interfaceUses_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object provisioningInterfaceAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object getProvisioningInterfaceAllocations() {
    if (provisioningInterfaceAllocations_ == null)
    	provisioningInterfaceAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisioningInterfaceAllocations(), adaptersFactory, eResource);
    return provisioningInterfaceAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object allocatingInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getAllocatingInterfaces() {
    if (allocatingInterfaces_ == null)
    	allocatingInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingInterfaces(), adaptersFactory, eResource);
    return allocatingInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object allocatingComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getAllocatingComponents() {
    if (allocatingComponents_ == null)
    	allocatingComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingComponents(), adaptersFactory, eResource);
    return allocatingComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object exchangeItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object getExchangeItems() {
    if (exchangeItems_ == null)
    	exchangeItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExchangeItems(), adaptersFactory, eResource);
    return exchangeItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ExchangeItemAllocation> */Object ownedExchangeItemAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ExchangeItemAllocation> */Object getOwnedExchangeItemAllocations() {
    if (ownedExchangeItemAllocations_ == null)
    	ownedExchangeItemAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExchangeItemAllocations(), adaptersFactory, eResource);
    return ownedExchangeItemAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object requiringComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getRequiringComponents() {
    if (requiringComponents_ == null)
    	requiringComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRequiringComponents(), adaptersFactory, eResource);
    return requiringComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object requiringComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getRequiringComponentPorts() {
    if (requiringComponentPorts_ == null)
    	requiringComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRequiringComponentPorts(), adaptersFactory, eResource);
    return requiringComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object providingComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getProvidingComponents() {
    if (providingComponents_ == null)
    	providingComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvidingComponents(), adaptersFactory, eResource);
    return providingComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object providingComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getProvidingComponentPorts() {
    if (providingComponentPorts_ == null)
    	providingComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvidingComponentPorts(), adaptersFactory, eResource);
    return providingComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object realizingLogicalInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRealizingLogicalInterfaces() {
    if (realizingLogicalInterfaces_ == null)
    	realizingLogicalInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingLogicalInterfaces(), adaptersFactory, eResource);
    return realizingLogicalInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object realizedContextInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRealizedContextInterfaces() {
    if (realizedContextInterfaces_ == null)
    	realizedContextInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedContextInterfaces(), adaptersFactory, eResource);
    return realizedContextInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object realizingPhysicalInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRealizingPhysicalInterfaces() {
    if (realizingPhysicalInterfaces_ == null)
    	realizingPhysicalInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingPhysicalInterfaces(), adaptersFactory, eResource);
    return realizingPhysicalInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object realizedLogicalInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRealizedLogicalInterfaces() {
    if (realizedLogicalInterfaces_ == null)
    	realizedLogicalInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedLogicalInterfaces(), adaptersFactory, eResource);
    return realizedLogicalInterfaces_;
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
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind VISIBILITY_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.UNSET;
  
  protected final static String MECHANISM_EDEFAULT = null;
  
  protected final static boolean STRUCTURAL_EDEFAULT = true;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.eINSTANCE.getInterface();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__TYPED_ELEMENTS:
    		return getTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUB_GENERALIZATIONS:
    		return getSubGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUPER:
    		return getSuper();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUB:
    		return getSub();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_FEATURES:
    		return getOwnedFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_PROPERTIES:
    		return getContainedProperties();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBILITY:
    		return getVisibility();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_OPERATIONS:
    		return getContainedOperations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NESTED_GENERAL_CLASSES:
    		return getNestedGeneralClasses();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
    		return getOwnedInterfaceAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
    		return getProvisionedInterfaceAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATED_INTERFACES:
    		return getAllocatedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__MECHANISM:
    		return getMechanism();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__STRUCTURAL:
    		return isStructural() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
    		return getImplementorComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__USER_COMPONENTS:
    		return getUserComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS:
    		return getInterfaceImplementations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__INTERFACE_USES:
    		return getInterfaceUses();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
    		return getProvisioningInterfaceAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATING_INTERFACES:
    		return getAllocatingInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATING_COMPONENTS:
    		return getAllocatingComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__EXCHANGE_ITEMS:
    		return getExchangeItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
    		return getOwnedExchangeItemAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REQUIRING_COMPONENTS:
    		return getRequiringComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS:
    		return getRequiringComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVIDING_COMPONENTS:
    		return getProvidingComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS:
    		return getProvidingComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES:
    		return getRealizingLogicalInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
    		return getRealizedContextInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES:
    		return getRealizingPhysicalInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
    		return getRealizedLogicalInterfaces();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__TYPED_ELEMENTS:
    		return getTypedElements() != null && !getTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations() != null && !getOwnedGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations() != null && !getSuperGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUB_GENERALIZATIONS:
    		return getSubGeneralizations() != null && !getSubGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUPER:
    		return getSuper() != null && !getSuper().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUB:
    		return getSub() != null && !getSub().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_FEATURES:
    		return getOwnedFeatures() != null && !getOwnedFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_PROPERTIES:
    		return getContainedProperties() != null && !getContainedProperties().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBILITY:
    		return getVisibility() != VISIBILITY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__CONTAINED_OPERATIONS:
    		return getContainedOperations() != null && !getContainedOperations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NESTED_GENERAL_CLASSES:
    		return getNestedGeneralClasses() != null && !getNestedGeneralClasses().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
    		return getOwnedInterfaceAllocations() != null && !getOwnedInterfaceAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
    		return getProvisionedInterfaceAllocations() != null && !getProvisionedInterfaceAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATED_INTERFACES:
    		return getAllocatedInterfaces() != null && !getAllocatedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__MECHANISM:
    		return getMechanism() != MECHANISM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__STRUCTURAL:
    		return isStructural() != STRUCTURAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
    		return getImplementorComponents() != null && !getImplementorComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__USER_COMPONENTS:
    		return getUserComponents() != null && !getUserComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS:
    		return getInterfaceImplementations() != null && !getInterfaceImplementations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__INTERFACE_USES:
    		return getInterfaceUses() != null && !getInterfaceUses().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
    		return getProvisioningInterfaceAllocations() != null && !getProvisioningInterfaceAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATING_INTERFACES:
    		return getAllocatingInterfaces() != null && !getAllocatingInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATING_COMPONENTS:
    		return getAllocatingComponents() != null && !getAllocatingComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__EXCHANGE_ITEMS:
    		return getExchangeItems() != null && !getExchangeItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
    		return getOwnedExchangeItemAllocations() != null && !getOwnedExchangeItemAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REQUIRING_COMPONENTS:
    		return getRequiringComponents() != null && !getRequiringComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS:
    		return getRequiringComponentPorts() != null && !getRequiringComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVIDING_COMPONENTS:
    		return getProvidingComponents() != null && !getProvidingComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS:
    		return getProvidingComponentPorts() != null && !getProvidingComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES:
    		return getRealizingLogicalInterfaces() != null && !getRealizingLogicalInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
    		return getRealizedContextInterfaces() != null && !getRealizedContextInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES:
    		return getRealizingPhysicalInterfaces() != null && !getRealizingPhysicalInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
    		return getRealizedLogicalInterfaces() != null && !getRealizedLogicalInterfaces().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_GENERALIZATIONS:
    		getOwnedGeneralizations().clear();
    		getOwnedGeneralizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_FEATURES:
    		getOwnedFeatures().clear();
    		getOwnedFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__VISIBILITY:
    		setVisibility(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__NESTED_GENERAL_CLASSES:
    		getNestedGeneralClasses().clear();
    		getNestedGeneralClasses().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
    		getOwnedInterfaceAllocations().clear();
    		getOwnedInterfaceAllocations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__MECHANISM:
    		setMechanism(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__STRUCTURAL:
    		setStructural(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
    		getOwnedExchangeItemAllocations().clear();
    		getOwnedExchangeItemAllocations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocator.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATED_INTERFACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocator.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.INTERFACE__ALLOCATED_INTERFACES;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
