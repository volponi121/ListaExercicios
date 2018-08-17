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
	GOIAS("Goiás"), 
	MARANHAO("Maranhão"), 
	MATO_GROSSO("Mato grosso"), 
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul"), 
	MINAS_GERAIS("Minas Gerais"), 
	PARA("Pará"), 
	PARAIBA("Paraíba"), 
	PARANA("Paraná"), 
	PERNAMBUCO("Pernambuco"), 
	PIAUI("Piauí"), 
	RIO_DE_JANEIRO("Rio de Janeiro"), 
	RIO_GRANDE_DO_NORTE("Rio Grande Do Norte"), 
	RIO_GRANDE_DO_SUL("Rio Grande do Sul"), 
	RONDONIA("Rondônia"), 
	RORAIMA("Roraima"), 
	SANTA_CATARINA("Santa Catarina"),
	SAO_PAULO("São Paulo"), 
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
