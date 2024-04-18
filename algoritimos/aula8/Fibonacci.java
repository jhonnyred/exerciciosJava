package aula8;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("FIBONACCI");

        int primeiro = 1;
        int segundo = 1;
        int soma = 1;

        System.out.print("Digite o termo de fibonnaci que deseja descobrir: ");
        int num = input.nextInt();

        for (int i = 3; i <= num; i++){
            soma = segundo + primeiro;
            primeiro = segundo;
            segundo = soma;
        }

        System.out.println(soma);
        input.close();
    }
}
