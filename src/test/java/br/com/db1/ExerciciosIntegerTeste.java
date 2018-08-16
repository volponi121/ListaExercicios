package br.com.db1;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosIntegerTeste {
	Integer x=5,y=31;
	ExerciciosInteger chamada = new ExerciciosInteger();
	
	@Test
	public void somaDoisNumTeste(){
		Assert.assertTrue(chamada.somaDois(x,y)==36);
		Assert.assertFalse(chamada.somaDois(x,y)==20);
	}
	
	@Test
	public void subDoisNumTeste() {
		Assert.assertTrue(chamada.subDois(x,y)==-26);
		Assert.assertFalse(chamada.subDois(x,y)==20);
	}
	
	@Test
	public void multDoisNumTeste() {
		Assert.assertTrue(chamada.multDois(x,y)==155);
		Assert.assertFalse(chamada.multDois(x,y)==123);
	}
	
	@Test
	public void divDoisNumTeste() {
		Assert.assertTrue(chamada.divDois(y,x)==6.2);
		Assert.assertFalse(chamada.divDois(x,y)==1);
	}

	@Test
	public void numParTeste() {
		Assert.assertTrue(chamada.numPar(2));
		Assert.assertFalse(chamada.numPar(5));
	}
	
	@Test
	public void ehMaior() {
		Assert.assertTrue(chamada.numMaior(y,x));
		Assert.assertFalse(chamada.numMaior(x,y));
	}
	
	@Test
	public void numImparesCemTeste() {
		chamada.numImparesCem(94);
		chamada.numImparesCem(70);
	}
	
}
