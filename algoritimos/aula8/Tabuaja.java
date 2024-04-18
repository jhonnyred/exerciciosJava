package aula8;

import java.util.Scanner;

public class Tabuaja {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("TABUADADO");
        
        System.out.print("Digite uma tabuada de 1 a 10: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero +" x "+ i + " = " + (numero * i));
        }

        input.close();
    }
}
