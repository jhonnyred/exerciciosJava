package aula9;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA DE FATORIAL!!!!!!");

        System.out.print("Fatorial: ");
        int num = input.nextInt();

        int fato = 1;
        
        for (int i = 1; i <= num; i++){
            fato *= i;
        }

        System.out.println("Fatorial de " +num+ " é: " +fato);
        input.close();
    }
}
