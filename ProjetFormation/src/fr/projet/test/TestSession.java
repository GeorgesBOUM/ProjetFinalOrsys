package fr.projet.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.projet.codeclasses.Session;
import fr.projet.codeclasses.Session.Mode;

public class TestSession {
	private Session s;

	@Before
	public void setUp() throws Exception {
		s = new Session("05/07/21", "24/09/21", "titre", "orsys", Mode.DISTANCIEL);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMode() {
		assertTrue("mode distanciel", s.getMode() == Mode.DISTANCIEL);
	}

}
