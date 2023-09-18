/**
 */
package metaModelv2;

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
 * @see metaModelv2.MetaModelv2Factory
 * @model kind="package"
 * @generated
 */
public interface MetaModelv2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModelv2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metaModelv2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModelv2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelv2Package eINSTANCE = metaModelv2.impl.MetaModelv2PackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModelv2.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelv2.impl.StageImpl
	 * @see metaModelv2.impl.MetaModelv2PackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__EXECUTION_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Execution Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__EXECUTION_OUTCOME = 2;

	/**
	 * The feature id for the '<em><b>Execution Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__EXECUTION_COMPLIANCE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__WEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Severity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__SEVERITY_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Processflowguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__PROCESSFLOWGUARD = 6;

	/**
	 * The feature id for the '<em><b>Dataflowguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__DATAFLOWGUARD = 7;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__MILESTONE = 8;

	/**
	 * The feature id for the '<em><b>Faultlogger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__FAULTLOGGER = 9;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STAGE = 10;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelv2.impl.dataFlowGuardImpl <em>data Flow Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelv2.impl.dataFlowGuardImpl
	 * @see metaModelv2.impl.MetaModelv2PackageImpl#getdataFlowGuard()
	 * @generated
	 */
	int DATA_FLOW_GUARD = 1;

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
	 * The meta object id for the '{@link metaModelv2.impl.processFlowGuardImpl <em>process Flow Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelv2.impl.processFlowGuardImpl
	 * @see metaModelv2.impl.MetaModelv2PackageImpl#getprocessFlowGuard()
	 * @generated
	 */
	int PROCESS_FLOW_GUARD = 2;

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
	 * The meta object id for the '{@link metaModelv2.impl.milestoneImpl <em>milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelv2.impl.milestoneImpl
	 * @see metaModelv2.impl.MetaModelv2PackageImpl#getmilestone()
	 * @generated
	 */
	int MILESTONE = 3;

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
	 * The meta object id for the '{@link metaModelv2.impl.faultLoggerImpl <em>fault Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelv2.impl.faultLoggerImpl
	 * @see metaModelv2.impl.MetaModelv2PackageImpl#getfaultLogger()
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
	 * The meta object id for the '{@link metaModelv2.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelv2.impl.ModelImpl
	 * @see metaModelv2.impl.MetaModelv2PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link metaModelv2.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see metaModelv2.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.Stage#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModelv2.Stage#getLabel()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Label();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.Stage#getExecutionStatus <em>Execution Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Status</em>'.
	 * @see metaModelv2.Stage#getExecutionStatus()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_ExecutionStatus();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.Stage#getExecutionOutcome <em>Execution Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Outcome</em>'.
	 * @see metaModelv2.Stage#getExecutionOutcome()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_ExecutionOutcome();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.Stage#getExecutionCompliance <em>Execution Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Compliance</em>'.
	 * @see metaModelv2.Stage#getExecutionCompliance()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_ExecutionCompliance();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.Stage#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see metaModelv2.Stage#getWeight()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Weight();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.Stage#getSeverityLevel <em>Severity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Level</em>'.
	 * @see metaModelv2.Stage#getSeverityLevel()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_SeverityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelv2.Stage#getProcessflowguard <em>Processflowguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processflowguard</em>'.
	 * @see metaModelv2.Stage#getProcessflowguard()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Processflowguard();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelv2.Stage#getDataflowguard <em>Dataflowguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflowguard</em>'.
	 * @see metaModelv2.Stage#getDataflowguard()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Dataflowguard();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelv2.Stage#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestone</em>'.
	 * @see metaModelv2.Stage#getMilestone()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Milestone();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelv2.Stage#getFaultlogger <em>Faultlogger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faultlogger</em>'.
	 * @see metaModelv2.Stage#getFaultlogger()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Faultlogger();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelv2.Stage#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see metaModelv2.Stage#getStage()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Stage();

	/**
	 * Returns the meta object for class '{@link metaModelv2.dataFlowGuard <em>data Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>data Flow Guard</em>'.
	 * @see metaModelv2.dataFlowGuard
	 * @generated
	 */
	EClass getdataFlowGuard();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.dataFlowGuard#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModelv2.dataFlowGuard#getLabel()
	 * @see #getdataFlowGuard()
	 * @generated
	 */
	EAttribute getdataFlowGuard_Label();

	/**
	 * Returns the meta object for class '{@link metaModelv2.processFlowGuard <em>process Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>process Flow Guard</em>'.
	 * @see metaModelv2.processFlowGuard
	 * @generated
	 */
	EClass getprocessFlowGuard();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.processFlowGuard#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModelv2.processFlowGuard#getLabel()
	 * @see #getprocessFlowGuard()
	 * @generated
	 */
	EAttribute getprocessFlowGuard_Label();

	/**
	 * Returns the meta object for class '{@link metaModelv2.milestone <em>milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>milestone</em>'.
	 * @see metaModelv2.milestone
	 * @generated
	 */
	EClass getmilestone();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.milestone#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModelv2.milestone#getLabel()
	 * @see #getmilestone()
	 * @generated
	 */
	EAttribute getmilestone_Label();

	/**
	 * Returns the meta object for class '{@link metaModelv2.faultLogger <em>fault Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fault Logger</em>'.
	 * @see metaModelv2.faultLogger
	 * @generated
	 */
	EClass getfaultLogger();

	/**
	 * Returns the meta object for the attribute '{@link metaModelv2.faultLogger#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaModelv2.faultLogger#getLabel()
	 * @see #getfaultLogger()
	 * @generated
	 */
	EAttribute getfaultLogger_Label();

	/**
	 * Returns the meta object for class '{@link metaModelv2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see metaModelv2.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelv2Factory getMetaModelv2Factory();

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
		 * The meta object literal for the '{@link metaModelv2.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelv2.impl.StageImpl
		 * @see metaModelv2.impl.MetaModelv2PackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__LABEL = eINSTANCE.getStage_Label();

		/**
		 * The meta object literal for the '<em><b>Execution Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__EXECUTION_STATUS = eINSTANCE.getStage_ExecutionStatus();

		/**
		 * The meta object literal for the '<em><b>Execution Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__EXECUTION_OUTCOME = eINSTANCE.getStage_ExecutionOutcome();

		/**
		 * The meta object literal for the '<em><b>Execution Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__EXECUTION_COMPLIANCE = eINSTANCE.getStage_ExecutionCompliance();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__WEIGHT = eINSTANCE.getStage_Weight();

		/**
		 * The meta object literal for the '<em><b>Severity Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__SEVERITY_LEVEL = eINSTANCE.getStage_SeverityLevel();

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
		 * The meta object literal for the '{@link metaModelv2.impl.dataFlowGuardImpl <em>data Flow Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelv2.impl.dataFlowGuardImpl
		 * @see metaModelv2.impl.MetaModelv2PackageImpl#getdataFlowGuard()
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
		 * The meta object literal for the '{@link metaModelv2.impl.processFlowGuardImpl <em>process Flow Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelv2.impl.processFlowGuardImpl
		 * @see metaModelv2.impl.MetaModelv2PackageImpl#getprocessFlowGuard()
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
		 * The meta object literal for the '{@link metaModelv2.impl.milestoneImpl <em>milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelv2.impl.milestoneImpl
		 * @see metaModelv2.impl.MetaModelv2PackageImpl#getmilestone()
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
		 * The meta object literal for the '{@link metaModelv2.impl.faultLoggerImpl <em>fault Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelv2.impl.faultLoggerImpl
		 * @see metaModelv2.impl.MetaModelv2PackageImpl#getfaultLogger()
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

		/**
		 * The meta object literal for the '{@link metaModelv2.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelv2.impl.ModelImpl
		 * @see metaModelv2.impl.MetaModelv2PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

	}

} //MetaModelv2Package
