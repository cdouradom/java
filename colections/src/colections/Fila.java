package colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		// ctrl+shift+o > importa automaticamente

		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");

		System.out.println(fila);

		// Retirar um elemento da fila - Sempre retira o primeiro elemento
		fila.remove();

		System.out.println(fila);

		fila.add("Milena");
		fila.add("Nádia");

		System.out.println(fila);

		System.out.println("O tamanho da fila é:  pessoas" + fila.size());
		
		System.out.println("O primeira pessoa da fila eh? " + fila.peek());

		for (var pessoa : fila) {
			System.out.println(pessoa);
		}

	}

}