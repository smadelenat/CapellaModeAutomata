package com.thalesgroup.trt.mde.vp.mode.mode.provider;

import com.thalesgroup.trt.mde.vp.al.al.AlFactory;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Mode_ItemProvider extends AbstractModeItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode_ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAvailableFunctionalChainsPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Available Functional Chains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableFunctionalChainsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Mode__availableFunctionalChains_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Mode__availableFunctionalChains_feature", "_UI_Mode__type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModePackage.Literals.MODE___AVAILABLE_FUNCTIONAL_CHAINS,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModePackage.Literals.MODE___ENTER_ACTIONS);
			childrenFeatures.add(ModePackage.Literals.MODE___DO_ACTIONS);
			childrenFeatures.add(ModePackage.Literals.MODE___EXIT_ACTIONS);
			childrenFeatures.add(ModePackage.Literals.MODE___SUB_MODE_MACHINE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Mode_.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Mode_")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Mode_) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_Mode__type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Mode_.class)) {
		case ModePackage.MODE___ENTER_ACTIONS:
		case ModePackage.MODE___DO_ACTIONS:
		case ModePackage.MODE___EXIT_ACTIONS:
		case ModePackage.MODE___SUB_MODE_MACHINE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createCallBehaviorAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createBroadcastEventAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createSendEventAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createBroadcastCommunicationAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createSendCommunicationAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createCreateValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createReadValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createUpdateValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___ENTER_ACTIONS,
					AlFactory.eINSTANCE.createDeleteValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createCallBehaviorAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createBroadcastEventAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createSendEventAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createBroadcastCommunicationAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createSendCommunicationAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createCreateValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createReadValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createUpdateValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___DO_ACTIONS,
					AlFactory.eINSTANCE.createDeleteValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createCallBehaviorAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createBroadcastEventAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createSendEventAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createBroadcastCommunicationAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createSendCommunicationAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createCreateValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createReadValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createUpdateValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___EXIT_ACTIONS,
					AlFactory.eINSTANCE.createDeleteValueAction());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModePackage.Literals.MODE___SUB_MODE_MACHINE,
					ModeFactory.eINSTANCE.createModeMachine());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS
				|| childFeature == ModePackage.Literals.MODE___SUB_MODE_MACHINE
				|| childFeature == ModePackage.Literals.MODE___ENTER_ACTIONS
				|| childFeature == ModePackage.Literals.MODE___DO_ACTIONS
				|| childFeature == ModePackage.Literals.MODE___EXIT_ACTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
					new Object[] { getTypeText(childObject),
							getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}