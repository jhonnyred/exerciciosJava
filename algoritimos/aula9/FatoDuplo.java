package aula9;

import java.util.Scanner;

public class FatoDuplo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA DE FATORIAL DUPLO!!!!!!");

        System.out.print("Fatorial: ");
        int num = input.nextInt();

        int fato = 1;
        int fato2 = 1;
        
        for (int i = 1; i <= num; i++){
            System.out.println(i);
            fato *= i;
            if (i%2 == 0){
                fato2 *= i; 
            }
        }

        System.out.println("Fatorial de " +num+ " é: " +fato+ "\nFatorial duplo: " +fato2);
        input.close();
    }
}
