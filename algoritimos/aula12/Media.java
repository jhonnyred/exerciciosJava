package aula12;

import java.util.Scanner;

public class Media {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int n = 4, m = 5;
        int [][] matriz = new int[n][m];
        float[] medias = new float[n];

        for(int contN = 0; contN < n; contN++){
            for( int contM = 0; contM < m; contM++){
                System.out.print("Digite o valor para a posicao " + contN + " X " + contM + ": ");
                matriz[contN][contM] = input.nextInt();
            }
        }

        
        int somaTmp = 0;
        for(int contN = 0; contN < n; contN++){
            for( int contM = 0; contM < m; contM++){
                somaTmp += matriz[n][m]; 
            }
            medias[contN] = somaTmp/m;
            somaTmp = 0;
        }

        for (int contN=0; contN < n; contN++){
            System.out.println("Media da linha " +contN+ " :" +medias[contN]);
        }
        
        input.close();
    }
}
