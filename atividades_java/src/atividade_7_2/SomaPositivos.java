package atividade_7_2;

import java.util.Scanner;
	
public class SomaPositivos {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        //variaveis
        int numero;
        int soma = 0; 
        
        //condicao do_while: executa pelo menos uma vez e repete ate a condicao ser falsa
        do {
            System.out.print("Digite um número: "); 
            numero = leia.nextInt(); // le o numero digitado pelo usuario
            
            //uma condicao: se o numero for positivo (maior que 0), eh somado na variavel soma
            if (numero > 0) {
                soma = soma + numero; // soma o numero positivo ao total
            }
            
            // se for negativo, nao faz nada, apenas continua o laco
            // se for zero, o laço vai parar
            
        } while (numero != 0); //outra condicao: repete enquanto o numero digitado nao for 0
        
        //apos sair do laço (quando digitou zero), mostramos o resultado final
        System.out.println("A soma dos números positivos é: " + soma);
        
        leia.close();
    }
}
