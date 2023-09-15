/**
 */
package metaModel;

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
 *   <li>{@link metaModel.Stage#getProcessflowguard <em>Processflowguard</em>}</li>
 *   <li>{@link metaModel.Stage#getDataflowguard <em>Dataflowguard</em>}</li>
 *   <li>{@link metaModel.Stage#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link metaModel.Stage#getFaultlogger <em>Faultlogger</em>}</li>
 *   <li>{@link metaModel.Stage#getStage <em>Stage</em>}</li>
 *   <li>{@link metaModel.Stage#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Processflowguard</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.processFlowGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processflowguard</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getStage_Processflowguard()
	 * @model containment="true"
	 * @generated
	 */
	EList<processFlowGuard> getProcessflowguard();

	/**
	 * Returns the value of the '<em><b>Dataflowguard</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.dataFlowGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflowguard</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getStage_Dataflowguard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<dataFlowGuard> getDataflowguard();

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.milestone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getStage_Milestone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<milestone> getMilestone();

	/**
	 * Returns the value of the '<em><b>Faultlogger</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.faultLogger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultlogger</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getStage_Faultlogger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<faultLogger> getFaultlogger();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getStage_Stage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStage();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see metaModel.MetaModelPackage#getStage_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link metaModel.Stage#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Stage
