package aula9;

import java.util.Scanner;

public class Npares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SOMA DOS PRIMEIROS PARES");

        System.out.print("Digite o maximo: ");
        int soma = 0, num = input.nextInt();

        for (int i = 0; i <= num; i += 2) {
            System.out.println(i);
            soma += i;
        }

        System.out.println(soma);
        input.close();
    }
}
