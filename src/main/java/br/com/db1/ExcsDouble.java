package br.com.db1;

public class ExcsDouble {

	
	public Double menorValorDois(Double primeiroNum, Double segundoNum) {
		if(primeiroNum>segundoNum) {
			return segundoNum;		
		}else if(primeiroNum<segundoNum) {
			return primeiroNum;
		}
		return null;
			
	}
	
	public Double menorValorTres(Double primeiroNum, Double segundoNum,Double terceiroNum) {
		
		if(primeiroNum<segundoNum && primeiroNum<terceiroNum) {
			return primeiroNum;
		}else if(primeiroNum>segundoNum && segundoNum<terceiroNum) {
			return segundoNum;
		}else if(terceiroNum<segundoNum && primeiroNum>terceiroNum){
			return terceiroNum;
		}
		return null;
	}

	public Double mediaTresValor(Double primeiroNum, Double segundoNum, Double terceiroNum) {
		return (primeiroNum+segundoNum+terceiroNum)/3;
	}

	public Double areaTriangulo(Double base, Double altura) {
		
		return (base*altura)/2;
	}
	
}