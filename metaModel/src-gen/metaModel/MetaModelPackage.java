/**
 */
package metaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelPackage eINSTANCE = metaModel.impl.MetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.impl.dataFlowGuardImpl <em>data Flow Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.dataFlowGuardImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getdataFlowGuard()
	 * @generated
	 */
	int DATA_FLOW_GUARD = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD__LABEL = 0;

	/**
	 * The number of structural features of the '<em>data Flow Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>data Flow Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.processFlowGuardImpl <em>process Flow Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.processFlowGuardImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getprocessFlowGuard()
	 * @generated
	 */
	int PROCESS_FLOW_GUARD = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD__LABEL = 0;

	/**
	 * The number of structural features of the '<em>process Flow Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>process Flow Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FLOW_GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.milestoneImpl <em>milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.milestoneImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getmilestone()
	 * @generated
	 */
	int MILESTONE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.StageImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 3;

	/**
	 * The feature id for the '<em><b>Processflowguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__PROCESSFLOWGUARD = 0;

	/**
	 * The feature id for the '<em><b>Dataflowguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__DATAFLOWGUARD = 1;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__MILESTONE = 2;

	/**
	 * The feature id for the '<em><b>Faultlogger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__FAULTLOGGER = 3;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STAGE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__LABEL = 5;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.impl.faultLoggerImpl <em>fault Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.faultLoggerImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getfaultLogger()
	 * @generated
	 */
	int FAULT_LOGGER = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER__LABEL = 0;

	/**
	 * The number of structural features of the '<em>fault Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>fault Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_LOGGER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link metaModel.dataFlowGuard <em>data Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>data Flow Guard</em>'.
	 * @see metaModel.dataFlowGuard
	 * @generated
	 */
	EClass getdataFlowGuard();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.dataFlowGuard#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModel.dataFlowGuard#getLabel()
	 * @see #getdataFlowGuard()
	 * @generated
	 */
	EAttribute getdataFlowGuard_Label();

	/**
	 * Returns the meta object for class '{@link metaModel.processFlowGuard <em>process Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>process Flow Guard</em>'.
	 * @see metaModel.processFlowGuard
	 * @generated
	 */
	EClass getprocessFlowGuard();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.processFlowGuard#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModel.processFlowGuard#getLabel()
	 * @see #getprocessFlowGuard()
	 * @generated
	 */
	EAttribute getprocessFlowGuard_Label();

	/**
	 * Returns the meta object for class '{@link metaModel.milestone <em>milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>milestone</em>'.
	 * @see metaModel.milestone
	 * @generated
	 */
	EClass getmilestone();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.milestone#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModel.milestone#getLabel()
	 * @see #getmilestone()
	 * @generated
	 */
	EAttribute getmilestone_Label();

	/**
	 * Returns the meta object for class '{@link metaModel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see metaModel.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Stage#getProcessflowguard <em>Processflowguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processflowguard</em>'.
	 * @see metaModel.Stage#getProcessflowguard()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Processflowguard();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Stage#getDataflowguard <em>Dataflowguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflowguard</em>'.
	 * @see metaModel.Stage#getDataflowguard()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Dataflowguard();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Stage#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestone</em>'.
	 * @see metaModel.Stage#getMilestone()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Milestone();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Stage#getFaultlogger <em>Faultlogger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faultlogger</em>'.
	 * @see metaModel.Stage#getFaultlogger()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Faultlogger();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.Stage#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see metaModel.Stage#getStage()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Stage();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.Stage#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModel.Stage#getLabel()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Label();

	/**
	 * Returns the meta object for class '{@link metaModel.faultLogger <em>fault Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fault Logger</em>'.
	 * @see metaModel.faultLogger
	 * @generated
	 */
	EClass getfaultLogger();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.faultLogger#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModel.faultLogger#getLabel()
	 * @see #getfaultLogger()
	 * @generated
	 */
	EAttribute getfaultLogger_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelFactory getMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModel.impl.dataFlowGuardImpl <em>data Flow Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.dataFlowGuardImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getdataFlowGuard()
		 * @generated
		 */
		EClass DATA_FLOW_GUARD = eINSTANCE.getdataFlowGuard();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_GUARD__LABEL = eINSTANCE.getdataFlowGuard_Label();

		/**
		 * The meta object literal for the '{@link metaModel.impl.processFlowGuardImpl <em>process Flow Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.processFlowGuardImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getprocessFlowGuard()
		 * @generated
		 */
		EClass PROCESS_FLOW_GUARD = eINSTANCE.getprocessFlowGuard();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_FLOW_GUARD__LABEL = eINSTANCE.getprocessFlowGuard_Label();

		/**
		 * The meta object literal for the '{@link metaModel.impl.milestoneImpl <em>milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.milestoneImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getmilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getmilestone();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__LABEL = eINSTANCE.getmilestone_Label();

		/**
		 * The meta object literal for the '{@link metaModel.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.StageImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Processflowguard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__PROCESSFLOWGUARD = eINSTANCE.getStage_Processflowguard();

		/**
		 * The meta object literal for the '<em><b>Dataflowguard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__DATAFLOWGUARD = eINSTANCE.getStage_Dataflowguard();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__MILESTONE = eINSTANCE.getStage_Milestone();

		/**
		 * The meta object literal for the '<em><b>Faultlogger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__FAULTLOGGER = eINSTANCE.getStage_Faultlogger();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STAGE = eINSTANCE.getStage_Stage();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__LABEL = eINSTANCE.getStage_Label();

		/**
		 * The meta object literal for the '{@link metaModel.impl.faultLoggerImpl <em>fault Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.faultLoggerImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getfaultLogger()
		 * @generated
		 */
		EClass FAULT_LOGGER = eINSTANCE.getfaultLogger();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_LOGGER__LABEL = eINSTANCE.getfaultLogger_Label();

	}

} //MetaModelPackage
