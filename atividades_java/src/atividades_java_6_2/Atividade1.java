package atividades_java_6_2;
import java.util.Scanner; // importando a classe Scanner para capturar entrada do teclado
public class Atividade1 {
	public static void main(String[] args) {
		// criando um objeto Scanner para ler dados digitados pelo usuário
		Scanner leia = new Scanner(System.in);	
		int valorA;
		int valorB;
		int valorC;
		int somaAeB;
		// Entrada de dados
		System.out.printf("Digite o primeiro valor para A: ");
		valorA = leia.nextInt(); 
		System.out.printf("Digite o primeiro valor para B: ");
		valorB = leia.nextInt();
		System.out.printf("Digite o primeiro valor para C: "); 
		valorC = leia.nextInt();
		// soma dos valores A e B para usar na estrutura condicional
		somaAeB = (valorA + valorB);
		System.out.printf("\nA soma de A + B eh: %d\n", somaAeB);
		// Estrutura condicional para avaliar se o valor eh maior, menor ou igual
		if (somaAeB > valorC) {
			System.out.printf("\nA Soma dos valores A + B é MAIOR do que C\n", valorA, valorB, valorC, somaAeB); //exibindo o resultado se cair nessa condicao
			}
		else if (somaAeB < valorC) {
			System.out.printf("\nA Soma dos valores A + B é MENOR do que C\n", valorA, valorB, valorC, somaAeB); //exibindo o resultado se cair nessa condicao
			}
		else if (somaAeB == valorC){
			System.out.printf("\nA Soma dos valores A + B é IGUAL do que C\n", valorA, valorB, valorC, somaAeB); //exibindo o resultado se cair nessa condicao
			}	
		// Fecha o objeto Scanner para liberar os recursos
		leia.close();
	}
	
}
