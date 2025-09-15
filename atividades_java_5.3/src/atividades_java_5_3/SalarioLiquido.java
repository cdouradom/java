package atividades_java_5_3;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
					
		// Definindo as variáveis
		float sal_bruto, adic_noturno, extras, descontos;
		
		// Entrada de dados
		System.out.printf("Digite o salario bruto do colaborador: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir
		sal_bruto = leia.nextFloat(); //sal_bruto é uma das variáveis que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor 

		System.out.printf("Digite o adicional noturno do colaborador: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
		adic_noturno = leia.nextFloat(); //adic_noturno é a outra variável que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor

		System.out.printf("Digite as horas extras do colaborador: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
		extras = leia.nextFloat(); //extras é a outra variável que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor
		
		System.out.printf("Digite o total dos descontos do colaborador: "); //System.out.println("texto livre") -- isso é a interação com o usuário e aguarda obter um valor para seguir	
		descontos = leia.nextFloat(); //descontos é a outra variável que declarei na linha 12 //leia.nextDouble é o que vai armazenar o valor
		
		// Efetuar os cálculos
		System.out.printf(
				"O salario liquido do colaborador é = %.2f\n",
				sal_bruto + adic_noturno + (extras * 5) - descontos); // calculo usando o valor de extra multiplicado por 5 como pede no exercicio
		}	
	
	}
}