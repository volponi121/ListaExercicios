package br.com.db1TypeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1Type.EstadosBrasil;

public class EstadosBrasilTeste {
	
	@Test
	public void regiaoSulTeste(){
		System.out.println(EstadosBrasil.regiaoSul());
		assertEquals("Paraná",EstadosBrasil.PARANA.getEstado());
		assertEquals("Rio Grande do Sul",EstadosBrasil.RIO_GRANDE_DO_SUL.getEstado());
		assertEquals("Santa Catarina",EstadosBrasil.SANTA_CATARINA.getEstado());
	}
	
	@Test
	public void regiaoSudesteTeste(){
		System.out.println(EstadosBrasil.regiaoSudeste());
		assertTrue("São Paulo"==EstadosBrasil.SAO_PAULO.getEstado());
		assertTrue("Minas Gerais"==EstadosBrasil.MINAS_GERAIS.getEstado());
		assertTrue("Espirito Santo"==EstadosBrasil.ESPIRITO_SANTO.getEstado());
	}
	
	@Test
	public void regiaoCentroOesteTeste() {
		System.out.println(EstadosBrasil.regiaoCentroOeste());
		assertEquals("Mato Grosso",EstadosBrasil.MATO_GROSSO.getEstado());
		assertEquals("Mato Grosso do Sul",EstadosBrasil.MATO_GROSSO_DO_SUL.getEstado());
		assertEquals("Goiás",EstadosBrasil.GOIAS.getEstado());
	}
	
	@Test
	public void regiaoNordesteTeste() {
		System.out.println(EstadosBrasil.regiaoNordeste());
		assertTrue("Bahia"==EstadosBrasil.BAHIA.getEstado());
		assertTrue("Piauí"==EstadosBrasil.PIAUI.getEstado());
		assertTrue("Maranhão"==EstadosBrasil.MARANHAO.getEstado());
	}
	
	
	@Test
	public void regiaoNorteTeste() {
		System.out.println(EstadosBrasil.regiaoNorte());
		assertEquals("Acre",EstadosBrasil.ACRE.getEstado());
		assertEquals("Amazonas",EstadosBrasil.AMAZONAS.getEstado());
		assertEquals("Rondônia",EstadosBrasil.RONDONIA.getEstado());
	}
	
}
