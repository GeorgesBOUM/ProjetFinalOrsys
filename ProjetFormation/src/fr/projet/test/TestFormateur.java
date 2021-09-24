package fr.projet.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFormateur {
	private Formateur f;
	
	@Before
	public void setUp() throws Exception {
		f = new Formateur();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		// tester que Formateur grade ne peut être que [junior ,senior, expert]
	}

}
