package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosArrayHash {

	public List<String> coresFavoritas() {
		List<String> cores = new ArrayList<String>();
		cores.add("Verde");
		cores.add("Vermelho");
		cores.add("Azul");
		return cores;
	}

	public Integer quantidadeItensLista() {
		List<String> itens = new ArrayList<String>();
		itens.add("item1");
		itens.add("item2");
		itens.add("item3");
		return itens.size();
	}

}
