package fr.projet.codetestsfonctionnels;

import fr.projet.codeclasses.Formateur;
import fr.projet.codeclasses.Formation;
import fr.projet.codeclasses.Formateur.Grade;

public class TestFonctionnelFormation {

	public static void main(String[] args) {
		Formateur formateur = new Formateur("nom", "prenom", "specialite", Grade.JUNIOR);
		try {
			Formation f1 = new Formation("ti", formateur, 200, 20);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Formation f2 = new Formation("titre", formateur, 99, 12);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Formation f3 = new Formation("titre", formateur, 200, 9);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
