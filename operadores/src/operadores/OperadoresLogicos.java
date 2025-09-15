package operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int a = 3; // declarando variáveis inteiras
		int b = 6; // declarando variáveis inteiras
		
		System.out.println(a == 2 && b == 6); // essa linha retorna false, pois && precisa de ambos verdadeiros para ser true
		System.out.println(a == 3 && b == 6); // essa linha retorna true, pois ambos sao verdadeiros
		System.out.println(a == 4 && b == 5); // essa linha retorna false, pois && precisa de ambos verdadeiros para ser true
		
		System.out.println("Acima estao os exemplos de operador 'e', usando &&\n"); //separando cada situacao	
		
		System.out.println(a == 3 || b == 6); // essa linha retorna true, pois os dois sao verdadeiros e || precisa de um deles verdadeiro para ser true
		System.out.println(a == 3 || b == 7); // essa linha retorna true, pois um deles eh verdadeiro e || precisa de um deles verdadeiro para ser true
		System.out.println(a == 4 || b == 5); // essa linha retorna false, pois nenhum eh verdadeiro e || precisa de um deles verdadeiro para ser true
		
		System.out.println("Acima estao os exemplos de operador 'ou', usando ||\n"); //separando cada situacao	

		System.out.println(!(a == 3 || b == 6)); // essa linha retorna false, pois os dois sao verdadeiros e ! inverte a resposta da condiçao que eh true
		System.out.println(!(a == 3 || b == 9)); // essa linha retorna false, pois os dois sao verdadeiros e ! inverte a resposta da condiçao que eh true
		System.out.println(!(a == 1 || b == 4)); // essa linha retorna true, pois um nao eh verdadeiro e ! inverte a resposta da condiçao que eh false
		System.out.println(!(a == 3 && b == 6)); // essa linha retorna false, pois os dois sao verdadeiros e ! inverte a resposta da condiçao que eh true
		System.out.println(!(a == 3 && b == 9)); // essa linha retorna true, pois um nao sao verdadeiro e ! inverte a resposta da condiçao que eh false
		System.out.println(!(a == 1 && b == 4)); // essa linha retorna true, pois ambos nao sao verdadeiros e ! inverte a resposta da condiçao que eh false
		
		System.out.println("Acima estao os exemplos de operador 'nao', usando !, mas usando o operador 'ou' e na sequenia o 'e'\n"); //separando cada situacao	
	}
}
