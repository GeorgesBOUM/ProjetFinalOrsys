package fr.projet.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.projet.codeclasses.Candidat;

public class TestCandidat {
	
	private Candidat c1,c2;

	@Before
	public void setUp() throws Exception {
		c1 = new Candidat(0, "nom", "departement");
		c2 = new Candidat(3, "nom", "departement");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdIncorrect() {
		assertTrue("id incorrect", c1.getId() <= 0);
	}
	
	@Test
	public void testIdCorrect() {
		assertTrue("id correct", c2.getId() > 0);
	}

}
