/**
 */
package org.emftrace.metamodel.UMLModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.UMLModel.Parameter;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.UMLModel.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider
	extends ConnectableElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterItemProvider(AdapterFactory adapterFactory) {
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

			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addUpperValuePropertyDescriptor(object);
			addLowerValuePropertyDescriptor(object);
			addParameterSetPropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addIsExceptionPropertyDescriptor(object);
			addIsStreamPropertyDescriptor(object);
			addEffectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isOrdered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isOrdered_feature", "_UI_MultiplicityElement_type"),
				 UMLModelPackage.eINSTANCE.getMultiplicityElement_IsOrdered(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isUnique_feature", "_UI_MultiplicityElement_type"),
				 UMLModelPackage.eINSTANCE.getMultiplicityElement_IsUnique(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_upper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature", "_UI_MultiplicityElement_type"),
				 UMLModelPackage.eINSTANCE.getMultiplicityElement_Upper(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_lower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature", "_UI_MultiplicityElement_type"),
				 UMLModelPackage.eINSTANCE.getMultiplicityElement_Lower(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_upperValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upperValue_feature", "_UI_MultiplicityElement_type"),
				 UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_lowerValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lowerValue_feature", "_UI_MultiplicityElement_type"),
				 UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_parameterSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_parameterSet_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_ParameterSet(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_operation_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_Operation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_direction_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_Direction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_default_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_Default(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_defaultValue_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Exception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_isException_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_isException_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_IsException(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Stream feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStreamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_isStream_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_isStream_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_IsStream(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_effect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_effect_feature", "_UI_Parameter_type"),
				 UMLModelPackage.eINSTANCE.getParameter_Effect(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue());
			childrenFeatures.add(UMLModelPackage.eINSTANCE.getParameter_DefaultValue());
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
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Parameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Parameter_type") :
			getString("_UI_Parameter_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter.class)) {
			case UMLModelPackage.PARAMETER__IS_ORDERED:
			case UMLModelPackage.PARAMETER__IS_UNIQUE:
			case UMLModelPackage.PARAMETER__UPPER:
			case UMLModelPackage.PARAMETER__LOWER:
			case UMLModelPackage.PARAMETER__PARAMETER_SET:
			case UMLModelPackage.PARAMETER__OPERATION:
			case UMLModelPackage.PARAMETER__DIRECTION:
			case UMLModelPackage.PARAMETER__DEFAULT:
			case UMLModelPackage.PARAMETER__IS_EXCEPTION:
			case UMLModelPackage.PARAMETER__IS_STREAM:
			case UMLModelPackage.PARAMETER__EFFECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLModelPackage.PARAMETER__UPPER_VALUE:
			case UMLModelPackage.PARAMETER__LOWER_VALUE:
			case UMLModelPackage.PARAMETER__DEFAULT_VALUE:
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

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UMLModelPackage.eINSTANCE.getParameter_DefaultValue(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UMLModelPackage.eINSTANCE.getNamedElement_NameExpression() ||
			childFeature == UMLModelPackage.eINSTANCE.getMultiplicityElement_UpperValue() ||
			childFeature == UMLModelPackage.eINSTANCE.getMultiplicityElement_LowerValue() ||
			childFeature == UMLModelPackage.eINSTANCE.getParameter_DefaultValue();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
