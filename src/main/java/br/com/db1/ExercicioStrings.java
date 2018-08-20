package br.com.db1;

public class ExercicioStrings {

	public String nomeMaiusculo(String nome) {
		return nome=nome.toUpperCase();
	}

	public String nomeMinusculo(String nome) {
		return nome=nome.toLowerCase();
	}

	public int quantidadeLetras(String db1) {
		return db1.length();
	}

	public Integer quantidadeLetrasBranco(String db1) {
		return db1.length();
	}

	public Integer mesmaQuantidadeLetras(String db1) {
		return db1.trim().length();
	}

	public String quatroPrimeirasLetras(String nome) {
		return nome.replace(" ", "").substring(0, 4);
	}

	public String aPartirTerceiraLetra(String nome) {
		return nome.substring(2);
	}

	public String aPartirQuatroUltimas(String nome) {
		return nome.replace(" ", "").substring(22);
	}

	public String substituirNomeAluno(String nome) {
		return nome.replace("Fabio", "Aluno");
	}

	public String separaTexto(String frutas) {
		return frutas.replace(",", " ");
	}

	public Integer quantidadeVogais(String texto) {
		
		texto = texto.toUpperCase();
		Integer contador = 0;

		for (Integer x = 0; x < texto.length(); x++) {
			char posicao = texto.charAt(x);
			if (posicao == 'A' || posicao == 'E' || posicao == 'I' || posicao == 'O' || posicao == 'U') {
				contador++;
			}
		}
		return contador;
	}

	public String textoInvertido(String texto) {
		String inverte = new StringBuilder(texto).reverse().toString();

		return inverte;
	}
	

}
