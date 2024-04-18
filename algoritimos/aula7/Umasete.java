package aula7;

import java.util.Scanner;

public class Umasete{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("DIA DA SEMANA");

        System.out.print("Digite um número de 1 a 7: ");
        int numero = input.nextInt();

        switch (numero){
            case 1:
               System.out.println("Domingo");
               break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Digite somente números e de 1 a 7");
        }
        input.close();
    }
}