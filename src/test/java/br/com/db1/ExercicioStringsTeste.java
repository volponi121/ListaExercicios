package br.com.db1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class ExercicioStringsTeste {
	ExercicioStrings chamada = new ExercicioStrings();

	public final static String NOMEMINUSCULO= "fabio",NOMEMAIUSCULO= "FABIO";
	public final static String DB1= "DB1START",db1branco= " DB1START ",meunome= "Fabio Augusto Volponi de Souza";
	public final static String FRUTAS = "banana,maçã,melancia";
	public final static String TEXTO = "Oi Pessoal";
	@Test
	public void letrasMaiusculasTeste() {
		assertEquals("FABIO", chamada.nomeMaiusculo(NOMEMINUSCULO));
		assertNotEquals("Oi Pessoal", chamada.nomeMaiusculo(NOMEMINUSCULO));
	}

	@Test
	public void letrasMinusculasTeste() {
		assertEquals("fabio", chamada.nomeMinusculo(NOMEMAIUSCULO));
		assertNotEquals("FABIO", chamada.nomeMinusculo(NOMEMAIUSCULO));
	}

	@Test
	public void quantidadeLetrasTeste(){
		assertTrue(8==chamada.quantidadeLetras(DB1));
		assertFalse(10==chamada.quantidadeLetras(DB1));
	}
	
	@Test
	public void quantidadeLetrasBrancoTeste(){
		assertTrue(10==chamada.quantidadeLetras(db1branco));
		assertFalse(8==chamada.quantidadeLetras(db1branco));
	}
	
	@Test
	public void mesmaQuantidadeLetrasTeste() {
		assertTrue(8==chamada.mesmaQuantidadeLetras(db1branco));
		assertFalse(10==chamada.mesmaQuantidadeLetras(db1branco));
	}
	
	@Test
	public void quatroPrimeirasLetrasTeste(){
		assertEquals("Fabi", chamada.quatroPrimeirasLetras(meunome));
		assertNotEquals("Fab", chamada.quatroPrimeirasLetras(meunome));
	}
	
	@Test
	public void aPartirTerceiraLetraTeste() {
		assertEquals("bio Augusto Volponi de Souza", chamada.aPartirTerceiraLetra(meunome));
		assertNotEquals("fabio Augusto Volponi de Souza", chamada.aPartirTerceiraLetra(meunome));
	}
	
	@Test
	public void aPartirQuatroUltimasTeste() {
		assertEquals("ouza", chamada.aPartirQuatroUltimas(meunome));
		assertNotEquals("Souza", chamada.aPartirQuatroUltimas(meunome));
	}
	
	@Test
	public void substituirNomeAlunoTeste() {
		assertEquals("Aluno Augusto Volponi de Souza", chamada.substituirNomeAluno(meunome));
		assertNotEquals("Fabio Augusto Volponi de Souza", chamada.substituirNomeAluno(meunome));
	}
	
	@Test
	public void separaTextoTeste() {
		assertEquals("banana maçã melancia", chamada.separaTexto(FRUTAS));
		assertNotEquals("banana,maça,melancia", chamada.separaTexto(FRUTAS));
	}
	
	@Test
	public void quantidadeVogaisTeste() {
		
		assertTrue(chamada.quantidadeVogais(TEXTO)==5);
		
	}
	
	@Test
	public void textoInvertidoTeste() {
		assertEquals("laosseP iO", chamada.textoInvertido(TEXTO));
		assertNotEquals("Oi Pessoal", chamada.textoInvertido(TEXTO));
	}
	
	
}
