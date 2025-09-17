package repeticoes;

import java.util.Scanner;

public class TabuabaWhile {

	public static void main(String[] args) {

		// criando um objeto Scanner para ler dados digitados pelo usuário        
    	Scanner leia = new Scanner(System.in);  
    	
		int numero;
		int contador = 1;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		/*iniciando o laco de repeticao 
		 * dentro dos parenteses - pois o laco precisa de uma regra para fazer a repeticao
		 * primeira condicao eh o inicio - int contador = 1;
		 * depois a regra de parada - contador <= 10;
		 * e por ultimo vem a regra de incremento para aumentar um numero (contador ++)
		 * 
		 */
		while(contador <= 10) {
		System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
		 contador ++;
		}		
		
	}

}

/* modo debug 
 * > clicar duas vezes na marcacao lateral das linhas
 * clicar na opcao de debug 9desouro ou Window > Persppective > Open perspective > Debug
 * 
 */
