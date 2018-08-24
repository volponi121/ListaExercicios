package br.com.db1.Exercicios.Login.oo;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Boolean validadorCpf(){
		return true;
	}
}
