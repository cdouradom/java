package repeticoes;

import java.util.Scanner;

public class Menu_WhileDo {
	public static void main(String[] args) {

		// criando um objeto Scanner para ler dados digitados pelo usuário        
    	Scanner leia = new Scanner(System.in);  
    	
    	int opcao = 1;
		do {
			System.out.println("Digite a opcao desejada: ");
			opcao = leia.nextInt();
			
		}while(opcao <= 10);
	}

}
