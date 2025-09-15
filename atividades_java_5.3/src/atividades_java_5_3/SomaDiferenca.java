package atividades_java_5_3;

import java.util.Scanner;

public class SomaDiferenca {

	public static void main(String[] args) {
				
		try (Scanner leia = new Scanner(System.in)) {
			
			// Definindo as variáveis
			float numero1, numero2, numero3, numero4;
			int media = 4;
			
			// Entrada de dados
			System.out.printf("Digite o primeiro numero: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir
			numero1 = leia.nextFloat(); //numero1 é uma das variáveis que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor 

			System.out.printf("Digite o segundo numero: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
			numero2 = leia.nextFloat(); //numero2 é a outra variável que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor

			System.out.printf("Digite o terceiro numero: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
			numero3 = leia.nextFloat(); //numero3 é a outra variável que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor
			
			System.out.printf("Digite o quarto numero: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
			numero4 = leia.nextFloat(); //numero4 é a outra variável que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor
			 
			// Efetuar os cálculos
			System.out.printf(
					"A difernça do produto entre os valores é = %.2f\n", 
					((numero1 * numero2) - (numero3 * numero4))// aqui estou apenas dando o resultado, calculando a media que declarei na linha 12
						); 
				}

		}

	}
