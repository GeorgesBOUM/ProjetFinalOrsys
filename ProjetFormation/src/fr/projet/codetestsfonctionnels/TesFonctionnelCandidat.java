package fr.projet.codetestsfonctionnels;

import fr.projet.codeclasses.Candidat;

public class TesFonctionnelCandidat {

	public static void main(String[] args) {
		try {
			Candidat candidatUn = new Candidat(0, "nom", "departement");
			System.out.println(candidatUn);
		} catch (IllegalArgumentException e) {
			System.out.println("id <= 0");
		}
		
		try {
			Candidat candidatDeux = new Candidat(-3, "nom", "departement");
			System.out.println(candidatDeux);
		} catch (IllegalArgumentException e) {
			System.out.println("id <= 0");
		}
		
		try {
			Candidat candidatTrois = new Candidat(10, "nom", "departement");
			System.out.println(candidatTrois);
		} catch (IllegalArgumentException e) {
			System.out.println("id <= 0");
		}
		
	}

}
