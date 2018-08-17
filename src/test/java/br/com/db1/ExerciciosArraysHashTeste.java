package br.com.db1;

import static org.junit.Assert.*;


import org.junit.Test;

public class ExerciciosArraysHashTeste {
	
	ExerciciosArrayHash chamada = new ExerciciosArrayHash();
	@Test
	public void coresFavoritasTeste() {
	
		assertEquals("VERDE", chamada.coresFavoritas().get(0).toUpperCase());
		assertEquals("VERMELHO", chamada.coresFavoritas().get(1).toUpperCase());
		assertEquals("AZUL", chamada.coresFavoritas().get(2).toUpperCase());
	}

	@Test
	public void quantidadeItensListaTeste(){
		assertTrue(chamada.quantidadeItensLista() == 3);
		assertFalse(chamada.quantidadeItensLista() == 10);
	}
	
	@Test
	public void  nomeParentesTeste(){
		assertEquals("Arthur",chamada.nomeParentes().get(0));
		assertEquals("Danielli",chamada.nomeParentes().get(1));
	}
	
	@Test
	public void nomeCidadeTeste(){
		assertEquals("Maringá",chamada.nomeCidade().get(0));
		assertEquals("Marialva",chamada.nomeCidade().get(1));
	}
	
	@Test
	public void corOrdenadoTeste(){
		assertEquals("Amarelo", chamada.corOrdenado().get(0));
		assertEquals("Azul", chamada.corOrdenado().get(1));
		assertEquals("Verde", chamada.corOrdenado().get(2));
		assertEquals("Vermelho",chamada.corOrdenado().get(3));
	}
	
	@Test
	public void eliminaCorTeste(){
		assertEquals("Vermelho",chamada.eliminaCor().get(0));
	}
	
	@Test
	public void parenteDecrescenteTeste(){
		assertEquals("Otacilio", chamada.parenteDecrescente().get(0));
		assertEquals("Glaucia", chamada.parenteDecrescente().get(1));
		assertEquals("Danielli", chamada.parenteDecrescente().get(2));
		assertEquals("Arthur",chamada.parenteDecrescente().get(3));
	}
	
	@Test
	public void numerosInteirosTeste(){
		chamada.numerosInteiros();
		assertTrue(chamada.numeroPar.get(0)	== 2);
		assertTrue(chamada.numeroPar.get(1)	== 4);
		assertTrue(chamada.numeroPar.get(2) == 6);
		assertTrue(chamada.numeroPar.get(3) == 8);
		assertTrue(chamada.numeroPar.get(4) == 10);
		
		assertTrue(chamada.numeroImpar.get(0) == 1);
		assertTrue(chamada.numeroImpar.get(1) == 3);
		assertTrue(chamada.numeroImpar.get(2) == 5);
		assertTrue(chamada.numeroImpar.get(3) == 7);
		assertTrue(chamada.numeroImpar.get(4) == 9);
	}
	
	@Test
	public void nomesDistintosTeste() {
		
		assertTrue(chamada.nomesDistintos().contains("José"));
		assertTrue(chamada.nomesDistintos().contains("Jose"));
		assertTrue(chamada.nomesDistintos().contains("Marcos"));
		assertTrue(chamada.nomesDistintos().contains("Roberval"));
		assertTrue(chamada.nomesDistintos().contains("Vagner"));
		
	}
}
