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

        //NUMERO DE NOTAS
        System.out.print("Digite quantas notas serão calculadas: ");
        int quantia = input.nextInt();

        boolean check = false;
        float peso = 0;
        float peso2 = 0;
        String nota = "";
        String nota2 = "\n\n\n";
        float valor = 0;
        //aqui foi necessário criar 2 variáveis para as notas e pesos, basicamente a primeira variavél [nota, peso]
        //são para executar as operações em cada uma das tentativas do for, enquanto a segunda variável [nota2, peso2]
        //funcionam como uma memória secundária onde se acumula todas as informações do for. A memória secundária
        //de [valor] é a variável [média]. Não consegui diminuir o número de variáveis, 
        //creio que esse é o maior defeito deste código.


        for (int i = 1; i <= quantia; i++){
            check = false;
            //reseta a verificacao

            //NOME DA NOTA
            System.out.print("\nNome da nota: ");
            input.nextLine();
            nota = input.nextLine();
            //tive q colocar essa linha extra para conseguir limpar o buffer e remover possíveis "\n"
            //que ficaram, ele tava skippando esse primeiro scanner

            //PESO
            System.out.print("Peso: ");
            peso = input.nextFloat();
            peso2 = peso2 + peso;

            //VERIFICACAO DE PESO
            while (check == false){   
                if(peso2 > 1){
                    System.out.println("Somatória dos pesos: " + peso2);
                    System.out.print("A somatória dos pesos é maior que 100%, por favor insira um valor menor: ");
                    peso2 = peso2-peso;
                    peso = input.nextFloat();
                    peso2 = peso2+peso;
                
                }else{
                    check = true;
                }
            }

            //NOTA
            System.out.print("Nota: ");
            valor = input.nextFloat();
            nota = nota +": "+ valor + " ";
            nota2 = nota2 + nota + "\n";

            //NOTAS MINIMAS
            if (minima > valor){
                nota_menor = nota_menor + nota;
                prodigio = false; 
            }

            //MEDIA
            valor = valor*peso;
            media = media + valor;
        }



        // SAÍDA
        System.out.println(nota2);
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
