package fr.projet.codetestsfonctionnels;

import fr.projet.codeclasses.Session;
import fr.projet.codeclasses.Session.Mode;

public class TestFonctionnelSession {

	public static void main(String[] args) {
		try {
			Session s = new Session("05/07/21", "24/09/21", "titre", "orsys", Mode.DISTANCIEL);
		} catch (Exception e) {
			System.out.println("mode inexistant");
		}
	}

}
