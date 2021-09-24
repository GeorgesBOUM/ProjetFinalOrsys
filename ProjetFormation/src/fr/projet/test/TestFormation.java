package fr.projet.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFormation {
	private Formation f;

	@Before
	public void setUp() throws Exception {
		f = new Formation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLongueurTitre() {
		assertTrue("Titre ayant plus de 3 caract�res", f.getTitre.length() > 3);
	}
	
	@Test
	public void testPrix() {
		assertTrue("prix sup�rieur � 100", f.getPrix() > 100);
	}
	
	@Test
	public void testNbHeures() {
		assertTrue("nbre heure sup�rieur � 10", f.getNbreHeures() > 10);
	}
}
