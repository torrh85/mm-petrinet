/**
 */
package petrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinet.InputArc;
import petrinet.OutputArc;
import petrinet.PetriNet;
import petrinet.PetriNetRelationship;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetFactoryImpl extends EFactoryImpl implements PetrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetFactory init() {
		try {
			PetrinetFactory thePetrinetFactory = (PetrinetFactory)EPackage.Registry.INSTANCE.getEFactory(PetrinetPackage.eNS_URI);
			if (thePetrinetFactory != null) {
				return thePetrinetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PetrinetPackage.SYSTEM: return createSystem();
			case PetrinetPackage.PETRI_NET: return createPetriNet();
			case PetrinetPackage.PETRI_NET_RELATIONSHIP: return createPetriNetRelationship();
			case PetrinetPackage.PLACE: return createPlace();
			case PetrinetPackage.TRANSITION: return createTransition();
			case PetrinetPackage.OUTPUT_ARC: return createOutputArc();
			case PetrinetPackage.INPUT_ARC: return createInputArc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public petrinet.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetRelationship createPetriNetRelationship() {
		PetriNetRelationshipImpl petriNetRelationship = new PetriNetRelationshipImpl();
		return petriNetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputArc createOutputArc() {
		OutputArcImpl outputArc = new OutputArcImpl();
		return outputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputArc createInputArc() {
		InputArcImpl inputArc = new InputArcImpl();
		return inputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetPackage getPetrinetPackage() {
		return (PetrinetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetPackage getPackage() {
		return PetrinetPackage.eINSTANCE;
	}

} //PetrinetFactoryImpl
