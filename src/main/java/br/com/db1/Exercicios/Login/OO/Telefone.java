package br.com.db1.Exercicios.Login.OO;

import br.com.d1b1type.login.oo.TipoTelefone;

public class Telefone {

	private Integer ddd;
	private Integer numero;
	private TipoTelefone tipos;

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipos;
	}

	public void setTipo(TipoTelefone tipos) {
		this.tipos = tipos;
	}

	public String formataTelefone() {
		return "(" + ddd + ")" + numero;
	}

}
