/**
 */
package metaModel.impl;

import metaModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelFactoryImpl extends EFactoryImpl implements MetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaModelFactory init() {
		try {
			MetaModelFactory theMetaModelFactory = (MetaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetaModelPackage.eNS_URI);
			if (theMetaModelFactory != null) {
				return theMetaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaModelPackage.DATA_FLOW_GUARD:
			return createdataFlowGuard();
		case MetaModelPackage.PROCESS_FLOW_GUARD:
			return createprocessFlowGuard();
		case MetaModelPackage.MILESTONE:
			return createmilestone();
		case MetaModelPackage.STAGE:
			return createStage();
		case MetaModelPackage.FAULT_LOGGER:
			return createfaultLogger();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataFlowGuard createdataFlowGuard() {
		dataFlowGuardImpl dataFlowGuard = new dataFlowGuardImpl();
		return dataFlowGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processFlowGuard createprocessFlowGuard() {
		processFlowGuardImpl processFlowGuard = new processFlowGuardImpl();
		return processFlowGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public milestone createmilestone() {
		milestoneImpl milestone = new milestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public faultLogger createfaultLogger() {
		faultLoggerImpl faultLogger = new faultLoggerImpl();
		return faultLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelPackage getMetaModelPackage() {
		return (MetaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaModelPackage getPackage() {
		return MetaModelPackage.eINSTANCE;
	}

	@Override
	public NestedStage createNestedStage() {
		// TODO Auto-generated method stub
		return null;
	}

} //MetaModelFactoryImpl
