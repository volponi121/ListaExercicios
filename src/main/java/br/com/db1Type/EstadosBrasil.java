package br.com.db1Type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosBrasil {

	ACRE("Acre"), 
	ALAGOAS("Alagoas"), 
	AMAPA("Amapa"), 
	AMAZONAS("Amazonas"), 
	BAHIA("Bahia"),
	CEARA("Ceara"), 
	DISTRITO_FEDERAL("Distrito Federal"), 
	ESPIRITO_SANTO("Espirito Santo"), 
	GOIAS("Goi�s"), 
	MARANHAO("Maranh�o"), 
	MATO_GROSSO("Mato grosso"), 
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul"), 
	MINAS_GERAIS("Minas Gerais"), 
	PARA("Par�"), 
	PARAIBA("Para�ba"), 
	PARANA("Paran�"), 
	PERNAMBUCO("Pernambuco"), 
	PIAUI("Piau�"), 
	RIO_DE_JANEIRO("Rio de Janeiro"), 
	RIO_GRANDE_DO_NORTE("Rio Grande Do Norte"), 
	RIO_GRANDE_DO_SUL("Rio Grande do Sul"), 
	RONDONIA("Rond�nia"), 
	RORAIMA("Roraima"), 
	SANTA_CATARINA("Santa Catarina"),
	SAO_PAULO("S�o Paulo"), 
	SERGIPE("Sergipe"), 
	TOCANTINS("Tocantins");

	private String estado;
	
	
	EstadosBrasil(String estado){
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public List<EstadosBrasil> regiaoSul(){
		List<EstadosBrasil> sul = new ArrayList<EstadosBrasil>();
		
		sul.add();
	}
	
	
}
