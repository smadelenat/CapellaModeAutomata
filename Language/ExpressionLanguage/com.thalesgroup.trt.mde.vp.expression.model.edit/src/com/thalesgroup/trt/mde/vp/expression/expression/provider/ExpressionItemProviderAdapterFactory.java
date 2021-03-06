package com.thalesgroup.trt.mde.vp.expression.expression.provider;

import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionFactory;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import com.thalesgroup.trt.mde.vp.expression.expression.util.ExpressionAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.core.data.sharedmodel.GenericPkg;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.capella.core.data.sharedmodel.util.SharedmodelSwitch;

import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

import org.polarsys.kitalpha.emde.extension.edit.ChildCreationExtenderManager;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProviderAdapterFactory extends
		ExpressionAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ExpressionEditPlugin.INSTANCE, ExpressionPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.Guard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardItemProvider guardItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.Guard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuardAdapter()
	{
		if (guardItemProvider == null)
		{
			guardItemProvider = new GuardItemProvider(this);
		}

		return guardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.EventGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventGuardItemProvider eventGuardItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.EventGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventGuardAdapter()
	{
		if (eventGuardItemProvider == null)
		{
			eventGuardItemProvider = new EventGuardItemProvider(this);
		}

		return eventGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalGuardItemProvider temporalGuardItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemporalGuardAdapter()
	{
		if (temporalGuardItemProvider == null)
		{
			temporalGuardItemProvider = new TemporalGuardItemProvider(this);
		}

		return temporalGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null)
		{
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanUnaryExpressionItemProvider booleanUnaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanUnaryExpressionAdapter() {
		if (booleanUnaryExpressionItemProvider == null)
		{
			booleanUnaryExpressionItemProvider = new BooleanUnaryExpressionItemProvider(this);
		}

		return booleanUnaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanBinaryExpressionItemProvider booleanBinaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanBinaryExpressionAdapter() {
		if (booleanBinaryExpressionItemProvider == null)
		{
			booleanBinaryExpressionItemProvider = new BooleanBinaryExpressionItemProvider(this);
		}

		return booleanBinaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericUnaryExpressionItemProvider numericUnaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericUnaryExpressionAdapter() {
		if (numericUnaryExpressionItemProvider == null)
		{
			numericUnaryExpressionItemProvider = new NumericUnaryExpressionItemProvider(this);
		}

		return numericUnaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericBinaryExpressionItemProvider numericBinaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericBinaryExpressionAdapter() {
		if (numericBinaryExpressionItemProvider == null)
		{
			numericBinaryExpressionItemProvider = new NumericBinaryExpressionItemProvider(this);
		}

		return numericBinaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericComparisonExpressionItemProvider numericComparisonExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericComparisonExpressionAdapter() {
		if (numericComparisonExpressionItemProvider == null)
		{
			numericComparisonExpressionItemProvider = new NumericComparisonExpressionItemProvider(this);
		}

		return numericComparisonExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericComputationExpressionItemProvider numericComputationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericComputationExpressionAdapter() {
		if (numericComputationExpressionItemProvider == null)
		{
			numericComputationExpressionItemProvider = new NumericComputationExpressionItemProvider(this);
		}

		return numericComputationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventUnaryExpressionItemProvider eventUnaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventUnaryExpressionAdapter() {
		if (eventUnaryExpressionItemProvider == null)
		{
			eventUnaryExpressionItemProvider = new EventUnaryExpressionItemProvider(this);
		}

		return eventUnaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBinaryExpressionItemProvider eventBinaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventBinaryExpressionAdapter() {
		if (eventBinaryExpressionItemProvider == null)
		{
			eventBinaryExpressionItemProvider = new EventBinaryExpressionItemProvider(this);
		}

		return eventBinaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationUnaryExpressionItemProvider durationUnaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDurationUnaryExpressionAdapter() {
		if (durationUnaryExpressionItemProvider == null)
		{
			durationUnaryExpressionItemProvider = new DurationUnaryExpressionItemProvider(this);
		}

		return durationUnaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationBinaryExpressionItemProvider durationBinaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDurationBinaryExpressionAdapter() {
		if (durationBinaryExpressionItemProvider == null)
		{
			durationBinaryExpressionItemProvider = new DurationBinaryExpressionItemProvider(this);
		}

		return durationBinaryExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (guardItemProvider != null) guardItemProvider.dispose();
		if (eventGuardItemProvider != null) eventGuardItemProvider.dispose();
		if (temporalGuardItemProvider != null) temporalGuardItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (booleanUnaryExpressionItemProvider != null) booleanUnaryExpressionItemProvider.dispose();
		if (booleanBinaryExpressionItemProvider != null) booleanBinaryExpressionItemProvider.dispose();
		if (numericUnaryExpressionItemProvider != null) numericUnaryExpressionItemProvider.dispose();
		if (numericBinaryExpressionItemProvider != null) numericBinaryExpressionItemProvider.dispose();
		if (numericComparisonExpressionItemProvider != null) numericComparisonExpressionItemProvider.dispose();
		if (numericComputationExpressionItemProvider != null) numericComputationExpressionItemProvider.dispose();
		if (eventUnaryExpressionItemProvider != null) eventUnaryExpressionItemProvider.dispose();
		if (eventBinaryExpressionItemProvider != null) eventBinaryExpressionItemProvider.dispose();
		if (durationUnaryExpressionItemProvider != null) durationUnaryExpressionItemProvider.dispose();
		if (durationBinaryExpressionItemProvider != null) durationBinaryExpressionItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link SharedmodelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class SharedmodelChildCreationExtender implements
			IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends SharedmodelSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors,
					EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseGenericPkg(GenericPkg object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance().isExtensionModelDisabled(EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI(), "http://www.thalesgroup.com/trt/expression/1.0.0")) { //$NON-NLS-1$
					return null;				
				}
				// end-extension-code
                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createGuard());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createEventGuard());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createTemporalGuard());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createVariable());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createBooleanUnaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createBooleanBinaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createNumericUnaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createNumericBinaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createNumericComparisonExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createNumericComputationExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createEventUnaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createEventBinaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createDurationUnaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
                         ExpressionFactory.eINSTANCE.createDurationBinaryExpression());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature,
					Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object,
				EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ExpressionEditPlugin.INSTANCE;
		}
	}

}