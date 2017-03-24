package com.plural.calculadora;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculadora {

	/*
	 * Recebe uma string com a operação e responde o resultado
	 * 
	 * @operacao = algo do tipo "50.2 + 12"
	 * 
	 */
	public static String calcular(String expressao) {
		double res, valor1, valor2;

		//TODO should have a better way to do this!
		if (expressao.contains("+")) {
			String[] valores = expressao.split("\\+");
			valor1 = Double.parseDouble(valores[0]);
			valor2 = Double.parseDouble(valores[1]);
			res = valor1 + valor2;
		} else if (expressao.contains("-")) {
			String[] valores = expressao.split("\\-");
			valor1 = Double.parseDouble(valores[0]);
			valor2 = Double.parseDouble(valores[1]);
			res = valor1 - valor2;
		} else if (expressao.contains("*")) {
			String[] valores = expressao.split("\\*");
			valor1 = Double.parseDouble(valores[0]);
			valor2 = Double.parseDouble(valores[1]);
			res = valor1 * valor2;
		} else if (expressao.contains("/")) {
			String[] valores = expressao.split("\\/");
			valor1 = Double.parseDouble(valores[0]);
			valor2 = Double.parseDouble(valores[1]);
			res = valor1 / valor2;
		} else
			return "Expressao invalida. Use algo do tipo \"50.2 + 12\" ";

		return String.valueOf(res);
	}
}
