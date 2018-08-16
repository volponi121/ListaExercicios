package br.com.db1;

import org.junit.Assert;
import org.junit.Test;

public class ExcsDoubleTeste {
	public Double numero1=3.161d,numero2=4.153d,numero3=12.141d;
	
	ExcsDouble chamada = new ExcsDouble();
	
	@Test
	public void menorValorDoisTeste() {
		Assert.assertTrue(chamada.menorValorDois(numero1,numero2) == numero1);
		Assert.assertFalse(chamada.menorValorDois(numero1,numero2)== numero2 );;
	}
	
	@Test
	public void menorValorTresTeste() {
		Assert.assertTrue(chamada.menorValorTres(numero1,numero2,numero3) == numero1);
		Assert.assertFalse(chamada.menorValorTres(numero1,numero2,numero3) == numero3);;
	}
	
	@Test	
	public void mediaTresValorTeste() {
		Assert.assertTrue(chamada.mediaTresValor(5.0d,2.5d,3.0d) == 3.5d);
		Assert.assertFalse(chamada.mediaTresValor(5.0d,2.5d,3.0d) == 2d);;
	}
	
	@Test
	public void areaTrianguloTeste() {
		Assert.assertTrue(chamada.areaTriangulo(50.00d, 10.00d)==250.00d);
		Assert.assertFalse(chamada.areaTriangulo(50.00d, 2.00d)==20.00d);
	}
}
