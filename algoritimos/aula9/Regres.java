package aula9;

import java.util.Scanner;

public class Regres {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CONTAGEM REGRESSIVA DE LETRAS");

        System.out.print("Digite uma letra: ");
        char letra = input.next().charAt(0);

        System.out.println(letra);

        char letra2 = letra;

        for (int i = 'z' ; i <= 'a'; i--){
            letra = (char)(i + '0');

            System.out.println(letra);
        }
        input.close();
    }
}
