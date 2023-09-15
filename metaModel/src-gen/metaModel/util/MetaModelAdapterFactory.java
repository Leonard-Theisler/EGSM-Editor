/**
 */
package metaModel.util;

import metaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelPackage
 * @generated
 */
public class MetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelSwitch<Adapter> modelSwitch = new MetaModelSwitch<Adapter>() {
		@Override
		public Adapter casedataFlowGuard(dataFlowGuard object) {
			return createdataFlowGuardAdapter();
		}

		@Override
		public Adapter caseprocessFlowGuard(processFlowGuard object) {
			return createprocessFlowGuardAdapter();
		}

		@Override
		public Adapter casemilestone(milestone object) {
			return createmilestoneAdapter();
		}

		@Override
		public Adapter caseStage(Stage object) {
			return createStageAdapter();
		}

		@Override
		public Adapter casefaultLogger(faultLogger object) {
			return createfaultLoggerAdapter();
		}

		@Override
		public Adapter caseNestedStage(NestedStage object) {
			return createNestedStageAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.dataFlowGuard <em>data Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.dataFlowGuard
	 * @generated
	 */
	public Adapter createdataFlowGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.processFlowGuard <em>process Flow Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.processFlowGuard
	 * @generated
	 */
	public Adapter createprocessFlowGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.milestone <em>milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.milestone
	 * @generated
	 */
	public Adapter createmilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.Stage
	 * @generated
	 */
	public Adapter createStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.faultLogger <em>fault Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.faultLogger
	 * @generated
	 */
	public Adapter createfaultLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModel.NestedStage <em>Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModel.NestedStage
	 * @generated
	 */
	public Adapter createNestedStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaModelAdapterFactory
