package atividade_8_3;

import java.util.HashSet; //biblioteca para a classe HashSet
import java.util.Iterator; //biblioteca para a classe Iterator
import java.util.Scanner; //biblioteca para a classe Scanner

public class Set_NumRepetidos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//criar a Collection Set de Integer
		HashSet<Integer> numeros = new HashSet<>();

		System.out.println("Digite 10 numeros inteiros e que nao sejam repetidos:");

		//pedindo 10 numeros para o usuário
		for (int i = 1; i <= 10; i++) {
			System.out.print("Numero " + i + ": ");
			int valor = leia.nextInt();
			numeros.add(valor);
		}

		//mostrando os elementos usando Iterator
		System.out.println("\nListar dados do Set:");
		Iterator<Integer> it = numeros.iterator(); //cria o Iterator
		while (it.hasNext()) { //enquanto existir um proximo elemento
			System.out.println(it.next()); //mostra esse elemento
		}

		leia.close();
	}
}
