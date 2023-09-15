/**
 */
package metaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelPackage
 * @generated
 */
public interface MetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelFactory eINSTANCE = metaModel.impl.MetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>data Flow Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>data Flow Guard</em>'.
	 * @generated
	 */
	dataFlowGuard createdataFlowGuard();

	/**
	 * Returns a new object of class '<em>process Flow Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>process Flow Guard</em>'.
	 * @generated
	 */
	processFlowGuard createprocessFlowGuard();

	/**
	 * Returns a new object of class '<em>milestone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>milestone</em>'.
	 * @generated
	 */
	milestone createmilestone();

	/**
	 * Returns a new object of class '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage</em>'.
	 * @generated
	 */
	Stage createStage();

	/**
	 * Returns a new object of class '<em>fault Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>fault Logger</em>'.
	 * @generated
	 */
	faultLogger createfaultLogger();

	/**
	 * Returns a new object of class '<em>Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Stage</em>'.
	 * @generated
	 */
	NestedStage createNestedStage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaModelPackage getMetaModelPackage();

} //MetaModelFactory
