package vetores; //nome do projeto

import java.util.Scanner;//biblioteca - essa linha precisa ser incluida sempre que utilizo a linha Arrays.sort(nomedodado);

public class Matriz { // nome da classe/arquivo

	public static void main(String[] args) {// essa linha eh obrigatoria em toda classe sempre assim

		Scanner leia = new Scanner(System.in); // essa linha eh para ter um texto exibido para o usuario, para o usuario
												// interagir

		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };

		float numerosReais[][] = new float[3][2];

		System.out.println("Listar os dados - Matriz Numeros");

		// laco de repeticao que corre as linhas
		for (int linha = 0; linha < numeros.length; linha++) {
			// laco de repeticao que corre as colunas
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				System.out.printf("numeros[%d][%d] - %d\n", linha, coluna, numeros[linha][coluna]);

			}
		}

		System.out.println("Input dos dados - Matriz Numeros Reais");

		for (int linha = 0; linha < numerosReais.length; linha++) {
			for (int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				System.out.printf(" Digite um numero");
				numerosReais[linha][coluna] = leia.nextFloat();

			}
		}

		System.out.println("Listar os dados - Matriz Numeros Reais");

		for (int linha = 0; linha < numerosReais.length; linha++) {
			for (int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				System.out.printf("numerosReais[%d][%d] - %.2f\n", linha, coluna, numerosReais[linha][coluna]);

			}
		}

		leia.close();
	}

}
