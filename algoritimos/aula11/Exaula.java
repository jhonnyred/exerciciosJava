package aula11;

import java.util.Scanner; 

public class Exaula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        System.out.println("media: " + (soma/5));

        input.close();
    }
}
