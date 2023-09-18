/**
 */
package metaModelv2.impl;

import java.util.Collection;

import metaModelv2.MetaModelv2Package;
import metaModelv2.Stage;
import metaModelv2.dataFlowGuard;
import metaModelv2.faultLogger;
import metaModelv2.milestone;
import metaModelv2.processFlowGuard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModelv2.impl.StageImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getExecutionStatus <em>Execution Status</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getExecutionOutcome <em>Execution Outcome</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getExecutionCompliance <em>Execution Compliance</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getSeverityLevel <em>Severity Level</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getProcessflowguard <em>Processflowguard</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getDataflowguard <em>Dataflowguard</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getFaultlogger <em>Faultlogger</em>}</li>
 *   <li>{@link metaModelv2.impl.StageImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionStatus() <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionStatus() <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStatus()
	 * @generated
	 * @ordered
	 */
	protected String executionStatus = EXECUTION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionOutcome() <em>Execution Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOutcome()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_OUTCOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionOutcome() <em>Execution Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOutcome()
	 * @generated
	 * @ordered
	 */
	protected String executionOutcome = EXECUTION_OUTCOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionCompliance() <em>Execution Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_COMPLIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionCompliance() <em>Execution Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCompliance()
	 * @generated
	 * @ordered
	 */
	protected String executionCompliance = EXECUTION_COMPLIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverityLevel() <em>Severity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int SEVERITY_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeverityLevel() <em>Severity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityLevel()
	 * @generated
	 * @ordered
	 */
	protected int severityLevel = SEVERITY_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessflowguard() <em>Processflowguard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessflowguard()
	 * @generated
	 * @ordered
	 */
	protected EList<processFlowGuard> processflowguard;

	/**
	 * The cached value of the '{@link #getDataflowguard() <em>Dataflowguard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflowguard()
	 * @generated
	 * @ordered
	 */
	protected EList<dataFlowGuard> dataflowguard;

	/**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected EList<milestone> milestone;

	/**
	 * The cached value of the '{@link #getFaultlogger() <em>Faultlogger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultlogger()
	 * @generated
	 * @ordered
	 */
	protected EList<faultLogger> faultlogger;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelv2Package.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelv2Package.STAGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionStatus() {
		return executionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStatus(String newExecutionStatus) {
		String oldExecutionStatus = executionStatus;
		executionStatus = newExecutionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelv2Package.STAGE__EXECUTION_STATUS,
					oldExecutionStatus, executionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionOutcome() {
		return executionOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionOutcome(String newExecutionOutcome) {
		String oldExecutionOutcome = executionOutcome;
		executionOutcome = newExecutionOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelv2Package.STAGE__EXECUTION_OUTCOME,
					oldExecutionOutcome, executionOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionCompliance() {
		return executionCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionCompliance(String newExecutionCompliance) {
		String oldExecutionCompliance = executionCompliance;
		executionCompliance = newExecutionCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelv2Package.STAGE__EXECUTION_COMPLIANCE,
					oldExecutionCompliance, executionCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelv2Package.STAGE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeverityLevel() {
		return severityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityLevel(int newSeverityLevel) {
		int oldSeverityLevel = severityLevel;
		severityLevel = newSeverityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelv2Package.STAGE__SEVERITY_LEVEL,
					oldSeverityLevel, severityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<processFlowGuard> getProcessflowguard() {
		if (processflowguard == null) {
			processflowguard = new EObjectContainmentEList<processFlowGuard>(processFlowGuard.class, this,
					MetaModelv2Package.STAGE__PROCESSFLOWGUARD);
		}
		return processflowguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dataFlowGuard> getDataflowguard() {
		if (dataflowguard == null) {
			dataflowguard = new EObjectContainmentEList<dataFlowGuard>(dataFlowGuard.class, this,
					MetaModelv2Package.STAGE__DATAFLOWGUARD);
		}
		return dataflowguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<milestone> getMilestone() {
		if (milestone == null) {
			milestone = new EObjectContainmentEList<milestone>(milestone.class, this,
					MetaModelv2Package.STAGE__MILESTONE);
		}
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<faultLogger> getFaultlogger() {
		if (faultlogger == null) {
			faultlogger = new EObjectContainmentEList<faultLogger>(faultLogger.class, this,
					MetaModelv2Package.STAGE__FAULTLOGGER);
		}
		return faultlogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stage> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentEList<Stage>(Stage.class, this, MetaModelv2Package.STAGE__STAGE);
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelv2Package.STAGE__PROCESSFLOWGUARD:
			return ((InternalEList<?>) getProcessflowguard()).basicRemove(otherEnd, msgs);
		case MetaModelv2Package.STAGE__DATAFLOWGUARD:
			return ((InternalEList<?>) getDataflowguard()).basicRemove(otherEnd, msgs);
		case MetaModelv2Package.STAGE__MILESTONE:
			return ((InternalEList<?>) getMilestone()).basicRemove(otherEnd, msgs);
		case MetaModelv2Package.STAGE__FAULTLOGGER:
			return ((InternalEList<?>) getFaultlogger()).basicRemove(otherEnd, msgs);
		case MetaModelv2Package.STAGE__STAGE:
			return ((InternalEList<?>) getStage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelv2Package.STAGE__LABEL:
			return getLabel();
		case MetaModelv2Package.STAGE__EXECUTION_STATUS:
			return getExecutionStatus();
		case MetaModelv2Package.STAGE__EXECUTION_OUTCOME:
			return getExecutionOutcome();
		case MetaModelv2Package.STAGE__EXECUTION_COMPLIANCE:
			return getExecutionCompliance();
		case MetaModelv2Package.STAGE__WEIGHT:
			return getWeight();
		case MetaModelv2Package.STAGE__SEVERITY_LEVEL:
			return getSeverityLevel();
		case MetaModelv2Package.STAGE__PROCESSFLOWGUARD:
			return getProcessflowguard();
		case MetaModelv2Package.STAGE__DATAFLOWGUARD:
			return getDataflowguard();
		case MetaModelv2Package.STAGE__MILESTONE:
			return getMilestone();
		case MetaModelv2Package.STAGE__FAULTLOGGER:
			return getFaultlogger();
		case MetaModelv2Package.STAGE__STAGE:
			return getStage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelv2Package.STAGE__LABEL:
			setLabel((String) newValue);
			return;
		case MetaModelv2Package.STAGE__EXECUTION_STATUS:
			setExecutionStatus((String) newValue);
			return;
		case MetaModelv2Package.STAGE__EXECUTION_OUTCOME:
			setExecutionOutcome((String) newValue);
			return;
		case MetaModelv2Package.STAGE__EXECUTION_COMPLIANCE:
			setExecutionCompliance((String) newValue);
			return;
		case MetaModelv2Package.STAGE__WEIGHT:
			setWeight((Integer) newValue);
			return;
		case MetaModelv2Package.STAGE__SEVERITY_LEVEL:
			setSeverityLevel((Integer) newValue);
			return;
		case MetaModelv2Package.STAGE__PROCESSFLOWGUARD:
			getProcessflowguard().clear();
			getProcessflowguard().addAll((Collection<? extends processFlowGuard>) newValue);
			return;
		case MetaModelv2Package.STAGE__DATAFLOWGUARD:
			getDataflowguard().clear();
			getDataflowguard().addAll((Collection<? extends dataFlowGuard>) newValue);
			return;
		case MetaModelv2Package.STAGE__MILESTONE:
			getMilestone().clear();
			getMilestone().addAll((Collection<? extends milestone>) newValue);
			return;
		case MetaModelv2Package.STAGE__FAULTLOGGER:
			getFaultlogger().clear();
			getFaultlogger().addAll((Collection<? extends faultLogger>) newValue);
			return;
		case MetaModelv2Package.STAGE__STAGE:
			getStage().clear();
			getStage().addAll((Collection<? extends Stage>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaModelv2Package.STAGE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case MetaModelv2Package.STAGE__EXECUTION_STATUS:
			setExecutionStatus(EXECUTION_STATUS_EDEFAULT);
			return;
		case MetaModelv2Package.STAGE__EXECUTION_OUTCOME:
			setExecutionOutcome(EXECUTION_OUTCOME_EDEFAULT);
			return;
		case MetaModelv2Package.STAGE__EXECUTION_COMPLIANCE:
			setExecutionCompliance(EXECUTION_COMPLIANCE_EDEFAULT);
			return;
		case MetaModelv2Package.STAGE__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case MetaModelv2Package.STAGE__SEVERITY_LEVEL:
			setSeverityLevel(SEVERITY_LEVEL_EDEFAULT);
			return;
		case MetaModelv2Package.STAGE__PROCESSFLOWGUARD:
			getProcessflowguard().clear();
			return;
		case MetaModelv2Package.STAGE__DATAFLOWGUARD:
			getDataflowguard().clear();
			return;
		case MetaModelv2Package.STAGE__MILESTONE:
			getMilestone().clear();
			return;
		case MetaModelv2Package.STAGE__FAULTLOGGER:
			getFaultlogger().clear();
			return;
		case MetaModelv2Package.STAGE__STAGE:
			getStage().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaModelv2Package.STAGE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case MetaModelv2Package.STAGE__EXECUTION_STATUS:
			return EXECUTION_STATUS_EDEFAULT == null ? executionStatus != null
					: !EXECUTION_STATUS_EDEFAULT.equals(executionStatus);
		case MetaModelv2Package.STAGE__EXECUTION_OUTCOME:
			return EXECUTION_OUTCOME_EDEFAULT == null ? executionOutcome != null
					: !EXECUTION_OUTCOME_EDEFAULT.equals(executionOutcome);
		case MetaModelv2Package.STAGE__EXECUTION_COMPLIANCE:
			return EXECUTION_COMPLIANCE_EDEFAULT == null ? executionCompliance != null
					: !EXECUTION_COMPLIANCE_EDEFAULT.equals(executionCompliance);
		case MetaModelv2Package.STAGE__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case MetaModelv2Package.STAGE__SEVERITY_LEVEL:
			return severityLevel != SEVERITY_LEVEL_EDEFAULT;
		case MetaModelv2Package.STAGE__PROCESSFLOWGUARD:
			return processflowguard != null && !processflowguard.isEmpty();
		case MetaModelv2Package.STAGE__DATAFLOWGUARD:
			return dataflowguard != null && !dataflowguard.isEmpty();
		case MetaModelv2Package.STAGE__MILESTONE:
			return milestone != null && !milestone.isEmpty();
		case MetaModelv2Package.STAGE__FAULTLOGGER:
			return faultlogger != null && !faultlogger.isEmpty();
		case MetaModelv2Package.STAGE__STAGE:
			return stage != null && !stage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Label: ");
		result.append(label);
		result.append(", executionStatus: ");
		result.append(executionStatus);
		result.append(", executionOutcome: ");
		result.append(executionOutcome);
		result.append(", executionCompliance: ");
		result.append(executionCompliance);
		result.append(", weight: ");
		result.append(weight);
		result.append(", severityLevel: ");
		result.append(severityLevel);
		result.append(')');
		return result.toString();
	}

} //StageImpl
