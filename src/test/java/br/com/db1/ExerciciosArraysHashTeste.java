package br.com.db1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
		assertTrue(chamada.quantidadeItensLista() == 3);
		assertTrue(chamada.quantidadeItensLista() == 3);
		assertTrue(chamada.quantidadeItensLista() == 3);
	}
	
}
