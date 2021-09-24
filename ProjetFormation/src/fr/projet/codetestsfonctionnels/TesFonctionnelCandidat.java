package fr.projet.codetestsfonctionnels;

import fr.projet.codeclasses.Candidat;

public class TesFonctionnelCandidat {

	public static void main(String[] args) {
		try {
			Candidat candidatUn = new Candidat(0, "nom", "departement");
			Candidat candidatDeux = new Candidat(-3, "nom", "departement");
			Candidat candidatTrois = new Candidat(10, "nom", "departement");
		} catch (IllegalArgumentException e) {
			System.out.println("id <= 0");
		}
		
	}

}
