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
	public void eliminaCor(){
		assertEquals("Azul",chamada.eliminaCor().get(0));
	}
}
