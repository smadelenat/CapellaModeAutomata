package com.thalesgroup.trt.mde.vp.al.al.provider;

import com.thalesgroup.trt.mde.vp.al.al.AlFactory;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

import com.thalesgroup.trt.mde.vp.al.al.util.AlAdapterFactory;

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
public class AlItemProviderAdapterFactory extends AlAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable,
		IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			AlEditPlugin.INSTANCE, AlPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.ActionInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionInputItemProvider actionInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.ActionInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActionInputAdapter() {
		if (actionInputItemProvider == null) {
			actionInputItemProvider = new ActionInputItemProvider(this);
		}

		return actionInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionValueInputItemProvider actionValueInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActionValueInputAdapter() {
		if (actionValueInputItemProvider == null) {
			actionValueInputItemProvider = new ActionValueInputItemProvider(
					this);
		}

		return actionValueInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.ActionOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionOutputItemProvider actionOutputItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.ActionOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActionOutputAdapter() {
		if (actionOutputItemProvider == null) {
			actionOutputItemProvider = new ActionOutputItemProvider(this);
		}

		return actionOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionValueOutputItemProvider actionValueOutputItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActionValueOutputAdapter() {
		if (actionValueOutputItemProvider == null) {
			actionValueOutputItemProvider = new ActionValueOutputItemProvider(
					this);
		}

		return actionValueOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBehaviorActionItemProvider callBehaviorActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter() {
		if (callBehaviorActionItemProvider == null) {
			callBehaviorActionItemProvider = new CallBehaviorActionItemProvider(
					this);
		}

		return callBehaviorActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.SendEventAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendEventActionItemProvider sendEventActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.SendEventAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSendEventActionAdapter() {
		if (sendEventActionItemProvider == null) {
			sendEventActionItemProvider = new SendEventActionItemProvider(this);
		}

		return sendEventActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.BroadcastEventAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastEventActionItemProvider broadcastEventActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.BroadcastEventAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBroadcastEventActionAdapter() {
		if (broadcastEventActionItemProvider == null) {
			broadcastEventActionItemProvider = new BroadcastEventActionItemProvider(
					this);
		}

		return broadcastEventActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.SendCommunicationAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendCommunicationActionItemProvider sendCommunicationActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.SendCommunicationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSendCommunicationActionAdapter() {
		if (sendCommunicationActionItemProvider == null) {
			sendCommunicationActionItemProvider = new SendCommunicationActionItemProvider(
					this);
		}

		return sendCommunicationActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastCommunicationActionItemProvider broadcastCommunicationActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBroadcastCommunicationActionAdapter() {
		if (broadcastCommunicationActionItemProvider == null) {
			broadcastCommunicationActionItemProvider = new BroadcastCommunicationActionItemProvider(
					this);
		}

		return broadcastCommunicationActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.CreateValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateValueActionItemProvider createValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.CreateValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCreateValueActionAdapter() {
		if (createValueActionItemProvider == null) {
			createValueActionItemProvider = new CreateValueActionItemProvider(
					this);
		}

		return createValueActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.ReadValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadValueActionItemProvider readValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.ReadValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createReadValueActionAdapter() {
		if (readValueActionItemProvider == null) {
			readValueActionItemProvider = new ReadValueActionItemProvider(this);
		}

		return readValueActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateValueActionItemProvider updateValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUpdateValueActionAdapter() {
		if (updateValueActionItemProvider == null) {
			updateValueActionItemProvider = new UpdateValueActionItemProvider(
					this);
		}

		return updateValueActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.thalesgroup.trt.mde.vp.al.al.DeleteValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteValueActionItemProvider deleteValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.DeleteValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDeleteValueActionAdapter() {
		if (deleteValueActionItemProvider == null) {
			deleteValueActionItemProvider = new DeleteValueActionItemProvider(
					this);
		}

		return deleteValueActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
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
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class)
					|| (((Class) type).isInstance(adapter))) {
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
	public List getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getNewChildDescriptors(Object object,
			EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object,
				editingDomain);
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

		if (parentAdapterFactory != null) {
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
		if (actionInputItemProvider != null)
			actionInputItemProvider.dispose();
		if (actionValueInputItemProvider != null)
			actionValueInputItemProvider.dispose();
		if (actionOutputItemProvider != null)
			actionOutputItemProvider.dispose();
		if (actionValueOutputItemProvider != null)
			actionValueOutputItemProvider.dispose();
		if (callBehaviorActionItemProvider != null)
			callBehaviorActionItemProvider.dispose();
		if (sendEventActionItemProvider != null)
			sendEventActionItemProvider.dispose();
		if (broadcastEventActionItemProvider != null)
			broadcastEventActionItemProvider.dispose();
		if (sendCommunicationActionItemProvider != null)
			sendCommunicationActionItemProvider.dispose();
		if (broadcastCommunicationActionItemProvider != null)
			broadcastCommunicationActionItemProvider.dispose();
		if (createValueActionItemProvider != null)
			createValueActionItemProvider.dispose();
		if (readValueActionItemProvider != null)
			readValueActionItemProvider.dispose();
		if (updateValueActionItemProvider != null)
			updateValueActionItemProvider.dispose();
		if (deleteValueActionItemProvider != null)
			deleteValueActionItemProvider.dispose();
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
		protected static class CreationSwitch extends SharedmodelSwitch {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List newChildDescriptors;

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
			CreationSwitch(List newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			public Object caseGenericPkg(GenericPkg object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance()
						.isExtensionModelDisabled(
								EcoreUtil.getRootContainer(object).eClass()
										.getEPackage().getNsURI(),
								"http://www.thalesgroup.com/trt/al/1.0.0")) { //$NON-NLS-1$
					return null;
				}
				// end-extension-code
				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
							AlFactory.eINSTANCE.createActionInput());
					if (NewChildDescriptorHelper.isValidCommand(object,
							commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
							AlFactory.eINSTANCE.createActionValueInput());
					if (NewChildDescriptorHelper.isValidCommand(object,
							commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
							AlFactory.eINSTANCE.createActionOutput());
					if (NewChildDescriptorHelper.isValidCommand(object,
							commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
							AlFactory.eINSTANCE.createActionValueOutput());
					if (NewChildDescriptorHelper.isValidCommand(object,
							commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
							AlFactory.eINSTANCE
									.createBroadcastCommunicationAction());
					if (NewChildDescriptorHelper.isValidCommand(object,
							commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
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
							SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
							AlFactory.eINSTANCE.createDeleteValueAction());
					if (NewChildDescriptorHelper.isValidCommand(object,
							commandParameter)) {
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
		public Collection getNewChildDescriptors(Object object,
				EditingDomain editingDomain) {
			ArrayList result = new ArrayList();
			new CreationSwitch(result, editingDomain)
					.doSwitch((EObject) object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return AlEditPlugin.INSTANCE;
		}
	}

}