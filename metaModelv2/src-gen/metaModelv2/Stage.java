/**
 */
package metaModelv2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelv2.Stage#getLabel <em>Label</em>}</li>
 *   <li>{@link metaModelv2.Stage#getExecutionStatus <em>Execution Status</em>}</li>
 *   <li>{@link metaModelv2.Stage#getExecutionOutcome <em>Execution Outcome</em>}</li>
 *   <li>{@link metaModelv2.Stage#getExecutionCompliance <em>Execution Compliance</em>}</li>
 *   <li>{@link metaModelv2.Stage#getWeight <em>Weight</em>}</li>
 *   <li>{@link metaModelv2.Stage#getSeverityLevel <em>Severity Level</em>}</li>
 *   <li>{@link metaModelv2.Stage#getProcessflowguard <em>Processflowguard</em>}</li>
 *   <li>{@link metaModelv2.Stage#getDataflowguard <em>Dataflowguard</em>}</li>
 *   <li>{@link metaModelv2.Stage#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link metaModelv2.Stage#getFaultlogger <em>Faultlogger</em>}</li>
 *   <li>{@link metaModelv2.Stage#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see metaModelv2.MetaModelv2Package#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see metaModelv2.MetaModelv2Package#getStage_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link metaModelv2.Stage#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Status</em>' attribute.
	 * @see #setExecutionStatus(String)
	 * @see metaModelv2.MetaModelv2Package#getStage_ExecutionStatus()
	 * @model
	 * @generated
	 */
	String getExecutionStatus();

	/**
	 * Sets the value of the '{@link metaModelv2.Stage#getExecutionStatus <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Status</em>' attribute.
	 * @see #getExecutionStatus()
	 * @generated
	 */
	void setExecutionStatus(String value);

	/**
	 * Returns the value of the '<em><b>Execution Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Outcome</em>' attribute.
	 * @see #setExecutionOutcome(String)
	 * @see metaModelv2.MetaModelv2Package#getStage_ExecutionOutcome()
	 * @model
	 * @generated
	 */
	String getExecutionOutcome();

	/**
	 * Sets the value of the '{@link metaModelv2.Stage#getExecutionOutcome <em>Execution Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Outcome</em>' attribute.
	 * @see #getExecutionOutcome()
	 * @generated
	 */
	void setExecutionOutcome(String value);

	/**
	 * Returns the value of the '<em><b>Execution Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Compliance</em>' attribute.
	 * @see #setExecutionCompliance(String)
	 * @see metaModelv2.MetaModelv2Package#getStage_ExecutionCompliance()
	 * @model
	 * @generated
	 */
	String getExecutionCompliance();

	/**
	 * Sets the value of the '{@link metaModelv2.Stage#getExecutionCompliance <em>Execution Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Compliance</em>' attribute.
	 * @see #getExecutionCompliance()
	 * @generated
	 */
	void setExecutionCompliance(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see metaModelv2.MetaModelv2Package#getStage_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link metaModelv2.Stage#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Severity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity Level</em>' attribute.
	 * @see #setSeverityLevel(int)
	 * @see metaModelv2.MetaModelv2Package#getStage_SeverityLevel()
	 * @model
	 * @generated
	 */
	int getSeverityLevel();

	/**
	 * Sets the value of the '{@link metaModelv2.Stage#getSeverityLevel <em>Severity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity Level</em>' attribute.
	 * @see #getSeverityLevel()
	 * @generated
	 */
	void setSeverityLevel(int value);

	/**
	 * Returns the value of the '<em><b>Processflowguard</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelv2.processFlowGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processflowguard</em>' containment reference list.
	 * @see metaModelv2.MetaModelv2Package#getStage_Processflowguard()
	 * @model containment="true"
	 * @generated
	 */
	EList<processFlowGuard> getProcessflowguard();

	/**
	 * Returns the value of the '<em><b>Dataflowguard</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelv2.dataFlowGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflowguard</em>' containment reference list.
	 * @see metaModelv2.MetaModelv2Package#getStage_Dataflowguard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<dataFlowGuard> getDataflowguard();

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelv2.milestone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference list.
	 * @see metaModelv2.MetaModelv2Package#getStage_Milestone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<milestone> getMilestone();

	/**
	 * Returns the value of the '<em><b>Faultlogger</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelv2.faultLogger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultlogger</em>' containment reference list.
	 * @see metaModelv2.MetaModelv2Package#getStage_Faultlogger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<faultLogger> getFaultlogger();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelv2.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see metaModelv2.MetaModelv2Package#getStage_Stage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStage();

} // Stage
