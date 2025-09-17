package atividade_7_2;

import java.util.Scanner; 

public class ContandoIdades {

    public static void main(String[] args) {

    	//criando um objeto Scanner para ler dados digitados pelo usuário
        Scanner leia = new Scanner(System.in);

        //variaveis
        int menores21 = 0; 
        int maiores50 = 0;
        int entre = 0;
        int idade = 0; //para armazenar a idade digitada

        //iniciando a estrutura de repetição while: vai repetir ate que a idade seja negativa
        while (true) { 
            System.out.print("Digite uma idade: "); // pede a idade ao usuario
            idade = leia.nextInt(); // le a idade digitada

            //quando a idade for negativa, sai do laco
            if (idade < 0) {
                break; // encerra o while
            }

            //aqui verifica se a idade digitada eh menor que 21 anos
            if (idade < 21) {
                menores21++; //soma +1
            }

            //aqui verifica se a idade digitada eh maior que 50 anos
            if (idade > 50) {
                maiores50++; // soma +1
            }
            
            //aqui verifica se a idade digitada esta entre 21 e 50 anos
            if (idade >= 21 && idade <= 50) {
                entre++; // soma +1
            }
        }

        //exibindo o resultado
        System.out.println("Total de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
        System.out.println("Total de pessoas que tem idade entre 21 e 50 anos: " + entre);

        leia.close();
    }
}
