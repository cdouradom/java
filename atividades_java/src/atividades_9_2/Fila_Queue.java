package atividades_9_2;

import java.util.LinkedList; //biblioteca para a classe de Queue
import java.util.Queue; //biblioteca para a classe Queue
import java.util.Scanner; //biblioteca para a classe de ler do teclado

public class Fila_Queue {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//criando a fila de clientes com regra fifo, onde o primeiro que entra eh o primeiro que sai)
		Queue<String> fila = new LinkedList<>(); 

		int opcao; //variavel para armazenar a escolha do menu
		String nome; //nome do cliente a ser adicionado

		do {
			//mostrando o menu de opcoes
			System.out.println("\n========= MENU FILA ==========");
			System.out.println("1 - Adicionar cliente na fila   ");
			System.out.println("2 - Listar todos os clientes    ");
			System.out.println("3 - Retirar cliente da fila	    ");
			System.out.println("0 - Sair                        ");
			System.out.println("\n==============================");
			System.out.print("Digite uma opção do menu: ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1: //adicionado clientes
				System.out.print("Digite o nome do Cliente: ");
				nome = leia.nextLine(); //le o nome do cliente
				fila.add(nome); //adiciona na fila
				System.out.println("\nCliente adicionado!");
				break;

			case 2: //listando os clientes
				System.out.println("\nLista de Clientes na Fila:");
				if (fila.isEmpty()) {
					System.out.println("A fila esta vazia!");
				} else {
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3: //chama os cliente
				if (fila.isEmpty()) {
					System.out.println("\nA Fila esta vazia!");
				} else {
					String chamado = fila.poll(); //remove o primeiro da fila
					System.out.println("\nO Cliente " + chamado + " foi chamado!");
				}
				break;

			case 0: //sair
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\nOpção invalida, tente novamente.");
			}

		} while (opcao != 0); //repete o laco ate o usuario escolher sair

		leia.close();
	}
}
