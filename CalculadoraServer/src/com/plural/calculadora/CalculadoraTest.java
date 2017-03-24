package com.plural.calculadora;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	double resultado = 0;

	@Test
	public void testCalcularSoma() {
		resultado = Double.parseDouble(Calculadora.calcular("50+40"));
		assertTrue("A Soma devia ser 90", 90 == resultado);
	}

	@Test
	public void testCalcularSubtracao() {
		resultado = Double.parseDouble(Calculadora.calcular("50-40"));
		assertTrue(10 == resultado);
	}

	@Test
	public void testCalcularMultiplicacao() {
		resultado = Double.parseDouble(Calculadora.calcular("50*4"));
		assertTrue(200 == resultado);
	}

	@Test
	public void testCalcularDivisao() {
		resultado = Double.parseDouble(Calculadora.calcular("50/5"));
		assertTrue(10 == resultado);
	}

}
