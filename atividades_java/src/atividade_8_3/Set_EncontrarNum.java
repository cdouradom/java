package atividade_8_3;

import java.util.HashSet; //biblioteca para a classe HashSet
import java.util.Scanner; //biblioteca para a classe Scanner

public class Set_EncontrarNum {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//criar a Collection Set de Integer
		HashSet<Integer> numeros = new HashSet<>();

		//se o numero eh menor que 10 adiciona 1
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}

		//mostrando os numeros do Set
		System.out.println("Numeros:");
		for (int n : numeros) {
			System.out.println(n);
		}

		//pedir para o usuario digitar um numero
		System.out.print("\nDigite o numero que você quer buscar: ");
		int numero = leia.nextInt();

		//verificando se o número está no Set
		if (numeros.contains(numero)) {
			System.out.println("O numero " + numero + " foi encontrado!");
		} else {
			System.out.println("O numero " + numero + " não foi encontrado!");
		}

		leia.close();
	}
}
