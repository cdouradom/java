package atividades_java_5_3;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			// Definindo as variáveis
			float nota1, nota2, nota3, nota4;
			int media = 4;
			
			// Entrada de dados
			System.out.printf("Digite a primeira nota: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir
			nota1 = leia.nextFloat(); //nota1 é uma das variáveis que declarei na linha 11 //leia.nextDouble é o que vai armazenar o valor 

			System.out.printf("Digite a segunda nota: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
			nota2 = leia.nextFloat(); //nota2 é a outra variável que declarei na linha 11 //leia.nextDouble é o que vai armazenar o valor

			System.out.printf("Digite a terceira nota: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
			nota3 = leia.nextFloat(); //nota3 é a outra variável que declarei na linha 11 //leia.nextDouble é o que vai armazenar o valor
			
			System.out.printf("Digite a quarta nota: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
			nota4 = leia.nextFloat(); //nota4 é a outra variável que declarei na linha 11 //leia.nextDouble é o que vai armazenar o valor
			
			// Efetuar os cálculos
			System.out.printf(
					"A media das notas é = %.2f\n", 
					(nota1 + nota2 + nota3 + nota4) / media // aqui estou apenas dando o resultado, calculando a media que declarei na linha 12
				); 
		}

	}

}
