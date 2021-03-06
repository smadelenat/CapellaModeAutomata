package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.ctx.Mission;

@SuppressWarnings("all")
public class MissionAdapter extends EObjectAdapter<Mission> implements org.gemoc.scenario.xdsml.functionscenariomt.ctx.Mission {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public MissionAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvedInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvedInvolvements() {
    if (involvedInvolvements_ == null)
    	involvedInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedInvolvements(), adaptersFactory, eResource);
    return involvedInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.ActorMissionInvolvement> */Object ownedActorMissionInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.ActorMissionInvolvement> */Object getOwnedActorMissionInvolvements() {
    if (ownedActorMissionInvolvements_ == null)
    	ownedActorMissionInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedActorMissionInvolvements(), adaptersFactory, eResource);
    return ownedActorMissionInvolvements_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemMissionInvolvement getOwnedSystemMissionInvolvement() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedSystemMissionInvolvement(), eResource);
  }
  
  @Override
  public void setOwnedSystemMissionInvolvement(final org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemMissionInvolvement o) {
    if (o != null)
    	adaptee.setOwnedSystemMissionInvolvement(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemMissionInvolvementAdapter) o).getAdaptee());
    else adaptee.setOwnedSystemMissionInvolvement(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.CapabilityExploitation> */Object ownedCapabilityExploitations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.CapabilityExploitation> */Object getOwnedCapabilityExploitations() {
    if (ownedCapabilityExploitations_ == null)
    	ownedCapabilityExploitations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedCapabilityExploitations(), adaptersFactory, eResource);
    return ownedCapabilityExploitations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Actor> */Object participatingActors_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Actor> */Object getParticipatingActors() {
    if (participatingActors_ == null)
    	participatingActors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipatingActors(), adaptersFactory, eResource);
    return participatingActors_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.ctx.System getParticipatingSystem() {
    return () adaptersFactory.createAdapter(adaptee.getParticipatingSystem(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.ActorMissionInvolvement> */Object involvedActors_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.ActorMissionInvolvement> */Object getInvolvedActors() {
    if (involvedActors_ == null)
    	involvedActors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedActors(), adaptersFactory, eResource);
    return involvedActors_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemMissionInvolvement getInvolvedSystem() {
    return () adaptersFactory.createAdapter(adaptee.getInvolvedSystem(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object exploitedCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object getExploitedCapabilities() {
    if (exploitedCapabilities_ == null)
    	exploitedCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExploitedCapabilities(), adaptersFactory, eResource);
    return exploitedCapabilities_;
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
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.eINSTANCE.getMission();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
    		return getInvolvedInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
    		return getOwnedActorMissionInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
    		return getOwnedSystemMissionInvolvement();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
    		return getOwnedCapabilityExploitations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__PARTICIPATING_ACTORS:
    		return getParticipatingActors();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__PARTICIPATING_SYSTEM:
    		return getParticipatingSystem();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_ACTORS:
    		return getInvolvedActors();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_SYSTEM:
    		return getInvolvedSystem();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
    		return getExploitedCapabilities();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
    		return getInvolvedInvolvements() != null && !getInvolvedInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
    		return getOwnedActorMissionInvolvements() != null && !getOwnedActorMissionInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
    		return getOwnedSystemMissionInvolvement() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
    		return getOwnedCapabilityExploitations() != null && !getOwnedCapabilityExploitations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__PARTICIPATING_ACTORS:
    		return getParticipatingActors() != null && !getParticipatingActors().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__PARTICIPATING_SYSTEM:
    		return getParticipatingSystem() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_ACTORS:
    		return getInvolvedActors() != null && !getInvolvedActors().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_SYSTEM:
    		return getInvolvedSystem() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
    		return getExploitedCapabilities() != null && !getExploitedCapabilities().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
    		getOwnedActorMissionInvolvements().clear();
    		getOwnedActorMissionInvolvements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
    		setOwnedSystemMissionInvolvement(
    		(org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemMissionInvolvement)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
    		getOwnedCapabilityExploitations().clear();
    		getOwnedCapabilityExploitations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.InvolverElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.InvolverElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxPackage.MISSION__INVOLVED_INVOLVEMENTS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
