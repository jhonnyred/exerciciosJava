package aula10;

import java.util.Scanner;

public class Aula10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("SOME ATÉ 100!!!");
        int soma = 0, cont = 0;

        while(soma < 100){
            System.out.print("Digite o " + (cont + 1) + " numero: ");
            soma += input.nextInt();

            cont++;
            System.out.println("\nSoma: " + soma);
        }
        input.close();

        //do while eh para quando eh necessario executar pelo menos uma vez o while para que esse decida se deve continuar ou nao
        // a sintaxe eh:
        //do{
        //}while(condicao);
        //repare que somente nesse caso o while tem ";"
        //esse modo permite uma primeira iteracao antes que o while avalie a condicao, por isso fica no final
    }
}