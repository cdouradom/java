package operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int numero = 4;
		
		System.out.println(numero += 2); // é a mesma coisa de fazer assim: System.out.println(numero = numero + 2);
		// mas se eu faço as duas linhas junto, a primeira execução vai refletir no calculo da segunda
		System.out.println(numero = numero + 2);

	}

}
