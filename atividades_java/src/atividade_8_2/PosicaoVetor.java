package atividade_8_2;

import java.util.Scanner; //importar a classe Scanner para ler o que o usuário digitar

public class PosicaoVetor {

	public static void main(String[] args) {

		// criando o objeto Scanner para entrada de dados pelo usuário
		Scanner leia = new Scanner(System.in);

		// criando um vetor de inteiros com 10 posições
		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		// mostrando o vetor na tela so para visualizar melhor
		System.out.println("Índices:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(i + " "); // mostra os índices de 0 a 9
		}

		System.out.println(); // uma quebra de linha
		System.out.println("Valores do vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " "); // mostrando os valores armazenados no vetor
		}

		System.out.println(); // quebra de linha
		System.out.print("\nDigite o número que você deseja encontrar: ");

		// lendo o número que o usuário digitou
		int numero = leia.nextInt();

		// variavel para guardar a posição do numero se tiver
		int posicao = -1; // -1 significa "não encontrado" pois eh menor que zero

		// laço de repeticao para percorrer o vetor e procurar o numero
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) { // Se o número do vetor for igual ao digitado
				posicao = i; // guarda a posição encontrada
				break; // sai do laço (não precisa continuar procurando)
			}
		}

		// verificando se encontrou ou não
		if (posicao != -1) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		// fechando o Scanner
		leia.close();
	}
}
