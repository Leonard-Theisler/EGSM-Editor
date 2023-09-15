/**
 */
package metaModel.provider;

import java.util.Collection;
import java.util.List;

import metaModel.MetaModelFactory;
import metaModel.MetaModelPackage;
import metaModel.Stage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metaModel.Stage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StageItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageItemProvider(AdapterFactory adapterFactory) {
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

			addProcessflowguardPropertyDescriptor(object);
			addDataflowguardPropertyDescriptor(object);
			addMilestonePropertyDescriptor(object);
			addFaultloggerPropertyDescriptor(object);
			addStagePropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Processflowguard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessflowguardPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_processflowguard_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_processflowguard_feature",
								"_UI_Stage_type"),
						MetaModelPackage.Literals.STAGE__PROCESSFLOWGUARD, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dataflowguard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataflowguardPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_dataflowguard_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_dataflowguard_feature",
								"_UI_Stage_type"),
						MetaModelPackage.Literals.STAGE__DATAFLOWGUARD, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Milestone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMilestonePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_milestone_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_milestone_feature",
								"_UI_Stage_type"),
						MetaModelPackage.Literals.STAGE__MILESTONE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Faultlogger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFaultloggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_faultlogger_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_faultlogger_feature",
								"_UI_Stage_type"),
						MetaModelPackage.Literals.STAGE__FAULTLOGGER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Stage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_stage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_stage_feature", "_UI_Stage_type"),
						MetaModelPackage.Literals.STAGE__STAGE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_Label_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_Label_feature", "_UI_Stage_type"),
						MetaModelPackage.Literals.STAGE__LABEL, true, true, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetaModelPackage.Literals.STAGE__PROCESSFLOWGUARD);
			childrenFeatures.add(MetaModelPackage.Literals.STAGE__DATAFLOWGUARD);
			childrenFeatures.add(MetaModelPackage.Literals.STAGE__MILESTONE);
			childrenFeatures.add(MetaModelPackage.Literals.STAGE__FAULTLOGGER);
			childrenFeatures.add(MetaModelPackage.Literals.STAGE__STAGE);
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
	 * This returns Stage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Stage"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((Stage) object).getLabel());
		return label == null || label.length() == 0 ? getString("_UI_Stage_type")
				: getString("_UI_Stage_type") + " " + label;
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

		switch (notification.getFeatureID(Stage.class)) {
		case MetaModelPackage.STAGE__LABEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MetaModelPackage.STAGE__PROCESSFLOWGUARD:
		case MetaModelPackage.STAGE__DATAFLOWGUARD:
		case MetaModelPackage.STAGE__MILESTONE:
		case MetaModelPackage.STAGE__FAULTLOGGER:
		case MetaModelPackage.STAGE__STAGE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MetaModelPackage.Literals.STAGE__PROCESSFLOWGUARD,
				MetaModelFactory.eINSTANCE.createprocessFlowGuard()));

		newChildDescriptors.add(createChildParameter(MetaModelPackage.Literals.STAGE__DATAFLOWGUARD,
				MetaModelFactory.eINSTANCE.createdataFlowGuard()));

		newChildDescriptors.add(createChildParameter(MetaModelPackage.Literals.STAGE__MILESTONE,
				MetaModelFactory.eINSTANCE.createmilestone()));

		newChildDescriptors.add(createChildParameter(MetaModelPackage.Literals.STAGE__FAULTLOGGER,
				MetaModelFactory.eINSTANCE.createfaultLogger()));

		newChildDescriptors.add(
				createChildParameter(MetaModelPackage.Literals.STAGE__STAGE, MetaModelFactory.eINSTANCE.createStage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetaModelEditPlugin.INSTANCE;
	}

}
