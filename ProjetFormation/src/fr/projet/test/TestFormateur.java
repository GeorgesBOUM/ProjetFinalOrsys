package fr.projet.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.projet.codeclasses.Formateur;
import fr.projet.codeclasses.Formateur.Grade;

public class TestFormateur {
	private Formateur f1;
	
	@Before
	public void setUp() throws Exception {
		f1 = new Formateur("nom", "prenom", "specialité", Grade.JUNIOR );
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGrade() {
		assertTrue("Formateur Junior", f1.getGrade() == Grade.JUNIOR);
	}

}
