package aula10;

import java.util.Scanner;

public class Regressiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char valor = input.nextLine().charAt(0);

        for (char cont = valor; cont <= 97; cont--) {
            System.out.println(cont);
        }
        input.close();
    }
}
