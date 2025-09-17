package atividade_7_2;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        //criando um objeto Scanner para ler dados digitados pelo usuario
        Scanner leia = new Scanner(System.in);

        //variaveis
        int pares = 0;  
        int impares = 0; 

        //iniciando a estutura do laco de repetição FOR para pedir 10 números
        for (int i = 1; i <= 10; i++) { // i começa com 1 e vai ate 10, aumentando de 1 em 1

            System.out.print("Digite o " + i + "º número: "); 
            int numero = leia.nextInt(); 

            if (numero % 2 == 0) { // aqui esta a condicao para verificar se o número eh par ou impar - se o resto da divisão por 2 for 0, eh par
                pares++; // soma +1 no contador de pares
            } else { //condicao se não, eh ímpar
                impares++; // soma +1 no contador de mpares
            }
        }

        //exibir o resultado na tela
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        leia.close();
    }
}