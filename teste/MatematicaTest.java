package br.com.xti.teste;

import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.com.xti.poo.Matematica;

public class MatematicaTest {

	Matematica m;
	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testMaior() {
		assertEquals(20, m.maior(10, 20));
	}

	@Test
	public void testRaiz() {
		assertEquals(4, m.raiz(16));
	}

}
