/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.InputArc#getTo <em>To</em>}</li>
 *   <li>{@link petrinet.InputArc#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getInputArc()
 * @model
 * @generated
 */
public interface InputArc extends Arc {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Transition)
	 * @see petrinet.PetrinetPackage#getInputArc_To()
	 * @model required="true"
	 *        annotation="genmymodel uuid='_6uBPgG1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	Transition getTo();

	/**
	 * Sets the value of the '{@link petrinet.InputArc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Transition value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Place)
	 * @see petrinet.PetrinetPackage#getInputArc_From()
	 * @model required="true"
	 *        annotation="genmymodel uuid='_HIM4QG1aEDSyHe76t7Tw1A'"
	 * @generated
	 */
	Place getFrom();

	/**
	 * Sets the value of the '{@link petrinet.InputArc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Place value);

} // InputArc
