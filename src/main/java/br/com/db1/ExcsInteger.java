package br.com.db1;

public class ExcsInteger {

	public Integer somaDois(Integer primeiroNum, Integer segundoNum) {
		return primeiroNum+segundoNum;
	}

	public Integer subDois(Integer primeiroNum, Integer segundoNum) {
		
		return primeiroNum-segundoNum;
	}

public Integer multDois(Integer primeiroNum, Integer segundoNum) {
		
		return primeiroNum*segundoNum;
	}


public float divDois(Integer primeiroNum, Integer segundoNum) {
	
		return primeiroNum/segundoNum;
}

public boolean numPar(Integer primeiroNum) {
	if(primeiroNum % 2 == 0) {
		return true;
	}
	return false;
}

public boolean numMaior(Integer primeiroNum, Integer segundoNum) {
	return primeiroNum>segundoNum;
}

public void numImparesCem(Integer primeiroNum) {
	while(primeiroNum<101) {
		if(primeiroNum%2==1) {
		 System.out.println(primeiroNum);	
		}
	primeiroNum++;		
	}

}
}