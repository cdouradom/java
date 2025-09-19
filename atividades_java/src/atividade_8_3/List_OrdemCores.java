package atividade_8_3;

import java.util.ArrayList; //biblioteca para a classe ArrayList
import java.util.Collections; //biblioteca para a classe Collections para ordenar
import java.util.Scanner; //biblioteca para a classe Scanner para ler dados do teclado

public class List_OrdemCores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// variaveis
		int numero;
		int soma = 0;

		// primeiro - SOMA DOS NÚMEROS POSITIVOS
		System.out.println("SOMA DOS NÚMEROS POSITIVOS");

		do {
			System.out.print("Digite um número inteiro ou 0 para sair: ");
			numero = leia.nextInt();

			// se o numero for positivo, soma
			if (numero > 0) {
				soma = soma + numero;
			}

		} while (numero != 0); //fica neste laco ate digitar 0

		// mostra o resultado da soma
		System.out.println("A soma dos números positivos é: " + soma);

		// segundo - LISTA DE CORES
		System.out.println("\nLISTA DE CORES");
		leia.nextLine();

		ArrayList<String> cores = new ArrayList<>(); //cria a lista de cores

		// para o usuário digitar 5 cores
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite a cor " + i + ": ");
			String cor = leia.nextLine(); // le a cor
			cores.add(cor); // adiciona na lista
		}

		// mostrando todas as cores digitadas
		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		// ordenando e mostrando a lista de cores
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
	}
}
