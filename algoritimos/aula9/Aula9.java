package aula9;

import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contV = 0, contC = 0;

        System.out.print("Digite a frase: ");
        String frase = input.nextLine();

        for (int carac = 0; carac < frase.length(); carac++) {
            for (int letras = 'a'; letras <= 'z'; letras++) {
                if (frase.charAt(carac) == letras) {

                    if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
                        contV++;

                    } else {
                        contC++;
                    }
                }
            }
        }
        System.out.println("vogais: " + contV + " consoantes: " + contC);
        input.close();
    }
}
