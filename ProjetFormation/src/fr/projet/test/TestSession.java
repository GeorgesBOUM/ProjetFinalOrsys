package fr.projet.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSession {
	private Session s;

	@Before
	public void setUp() throws Exception {
		s = new Session();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMode() {
		fail("Not yet implemented");
		//tester que le mode ne peut être que "presentiel" ou "en ligne"
	}

}
