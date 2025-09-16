package condicionais; // pacote onde a classe está localizada

import java.util.Scanner; // importando a classe Scanner para capturar entrada do teclado

public class Notas {

	public static void main(String[] args) {
		
		// criando um objeto Scanner para ler dados digitados pelo usuário
		Scanner leia = new Scanner(System.in);
		
		// Declaração das variáveis para armazenar as 4 notas e a média
		float nota1, nota2, nota3, nota4, media;
		
		System.out.printf("\nDigite a primeira nota: "); // Solicita e lê a primeira nota
		nota1 = leia.nextFloat();
		
		System.out.printf("\nDigite a segunda nota: "); // Solicita e lê a segunda nota
		nota2 = leia.nextFloat();

		System.out.printf("\nDigite a terceira nota: "); // Solicita e lê a terceira nota
		nota3 = leia.nextFloat();
		
		System.out.printf("\nDigite a quarta nota: "); // Solicita e lê a quarta nota
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4; // Calcula a média das quatro notas
		System.out.printf("\nA media do aluno eh %.2f.\n", media); // Exibe a média formatada com duas casas decimais
		
		// Estrutura condicional para avaliar o resultado do aluno
		if(media >= 7)
			{
			// Se a média for maior ou igual a 7 → aprovado
			System.out.println("\nAluno aprovado!");
		}
		else if(media >= 5 && media <7) {
			// Se a média for entre 5 (inclusive) e 7 (exclusivo) → recuperação
			System.out.println("\nAluno em recuperacao (exame)!");
		}
		else {
			// Caso contrário (média menor que 5) → reprovado
			System.out.println("\nAluno reprovado!");
		}
		
		// Fecha o objeto Scanner para liberar os recursos
		leia.close();
	}
}
