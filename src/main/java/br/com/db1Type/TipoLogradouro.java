package br.com.db1Type;

public enum TipoLogradouro {
	
	RUA("Rua","R"),
	FAZENDA("Fazenda","FZ"),
	PRACA("Praça","PC"),
	AVENIDA("Avenida","AV");
	

	private String descricaoLogradouro;

	private String apelidoLogradouro;

	TipoLogradouro(String descricaoLogradouro,String apelidoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
		this.apelidoLogradouro = apelidoLogradouro;
	}

	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	
	public String getApelidoLogradouro(){
		return apelidoLogradouro;
	}

}
