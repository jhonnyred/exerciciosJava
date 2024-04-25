package aula9;

import java.util.Scanner;

public class Estrelinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ESCADINHA DE ESTRELINHAA >:D");

        System.out.print("Numero maximo de estrelinha: ");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        input.close();
    }
}
