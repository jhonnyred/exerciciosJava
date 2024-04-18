package aula8;

import java.util.Scanner;

public class Ene {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("SOMA DE PARES AD INFINITUM\n");

        System.out.print("Insira um número: ");
        int numN = input.nextInt();

        int soma = 0;
        for (int i = 2; i <= numN; i+=2){
            soma = soma+i;
        }

        System.out.println(soma);
        input.close();
    }
}
