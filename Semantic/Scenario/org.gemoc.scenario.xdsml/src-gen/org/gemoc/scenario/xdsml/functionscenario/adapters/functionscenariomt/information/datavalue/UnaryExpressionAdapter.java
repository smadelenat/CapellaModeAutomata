package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.datavalue.UnaryExpression;

@SuppressWarnings("all")
public class UnaryExpressionAdapter extends EObjectAdapter<UnaryExpression> implements org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryExpression {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public UnaryExpressionAdapter() {
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
  public String getExpression() {
    return adaptee.getExpression();
  }
  
  @Override
  public String getUnparsedExpression() {
    return adaptee.getUnparsedExpression();
  }
  
  @Override
  public void setUnparsedExpression(final String o) {
    adaptee.setUnparsedExpression(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryOperator getOperator() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryOperator o) {
    adaptee.setOperator(org.polarsys.capella.core.data.information.datavalue.UnaryOperator.get(o.getValue()));
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
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.BooleanType getBooleanType() {
    return () adaptersFactory.createAdapter(adaptee.getBooleanType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Classifier getComplexType() {
    return () adaptersFactory.createAdapter(adaptee.getComplexType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.Enumeration getEnumerationType() {
    return () adaptersFactory.createAdapter(adaptee.getEnumerationType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Unit getUnit() {
    return () adaptersFactory.createAdapter(adaptee.getUnit(), eResource);
  }
  
  @Override
  public void setUnit(final org.gemoc.scenario.xdsml.functionscenariomt.information.Unit o) {
    if (o != null)
    	adaptee.setUnit(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnitAdapter) o).getAdaptee());
    else adaptee.setUnit(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.NumericType getNumericType() {
    return () adaptersFactory.createAdapter(adaptee.getNumericType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.StringType getStringType() {
    return () adaptersFactory.createAdapter(adaptee.getStringType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DataType getExpressionType() {
    return () adaptersFactory.createAdapter(adaptee.getExpressionType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedOperand() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedOperand(), eResource);
  }
  
  @Override
  public void setOwnedOperand(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedOperand(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedOperand(null);
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
  
  protected final static String EXPRESSION_EDEFAULT = null;
  
  protected final static String UNPARSED_EXPRESSION_EDEFAULT = null;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryOperator OPERATOR_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryOperator.UNSET;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.eINSTANCE.getUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ABSTRACT_TYPE:
    		return getAbstractType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__TYPE:
    		return getType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__BOOLEAN_TYPE:
    		return getBooleanType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__COMPLEX_TYPE:
    		return getComplexType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ENUMERATION_TYPE:
    		return getEnumerationType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__UNIT:
    		return getUnit();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__NUMERIC_TYPE:
    		return getNumericType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__STRING_TYPE:
    		return getStringType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__EXPRESSION:
    		return getExpression();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__UNPARSED_EXPRESSION:
    		return getUnparsedExpression();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__EXPRESSION_TYPE:
    		return getExpressionType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OPERATOR:
    		return getOperator();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_OPERAND:
    		return getOwnedOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ABSTRACT_TYPE:
    		return getAbstractType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__TYPE:
    		return getType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__BOOLEAN_TYPE:
    		return getBooleanType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__COMPLEX_TYPE:
    		return getComplexType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ENUMERATION_TYPE:
    		return getEnumerationType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__UNIT:
    		return getUnit() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__NUMERIC_TYPE:
    		return getNumericType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__STRING_TYPE:
    		return getStringType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__EXPRESSION:
    		return getExpression() != EXPRESSION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__UNPARSED_EXPRESSION:
    		return getUnparsedExpression() != UNPARSED_EXPRESSION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__EXPRESSION_TYPE:
    		return getExpressionType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_OPERAND:
    		return getOwnedOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ABSTRACT_TYPE:
    		setAbstractType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__UNIT:
    		setUnit(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.Unit)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__UNPARSED_EXPRESSION:
    		setUnparsedExpression(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.UnaryOperator)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.UNARY_EXPRESSION__OWNED_OPERAND:
    		setOwnedOperand(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
