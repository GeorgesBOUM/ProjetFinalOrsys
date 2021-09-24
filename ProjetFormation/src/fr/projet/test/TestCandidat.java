package fr.projet.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdk.internal.org.jline.reader.Candidate;

public class TestCandidat {
	
	Candidat c;

	@Before
	public void setUp() throws Exception {
		C = new Candidate(null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testId() {
		assertTrue("id numérique", c.getId() > 0);
	}

}
