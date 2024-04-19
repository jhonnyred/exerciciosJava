package aula8.aula8_AC2;

import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args) {
        float media = 0;
        boolean prodigio = true;
        String nota_menor = "\nNotas abaixo da nota mínima necessária: ";

        // INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");

        // NOTA MINIMA
        System.out.print("Insira nota minina global: ");
        float minima = input.nextFloat();

        //NOTAS
        System.out.print("Digite quantas notas serão calculadas: ");
        int quantia = input.nextInt();

        float valor = 0;
        String nota = "";
        String notas = "";
        //Aqui foram necessários criar 3 variáveis para manter o sistema com os implementos anteriores
        //[valor] é a variável onde ocorre as operações e tem seu valor somado a variavel [media], que se tinha antes
        //A primeira string [nota], no singular, é para conseguir isolar a nota especifica q esta sendo trabalhada,
        //não seria possível permanecer com a nota mínima somente com uma unica string, pois
        //notas acima da minima iriam ser armazenadas também
        //A string [notas] serve para armazenar todas as notas por nome e mostrar isso ao usuário posteriormente

        for (int i = 1; i <= quantia; i++){
            System.out.print("Nome da nota: ");
            nota = input.nextLine();

            System.out.print("Nota: ");
            valor = input.nextFloat();
            nota = nota +": "+ valor + " ";
            notas = notas + nota + "\n";

            if (minima > valor){
                nota_menor = nota_menor + nota; 
            }

            System.out.print("Peso: ");
            valor = valor*input.nextFloat();

            media = media + valor;
        }



        // SAÍDA
        System.out.println(notas);
        System.out.format("\nMedia Final: %.2f", media);
        if (prodigio == false) {
            System.out.println("\n" + nota_menor);

        } else {
            System.out.println("\nTodas suas notas estao acima da nota minima, Parabens!!! :D");
        }

        // APROVACAO
        if (media <= 2) {
            System.out.println("\nREPROVADO");
        } else if (media <= 4.9) {
            System.out.println("\nSUBSTITUTIVA NECESSARIA");
        } else {
            System.out.println("\nAPROVADO");
        }

        input.close();
    }
}
