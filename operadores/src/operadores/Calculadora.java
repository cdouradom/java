package operadores;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner (Entrada de dados)
		Scanner leia = new Scanner(System.in); //
		
		// Definir as variáveis
		double numero1, numero2;
		
		// Entrada de dados
		System.out.println("Digite o primeiro número: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir
		numero1 = leia.nextDouble(); //numero1 é uma das variáveis que declarei na linha 13 //leia.nextDouble é o que vai armazenar o valor 
	
		System.out.println("Digite o segundo número: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
		numero2 = leia.nextDouble(); //numero2 é a outra variável que declarei na linha 13 //leia.nextDouble é o que vai armazenar o valor
		
		// Efetuar os cálculos
			//System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2); // aqui posso exibir os valores e a soma
		System.out.printf("O valor da soma é = %.2f\n", numero1 + numero2); // aqui estou apenas dando o resultado da soma
		System.out.printf("O valor da subtração é = %.2f%n", numero1 - numero2);
		System.out.printf("O valor da multiplicação é = %.2f\n", numero1 * numero2);
		System.out.printf("O valor da divisão é = %.2f%n", numero1 / numero2);
			// para usar essa formtação posso usar o \n 'ou' %n
		
		// Função com método de potência - usando a classe math
		System.out.printf("A potência do número %.2f = %.2f\n", numero1, Math.pow(numero1, numero2));
		
		// Função com método de raíz quadrada - usando a classe math
		System.out.printf("A raiz quadrada de %.2f = %.2f\n", numero1, Math.sqrt(numero1));
		
		//em todas as operação o '%.2f' é o valor da variável, onde posso exibir ou apenas calcular, mas é o que referencia o valor com o nome da variável
	}

}
