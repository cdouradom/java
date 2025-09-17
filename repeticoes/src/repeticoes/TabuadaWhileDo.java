package repeticoes;

import java.util.Scanner;

public class TabuadaWhileDo {

	public static void main(String[] args) {

		// criando um objeto Scanner para ler dados digitados pelo usuário        
    	Scanner leia = new Scanner(System.in);  
    	
		int numero;
		int contador = 1;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		do {
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
			 contador ++;		
		}
		while(contador <= 10);

	}		
	
}
