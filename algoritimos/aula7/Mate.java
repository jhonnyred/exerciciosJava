package aula7;

import java.util.Scanner;

public class Mate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA\n");
        System.out.println("(1) adição (2) subtração (3) multiplicação (4) divisão");
        
        System.out.print("Primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("operação (use o menu acima): ");
        int ope = input.nextInt();

        System.out.print("Segundo numero: ");
        int num2 = input.nextInt();

        switch(ope){
            case 1:
                System.out.println(num1+ " + " +num2+ " = " +(num1+num2));
                break;
            case 2:
                System.out.println(num1+ " - " +num2+ " = " +(num1-num2));
                break;
            case 3:
                System.out.println(num1+ " * " +num2+ " = " +(num1*num2));
                break;
            case 4:
                System.out.println(num1+ " / " +num2+ " = " +(num1/num2));
                break;
            default:
                System.out.println("Escolha entre as 4 opções");
        }
        input.close();
    }
}
