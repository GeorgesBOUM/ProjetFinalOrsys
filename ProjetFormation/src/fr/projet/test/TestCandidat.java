package fr.projet.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.projet.codeclasses.Candidat;

public class TestCandidat {
	
	private Candidat c;

	@Before
	public void setUp() throws Exception {
		c = new Candidat(0, "nom", "departement");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdIncorrect() {
		assertTrue("id incorrect", c.getId() <= 0);
	}
	
	@Test
	public void testIdCorrect() {
		assertTrue("id correct", c.getId() > 0);
	}

}
