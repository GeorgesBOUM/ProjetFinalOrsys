package fr.projet.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.projet.codeclasses.Formateur;
import fr.projet.codeclasses.Formateur.Grade;
import fr.projet.codeclasses.Formation;

public class TestFormation {
	private Formation f1;
	private Formation f2;
	private Formation f3;
	private Formateur formateur;

	@Before
	public void setUp() throws Exception {
		formateur = new Formateur("nom", "prenom", "specialite", Grade.JUNIOR);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLongueurTitre() {
		f1 = new Formation("ti", formateur, 200, 20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPrix() {
		f2 = new Formation("titre", formateur, 99, 12);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNbHeures() {
		f3 = new Formation("titre", formateur, 200, 9);
	}
}
