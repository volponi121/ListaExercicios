package br.com.db1;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosDoubleTeste {
	public Double numero1=3.161,numero2=4.153,numero3=12.141;
	
	ExerciciosDouble chamada = new ExerciciosDouble();
	
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
		Assert.assertTrue(chamada.areaTriangulo(12.5d, 3.1d)==19.375);
			}
}
