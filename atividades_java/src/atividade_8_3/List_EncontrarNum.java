package atividade_8_3;

import java.util.ArrayList; //biblioteca para a classe ArrayList
import java.util.Scanner; //biblioteca para a classe Scanner para ler dados do teclado

public class List_EncontrarNum {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>(); //cria a Collection ArrayList de Integer

		//iniciando com 10 valores inteiros informados
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		//mostrando os numeros da lista
		System.out.println("Lista de numeros:");
		for (int n : numeros) {
			System.out.println(n);
		}

		//pedir para o usuario digitar um numero
		System.out.print("\nDigite o numero que você deseja encontrar: ");
		int numero = leia.nextInt();

		//vai verifica se o numero existe na lista
		if (numeros.contains(numero)) {
			//se encontrar, vai mostrar a posicao
			int posicao = numeros.indexOf(numero); // indexOf retorna a posicao
			System.out.println("O numero " + numero + " esta localizado na posicao: " + posicao);
		} else {
			//e se nao encontrar, vai mostra essa mensagem
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		leia.close();
	}
}
