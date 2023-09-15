/**
 */
package metaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.NestedStage#getLabel <em>Label</em>}</li>
 *   <li>{@link metaModel.NestedStage#getNestedstage <em>Nestedstage</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getNestedStage()
 * @model
 * @generated
 */
public interface NestedStage extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see metaModel.MetaModelPackage#getNestedStage_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link metaModel.NestedStage#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Nestedstage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nestedstage</em>' containment reference.
	 * @see #setNestedstage(NestedStage)
	 * @see metaModel.MetaModelPackage#getNestedStage_Nestedstage()
	 * @model containment="true"
	 * @generated
	 */
	NestedStage getNestedstage();

	/**
	 * Sets the value of the '{@link metaModel.NestedStage#getNestedstage <em>Nestedstage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nestedstage</em>' containment reference.
	 * @see #getNestedstage()
	 * @generated
	 */
	void setNestedstage(NestedStage value);

} // NestedStage
