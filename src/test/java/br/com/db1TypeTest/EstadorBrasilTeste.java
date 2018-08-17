package br.com.db1TypeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1Type.EstadosBrasil;

public class EstadorBrasilTeste {
	
	@Test
	public void regiaoSulTeste(){
		assertEquals("Paraná",EstadosBrasil.PARANA.getEstado());
	}
	
	@Test
	public void regiaoSudesteTeste(){
		assertTrue("São Paulo"==EstadosBrasil.SAO_PAULO.getEstado());
	}
}
