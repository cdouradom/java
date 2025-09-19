package vetores; //nome do projeto

import java.util.Arrays; //biblioteca - essa linha precisa ser incluida sempre que utilizo a linha Arrays.sort(nomedodado);
import java.util.Collections;
import java.util.Scanner; //biblioteca - essa linha precisa ser incluida sempre que utilizo a linha Scanner leia = new Scanner(System.in);

public class Vetores { //nome da classe/arquivo

	public static void main(String[] args) { //essa linha eh obrigatoria em toda classe sempre assim
		
		Scanner leia = new Scanner(System.in); //essa linha eh para ter um texto exibido para o usuario, para o usuario interagir
		
		String nomes [] = {"Cintia", "Stella", "Patricia", "Rafaela", "Leticia", "Marcia", "Ana"}; //sao os dados do vetor ja declarados nestas posicoes
		int numeros [] = new int [5]; //aqui ja eh um vetor sem dados declarados, ou seja, estao vazios
		
		System.out.println("Listagem - Vetor de Nomes");
		
			//ordenar o vetor
		
		Arrays.sort(nomes, Collections.reverseOrder());

		
		for(int indice = 0; indice < nomes.length; indice ++) {	
			System.out.printf("nomes [%d] = %s\n", indice, nomes[indice] );
		}
		
		System.out.println("\nInput de dados - Vetor de Numeros");
		for(int indice = 0; indice < numeros.length; indice ++) {	
			System.out.printf("Digite um numero: ");
			numeros[indice] = leia.nextInt();
		}
		Arrays.sort(numeros);
		
		System.out.println("\nListagem - Vetor de Numeros");
		for(int indice = 0; indice < numeros.length; indice ++) {	
			System.out.printf("numeros [%d] = %s\n", indice, numeros[indice] );
		}

		leia.close();
		
	}

}
