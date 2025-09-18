package atividade_8_2;

import java.util.Scanner; //importar a classe Scanner para ler o que o usuário digitar

public class MediaClasse {

	public static void main(String[] args) {

		// criando objeto para ler dados digitados pelo usuário
		Scanner leia = new Scanner(System.in);

		// criando a matriz com 10 linhas (sao os participantes) e 4 colunas (sao os bimestres)
		double[][] notas = new double[10][4];

		// criando um vetor para armazenar as médias dos participantes
		double[] medias = new double[10];

		// input de dados -- vai percorrer cada linha da matriz de cada participante
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");

			//variável auxiliar para somar as notas de cada participante
			double soma = 0;

			//percorrendo as 4 notas (colunas) de cada participante
			for (int j = 0; j < 4; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				notas[i][j] = leia.nextDouble(); //lendo a nota e armazenando na matriz
				soma += notas[i][j]; //somando para depois calcular a média
			}

			//calculando a média do participante e armazenando no vetor de médias
			medias[i] = soma / 4;
		}

		//exibindo os dados
		System.out.println("\nMédias dos participantes:");
		for (int i = 0; i < 10; i++) {
			//exibindo a média formatada com 1 casa decimal
			System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
		}

		leia.close();
	}
}
