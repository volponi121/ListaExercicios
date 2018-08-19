package br.com.db1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ExerciciosStringsTeste {
	ExercicioStrings chamada = new ExercicioStrings();
	
	public String nomeMinusculo= "fabio";
	
	@Test
	public void letrasMaiusculas() {
		assertEquals("FABIO",chamada.nomeMaiusculo(nomeMinusculo));
	}
	
}
