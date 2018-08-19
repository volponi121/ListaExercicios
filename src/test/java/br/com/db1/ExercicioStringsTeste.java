package br.com.db1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class ExercicioStringsTeste {
	ExercicioStrings chamada = new ExercicioStrings();

	public String nomeminusculo= "fabio",nomemaiusculo= "FABIO";
	public String db1= "DB1START",db1branco= " DB1START ",meunome= "Fabio Augusto Volponi de Souza";
	public String frutas = "banana,maçã,melancia";
	public String texto = "Oi Pessoal";
	@Test
	public void letrasMaiusculasTeste() {
		assertEquals("FABIO", chamada.nomeMaiusculo(nomeminusculo));
		assertNotEquals("Oi Pessoal", chamada.nomeMaiusculo(nomeminusculo));
	}

	@Test
	public void letrasMinusculasTeste() {
		assertEquals("fabio", chamada.nomeMinusculo(nomemaiusculo));
		assertNotEquals("FABIO", chamada.nomeMinusculo(nomemaiusculo));
	}

	@Test
	public void quantidadeLetrasTeste(){
		assertTrue(8==chamada.quantidadeLetras(db1));
		assertFalse(10==chamada.quantidadeLetras(db1));
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
		assertEquals("banana maçã melancia", chamada.separaTexto(frutas));
		assertNotEquals("banana,maça,melancia", chamada.separaTexto(frutas));
	}
	
	@Test
	public void quantidadeVogaisTeste() {
		
		assertTrue(chamada.quantidadeVogais("OI PESSOAL")==5);
		
	}
	
	@Test
	public void textoInvertidoTeste() {
		assertEquals("laosseP iO", chamada.textoInvertido(texto));
		assertNotEquals("Oi Pessoal", chamada.textoInvertido(texto));
	}
	
	
}
