package atividades_9_2;

import java.util.Scanner; //biblioteca para a classe de ler do teclado
import java.util.Stack; //biblioteca para a classe de pilha

public class Fila_Stack {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// criando a fila de clientes com regra lifo, onde o ultimo que entra eh o primeiro que sai)
		Stack<String> pilha = new Stack<>();

		int opcao; // variavel para armazenar a escolha do menu
		String livro; // nome do cliente a ser adicionado

		do {
			// mostrando o menu de opcoes

			System.out.println("\n========= MENU PILHA ==========");
			System.out.println("1 - Adicionar LIVRO              ");
			System.out.println("2 - Listar todos os livros       ");
			System.out.println("3 - Retirar livro         	     ");
			System.out.println("0 - Sair                         ");
			System.out.println("\n===============================");
			System.out.print("Digite uma opção do menu:          ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1: // adicionado os livros
				System.out.print("Digite o nome do Livro: ");
				livro = leia.nextLine();
				pilha.push(livro); // aqui add o livro no topo da pilha
				System.out.println("\nLivro adicionado!");
				break;

			case 2: // listando os livros
				System.out.println("\nLista de Livros na Pilha:");
				if (pilha.isEmpty()) {
					System.out.println("A Pilha esta vazia!");
				} else {
					for (String l : pilha) {
						System.out.println(l);
					}
				}
				break;

			case 3: // retirando o livro
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha esta vazia!");
				} else {
					String retirado = pilha.pop(); // remove o ultimo livro adicionado, ou seja, do topo
					System.out.println("\nO Livro \"" + retirado + "\" foi retirado da Pilha!");
				}
				break;

			case 0: // sair
				System.out.println("\nPrograma encerrado!");
				break;

			default:
				System.out.println("\nOpcao invalida, tente novamente.");
			}

		} while (opcao != 0); // repete o laco ate o usuario escolher sair

		leia.close();
	}
}
