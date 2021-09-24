package fr.projet.codetestsfonctionnels;

import fr.projet.codeclasses.Formateur;
import fr.projet.codeclasses.Formateur.Grade;

public class TestFonctionnelFormateur {

	public static void main(String[] args) {
		try {
			Formateur f1 = new Formateur("nom", "prenom", "specialité", Grade.JUNIOR );
			System.out.println(f1);
		} catch (IllegalArgumentException e) {
			System.out.println("Grade non existant");
		}

	}

}
