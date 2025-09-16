package atividades_java_6_2;
import java.util.Scanner; // importando a classe Scanner para capturar entrada do teclado
public class Atividade5 {
    public static void main(String[] args) {   
		// criando um objeto Scanner para ler dados digitados pelo usuário        
    	Scanner leia = new Scanner(System.in);       
        int codigo, quantidade;
        String produto = "";
        double preco = 0, total;
        
        // Entrada de dados
        System.out.printf("Digite o código do produto, de 1 a 6: ");
        codigo = leia.nextInt();
        
        System.out.printf("Digite a quantidade para o produto: ");
        quantidade = leia.nextInt();
        
        // Escolha do produto usando switch
        switch (codigo) {
            case 1: produto = "Cachorro Quente"; preco = 10.00;
                break;
            case 2: produto = "X-Salada"; preco = 15.00;
                break;
            case 3: produto = "X-Bacon"; preco = 18.00;
                break;
            case 4: produto = "Bauru"; preco = 12.00;
                break;
            case 5: produto = "Refrigerante"; preco = 8.00;
                break;
            case 6: produto = "Suco de Laranja"; preco = 13.00;
                break;
            default: System.out.println("Código inválido! Digite um número entre 1 e 6.");
                
            leia.close();
                return; // encerra o programa
        	}
        
        // Cálculo do valor total
        total = quantidade * preco;
        
        // Saída de dados
        System.out.println("\nProduto: " + produto);
        System.out.printf("Valor total: R$ %.2f\n", total);
        
     // Fecha o objeto Scanner para liberar os recursos
        leia.close();
    }
}