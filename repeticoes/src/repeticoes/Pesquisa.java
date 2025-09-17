package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		// criando um objeto Scanner para ler dados digitados pelo usuário        
    	Scanner leia = new Scanner(System.in); 
    	
    	// criando as variaveis
    	int idade, esporte = 0, totalRespostas = 0, futebol = 0, voleiM18 = 0, basquetem18 = 0;
    	long somaIdades = 0;
    	double mediaIdades = 0;
    	String continua = "S";
    	
    	// iniciando o laco de repeticao
    	while(continua.equalsIgnoreCase("S")) {
    		
    		//entrada de dados
    		System.out.println("PESQUISA  - ESPORTE FAVORITO");
    		
    		System.out.println("Digite a sua idade: ");
    		idade = leia.nextInt();
    		
    		System.out.println("1 - Futebol");
    		System.out.println("2 - Voleibol");
    		System.out.println("3 - Basquetebol");
    		    		
    		System.out.println("Digite o seu esporte favorito: ");
    		esporte = leia.nextInt();
    		
    		//total de pessoas que gostam de futebol
    		if (esporte == 1) {
    			futebol ++;    			
    		}
    		 //total de pessoal que gostam de voleibol e sao maiores de 18 anos
    		if (esporte == 2 && idade >= 18) {
    			voleiM18 ++;
    		}
    		//total de pessoal que gostam de basquete e sao menores de 18 anos
    		if (esporte == 3 && idade <= 18) {
    			basquetem18 ++;
    		}
    		
    		somaIdades += idade;
    		totalRespostas ++;
    		
    		System.out.println("Deseja continuar (S/N");
    		leia.skip("\\R"); // essa linha eh necessaria para ignorar o /n que pulou a linha, sem esse /R o nextline nao acontece e trava o codigo
    		continua = leia.nextLine().toUpperCase();
    	}
    		mediaIdades = (double) somaIdades / totalRespostas;
    		
    		System.out.printf("Total de pessoas que gostam de futebol: %d\n", futebol);
    		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d\n", voleiM18);
    		System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d\n", basquetem18);
    		System.out.printf("Media idades: %.2f\n", mediaIdades);
    		
    		leia.close();
	}
}	