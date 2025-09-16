package atividades_java_5_3;

import java.util.Scanner;

public class Salario_Abono {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono; // declarando as variaveis do tipo float
		
		System.out.printf("Digite o salario\n"); // exibindo uma orientação para o usuário digitar
		salario = leia.nextFloat(); //leia.nextFloat é o que vai armazenar o valor deste tipo
		
		System.out.printf("Digite o abono\n"); // exibindo outra orientação para o usuário digitar
		abono = leia.nextFloat(); //leia.nextFloat é o que vai armazenar o valor deste tipo
		
		System.out.printf("Seu salário total é: %.2f", salario + abono); //resposta final exibida ao usuário
		
		leia.close();

	}

}
