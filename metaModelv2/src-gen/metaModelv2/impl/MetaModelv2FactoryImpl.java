/**
 */
package metaModelv2.impl;

import metaModelv2.*;

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
public class MetaModelv2FactoryImpl extends EFactoryImpl implements MetaModelv2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaModelv2Factory init() {
		try {
			MetaModelv2Factory theMetaModelv2Factory = (MetaModelv2Factory) EPackage.Registry.INSTANCE
					.getEFactory(MetaModelv2Package.eNS_URI);
			if (theMetaModelv2Factory != null) {
				return theMetaModelv2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaModelv2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelv2FactoryImpl() {
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
		case MetaModelv2Package.STAGE:
			return createStage();
		case MetaModelv2Package.DATA_FLOW_GUARD:
			return createdataFlowGuard();
		case MetaModelv2Package.PROCESS_FLOW_GUARD:
			return createprocessFlowGuard();
		case MetaModelv2Package.MILESTONE:
			return createmilestone();
		case MetaModelv2Package.FAULT_LOGGER:
			return createfaultLogger();
		case MetaModelv2Package.MODEL:
			return createModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public faultLogger createfaultLogger() {
		faultLoggerImpl faultLogger = new faultLoggerImpl();
		return faultLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelv2Package getMetaModelv2Package() {
		return (MetaModelv2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaModelv2Package getPackage() {
		return MetaModelv2Package.eINSTANCE;
	}

} //MetaModelv2FactoryImpl
