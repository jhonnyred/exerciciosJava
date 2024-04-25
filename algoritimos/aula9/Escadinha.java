package aula9;

import java.util.Scanner;

public class Escadinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean check = false;
        int escadinha = 0;

        for (int i = 0; i <= 1000000000; i++) {
            if (check == false) {
                escadinha += 1;
                for (int j = 0; j <= escadinha; j++) {
                    System.out.print(" ");
                    if (escadinha == 115) {
                        check = true;
                    }
                }
            } else {
                escadinha -= 1;
                for (int j = 0; j <= escadinha; j++) {
                    System.out.print(" ");
                    if (escadinha == 0) {
                        check = false;
                    }
                }
            }
            System.out.println("###");

        }
        input.close();
    }
}