package aula8;

import java.util.Scanner;

public class Escadinha{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //for (inicialização [i, j, x, y]; condição [o limite dessa contagem]; incremento/decremento [como vai ser essa contagem];){
        // variaveis acumuladoras  variaveis que acumulam valores
        //}
        boolean inicio = true;
        for (int i = 0; i <= 10; i++){
            
            if (inicio == true){
                System.out.println(i);
                inicio = false;
            
            }else{
                for (int j = 1; j <= i; j++){
                    System.out.print(" ");
                }
                System.out.print(i + "\n");
            }
        }

        input.close();
    }
}