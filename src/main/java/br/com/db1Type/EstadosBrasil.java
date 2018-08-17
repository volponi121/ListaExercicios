package br.com.db1Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EstadosBrasil {

	ACRE("Acre"), ALAGOAS("Alagoas"), AMAPA("Amapa"), AMAZONAS("Amazonas"), BAHIA(
			"Bahia"), CEARA("Ceara"), DISTRITO_FEDERAL("Distrito Federal"), ESPIRITO_SANTO(
			"Espirito Santo"), GOIAS("Goiás"), MARANHAO("Maranhão"), MATO_GROSSO(
			"Mato grosso"), MATO_GROSSO_DO_SUL("Mato Grosso do Sul"), MINAS_GERAIS(
			"Minas Gerais"), PARA("Pará"), PARAIBA("Paraíba"), PARANA("Paraná"), PERNAMBUCO(
			"Pernambuco"), PIAUI("Piauí"), RIO_DE_JANEIRO("Rio de Janeiro"), RIO_GRANDE_DO_NORTE(
			"Rio Grande Do Norte"), RIO_GRANDE_DO_SUL("Rio Grande do Sul"), RONDONIA(
			"Rondônia"), RORAIMA("Roraima"), SANTA_CATARINA("Santa Catarina"), SAO_PAULO(
			"São Paulo"), SERGIPE("Sergipe"), TOCANTINS("Tocantins");

	private String estado;

	EstadosBrasil(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	public List<EstadosBrasil> regiaoSul() {
		List<EstadosBrasil> sul = new ArrayList<EstadosBrasil>();

		sul.add(PARANA);
		sul.add(SANTA_CATARINA);
		sul.add(RIO_GRANDE_DO_SUL);
		
		Collections.sort(sul);
		
		return sul;
	}

	public List<EstadosBrasil> regiaoSudeste() {
		List<EstadosBrasil> sudeste = new ArrayList<EstadosBrasil>();

		sudeste.add(SAO_PAULO);
		sudeste.add(MINAS_GERAIS);
		sudeste.add(ESPIRITO_SANTO);
		sudeste.add(RIO_DE_JANEIRO);
		
		Collections.sort(sudeste);
		return sudeste;
	}

	public List<EstadosBrasil> regiaoCentroOeste() {
		List<EstadosBrasil> centroOeste = new ArrayList<EstadosBrasil>();

		centroOeste.add(MATO_GROSSO);
		centroOeste.add(MATO_GROSSO_DO_SUL);
		centroOeste.add(GOIAS);
		
		Collections.sort(centroOeste);
		return centroOeste;
	}
	
	public List<EstadosBrasil> regiaoNordeste() {
		List<EstadosBrasil> nordeste = new ArrayList<EstadosBrasil>();

		nordeste.add(BAHIA);
		nordeste.add(PIAUI);
		nordeste.add(MARANHAO);
		nordeste.add(SERGIPE);
		nordeste.add(ALAGOAS);
		nordeste.add(PERNAMBUCO);
		nordeste.add(PARAIBA);
		nordeste.add(RIO_GRANDE_DO_NORTE);
		nordeste.add(CEARA);
		
		Collections.sort(nordeste);
		
		return nordeste;
	}
	
	public List<EstadosBrasil> regiaoNorte() {
		List<EstadosBrasil> norte = new ArrayList<EstadosBrasil>();

		norte.add(ACRE);
		norte.add(AMAZONAS);
		norte.add(RONDONIA);
		norte.add(RORAIMA);
		norte.add(AMAPA);
		norte.add(PARA);
		norte.add(TOCANTINS);
		
		Collections.sort(norte);
		
		return norte;
	}
}