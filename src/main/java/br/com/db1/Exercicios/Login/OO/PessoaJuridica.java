package br.com.db1.Exercicios.Login.oo;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Boolean validaCnpj(){
		return true;
	}
}
