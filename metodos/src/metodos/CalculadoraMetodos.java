package metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {

		// Instanciar um objeto da Classe Scanner (Entrada de dados)
		Scanner leia = new Scanner(System.in); //

		// Definir as variáveis
		double numero1, numero2, resultadoDivisao;
		

		// Entrada de dados
		System.out.println("Digite o primeiro número: "); 
			/* System.out.println("texto livre") -- isso é a interação com
		 	*o usuário e aguarda obter um valor para seguir
		 	*/
		numero1 = leia.nextDouble(); 
			/* numero1 é uma das variáveis que declarei na linha 13 
			*leia.nextDouble é o
			*que vai armazenar o valor
			*/

		System.out.println("Digite o segundo número: "); 
			/*System.out.println("texto livre") 
			 * -- isso é a interação com o usuário
			*e aguarda obter um valor para seguir
			*/
		numero2 = leia.nextDouble(); 
			//numero2 é a outra variável que declarei na linha 13 
			//leia.nextDouble é o que
			// vai armazenar o valor

		System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, somar(numero1, numero2));
		System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, multiplicar(numero1, numero2));
		
			//System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, dividir(numero1, numero2));
		resultadoDivisao = dividir(numero1, numero2);
		if(resultadoDivisao == -1) {
			System.out.println("Nao existe divisao por zero");
		}else {
			System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, resultadoDivisao);
		}
		
		sobre();
		leia.close();
		
	}

	public static double somar(double numero1, double numero2) { //as variaveis aqui sao parametros deste metodo public -- as la de cima sao do metodo mais, ou sejam sao distintas
		return numero1 + numero2;
		
	}
	
	public static double subtrair(double numero1, double numero2) { //as variaveis aqui sao parametros deste metodo public -- as la de cima sao do metodo mais, ou sejam sao distintas
		return numero1 - numero2;
		
	}
	
	public static double multiplicar(double numero1, double numero2) { //as variaveis aqui sao parametros deste metodo public -- as la de cima sao do metodo mais, ou sejam sao distintas
		return numero1 * numero2;
		
	}	public static double dividir(double numero1, double numero2) { //as variaveis aqui sao parametros deste metodo public -- as la de cima sao do metodo mais, ou sejam sao distintas
		if(numero2 ==0) {
			return 0;
		}
		
		return numero1 / numero2;
		
	}
	public static void sobre() { //metodo sem retorno, apenas printando
		System.out.println("\n*******************************************");
		System.out.println("\nCalculadora desenvolvida por Cintia Dourado");
		System.out.println("\n*******************************************");
	}
}
