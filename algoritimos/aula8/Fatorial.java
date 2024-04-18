package aula8;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("FATORIAAAAAAAALLLL\n");

        int fatorial = 0;
        boolean first = true;

        System.out.print("Digite >:( : ");
        int num = input.nextInt();

        for(int i = num; i >= 1; i = i-1){
            if (first == true){
                fatorial = i;
                first = false;
                continue;
            
            }else{
                fatorial = fatorial * i;
            }
        }

        System.out.println(fatorial);
        input.close();
    }    
}
