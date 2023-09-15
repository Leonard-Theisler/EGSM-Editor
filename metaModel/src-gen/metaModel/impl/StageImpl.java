/**
 */
package metaModel.impl;

import java.util.Collection;

import metaModel.MetaModelPackage;
import metaModel.Stage;
import metaModel.dataFlowGuard;
import metaModel.faultLogger;
import metaModel.milestone;
import metaModel.processFlowGuard;

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
 *   <li>{@link metaModel.impl.StageImpl#getProcessflowguard <em>Processflowguard</em>}</li>
 *   <li>{@link metaModel.impl.StageImpl#getDataflowguard <em>Dataflowguard</em>}</li>
 *   <li>{@link metaModel.impl.StageImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link metaModel.impl.StageImpl#getFaultlogger <em>Faultlogger</em>}</li>
 *   <li>{@link metaModel.impl.StageImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link metaModel.impl.StageImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage {
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
		return MetaModelPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<processFlowGuard> getProcessflowguard() {
		if (processflowguard == null) {
			processflowguard = new EObjectContainmentEList<processFlowGuard>(processFlowGuard.class, this,
					MetaModelPackage.STAGE__PROCESSFLOWGUARD);
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
					MetaModelPackage.STAGE__DATAFLOWGUARD);
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
					MetaModelPackage.STAGE__MILESTONE);
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
					MetaModelPackage.STAGE__FAULTLOGGER);
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
			stage = new EObjectContainmentEList<Stage>(Stage.class, this, MetaModelPackage.STAGE__STAGE);
		}
		return stage;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.STAGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelPackage.STAGE__PROCESSFLOWGUARD:
			return ((InternalEList<?>) getProcessflowguard()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.STAGE__DATAFLOWGUARD:
			return ((InternalEList<?>) getDataflowguard()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.STAGE__MILESTONE:
			return ((InternalEList<?>) getMilestone()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.STAGE__FAULTLOGGER:
			return ((InternalEList<?>) getFaultlogger()).basicRemove(otherEnd, msgs);
		case MetaModelPackage.STAGE__STAGE:
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
		case MetaModelPackage.STAGE__PROCESSFLOWGUARD:
			return getProcessflowguard();
		case MetaModelPackage.STAGE__DATAFLOWGUARD:
			return getDataflowguard();
		case MetaModelPackage.STAGE__MILESTONE:
			return getMilestone();
		case MetaModelPackage.STAGE__FAULTLOGGER:
			return getFaultlogger();
		case MetaModelPackage.STAGE__STAGE:
			return getStage();
		case MetaModelPackage.STAGE__LABEL:
			return getLabel();
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
		case MetaModelPackage.STAGE__PROCESSFLOWGUARD:
			getProcessflowguard().clear();
			getProcessflowguard().addAll((Collection<? extends processFlowGuard>) newValue);
			return;
		case MetaModelPackage.STAGE__DATAFLOWGUARD:
			getDataflowguard().clear();
			getDataflowguard().addAll((Collection<? extends dataFlowGuard>) newValue);
			return;
		case MetaModelPackage.STAGE__MILESTONE:
			getMilestone().clear();
			getMilestone().addAll((Collection<? extends milestone>) newValue);
			return;
		case MetaModelPackage.STAGE__FAULTLOGGER:
			getFaultlogger().clear();
			getFaultlogger().addAll((Collection<? extends faultLogger>) newValue);
			return;
		case MetaModelPackage.STAGE__STAGE:
			getStage().clear();
			getStage().addAll((Collection<? extends Stage>) newValue);
			return;
		case MetaModelPackage.STAGE__LABEL:
			setLabel((String) newValue);
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
		case MetaModelPackage.STAGE__PROCESSFLOWGUARD:
			getProcessflowguard().clear();
			return;
		case MetaModelPackage.STAGE__DATAFLOWGUARD:
			getDataflowguard().clear();
			return;
		case MetaModelPackage.STAGE__MILESTONE:
			getMilestone().clear();
			return;
		case MetaModelPackage.STAGE__FAULTLOGGER:
			getFaultlogger().clear();
			return;
		case MetaModelPackage.STAGE__STAGE:
			getStage().clear();
			return;
		case MetaModelPackage.STAGE__LABEL:
			setLabel(LABEL_EDEFAULT);
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
		case MetaModelPackage.STAGE__PROCESSFLOWGUARD:
			return processflowguard != null && !processflowguard.isEmpty();
		case MetaModelPackage.STAGE__DATAFLOWGUARD:
			return dataflowguard != null && !dataflowguard.isEmpty();
		case MetaModelPackage.STAGE__MILESTONE:
			return milestone != null && !milestone.isEmpty();
		case MetaModelPackage.STAGE__FAULTLOGGER:
			return faultlogger != null && !faultlogger.isEmpty();
		case MetaModelPackage.STAGE__STAGE:
			return stage != null && !stage.isEmpty();
		case MetaModelPackage.STAGE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(')');
		return result.toString();
	}

} //StageImpl
