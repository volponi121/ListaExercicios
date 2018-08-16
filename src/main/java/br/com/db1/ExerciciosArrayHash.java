package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciciosArrayHash {

	List<Integer> numeroPar = new ArrayList<Integer>();
	List<Integer> numeroImpar = new ArrayList<Integer>();

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

	public List<String> nomeParentes() {
		List<String> nomeParentes = new ArrayList<String>();
		nomeParentes.add("Glaucia");
		nomeParentes.add("Otacilio");
		nomeParentes.add("Arthur");
		nomeParentes.add("Danielli");
		nomeParentes.add("Bernardo");
		nomeParentes.remove(0);
		nomeParentes.remove(0);
		return nomeParentes;
	}

	public List<String> nomeCidade() {
		List<String> nomeCidade = new ArrayList<String>();
		nomeCidade.add("Maringá");
		nomeCidade.add("Sarandi");
		nomeCidade.add("Marialva");
		nomeCidade.remove(1);
		return nomeCidade;
	}

	public List<String> corOrdenado() {
		List<String> ordenado = new ArrayList<String>();
		ordenado.add("Azul");
		ordenado.add("Vermelho");
		ordenado.add("Verde");
		ordenado.add("Amarelo");

		Collections.sort(ordenado);

		return ordenado;
	}

	public List<String> eliminaCor() {
		List<String> cor = new ArrayList<String>();
		cor.add("Azul");
		cor.add("Vermelho");
		cor.add("Verde");
		cor.remove(0);
		return cor;
	}

	public List<String> parenteDecrescente() {
		List<String> removePessoa = new ArrayList<String>();
		removePessoa.add("Glaucia");
		removePessoa.add("Otacilio");
		removePessoa.add("Arthur");
		removePessoa.add("Danielli");

		Collections.sort(removePessoa);
		Collections.reverse(removePessoa);
		return removePessoa;
	}

	public void numerosInteiros() {
		for (Integer x = 1; x < 21; x++) {

			if (x % 2 == 0) {
				numeroPar.add(x);
			continue;
			}
			numeroImpar.add(x);
		}

	}

}
