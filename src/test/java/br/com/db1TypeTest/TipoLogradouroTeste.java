package br.com.db1TypeTest;

import org.junit.Assert;


import org.junit.Test;

import br.com.db1Type.TipoLogradouro;

public class TipoLogradouroTeste {
	
	@Test
	public void logradouroTeste(){
		Assert.assertEquals("R",TipoLogradouro.RUA.getApelidoLogradouro());
		Assert.assertEquals("FZ",TipoLogradouro.FAZENDA.getApelidoLogradouro());
		Assert.assertEquals("PC",TipoLogradouro.PRACA.getApelidoLogradouro());
		Assert.assertEquals("AV",TipoLogradouro.AVENIDA.getApelidoLogradouro());
		
		Assert.assertEquals("Rua",TipoLogradouro.RUA.getDescricaoLogradouro());
		Assert.assertEquals("Fazenda",TipoLogradouro.FAZENDA.getDescricaoLogradouro());
		Assert.assertEquals("Praça",TipoLogradouro.PRACA.getDescricaoLogradouro());
		Assert.assertEquals("Avenida",TipoLogradouro.AVENIDA.getDescricaoLogradouro());
		

	}
	
}
