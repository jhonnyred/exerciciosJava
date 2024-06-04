package aula13.aula13_AF;

import java.util.Scanner;

public class Af {
    public static void main(String[] args){
        // VARIÁVEIS BOOLEANS
        boolean prodigio = true;   //controla if responsavel pela exibicao de notas abaixo da minima                      (opera a nivel do primeiro for)
        boolean first = true;      //controla primeiro if dentro do for                                                   (opera a nivel do primeiro for)
        boolean check = false;     //permite a iteração dentro do while                                                   (opera no verificador de peso e no DO WHILE)
        boolean reinserir = false; //permite a reinserção de dados                                                        (opera no DO WHILE)

        // VARIÁVEIS 'ARMAZÉM'    (operam a nivel do PRIMEIRO FOR ou acima dele)
        String nota_menor = "";    //armazena todas notas abaixo da minima de um aluno por iteração
        String ficha = "";         //armazena a ficha de um aluno por iteração
        String[][] nomes;          //matriz contendo nome dos alunos e das notas
        String nome = "";
        float[][] data;             *
        float media = 0;           //armazena a media de um aluno por iteração
        float mediasTmp = 0;          *//armazena a somatoria das medias                                                      (opera no último FOR)
        float minima = 0;          //armazena a nota mínima global
        
        // VARIÁVEIS 'OPERADORAS' (operam a nivel do SEGUNDO FOR)
        String nota = "";          //nome da nota por iteração
        float resposta = 0;        //resposta para reinserção de dados
        int iteracao = 0;
        
        // INTRODUCAO
        Scanner input = new Scanner(System.in);
        System.out.println("\n>> MEDIA FINAL <<");
        
        //DEFINIÇÃO DAS MATRIZES
        int alunosTmp = 0;
        int quantiaTmp = 0;           
        for(int i=0; i<3; i++){//FOR 1
            // NUMERO DE ALUNOS
            if (i == 0){
                System.out.print("Insira o numero de alunos: ");
                alunosTmp = input.nextInt();
            }
            // NUMERO DE NOTAS
            if (i == 1){
                System.out.print("Digite quantas notas serão calculadas: ");
                while(quantiaTmp < 1){
                    quantiaTmp = input.nextInt();
                }
                data = new float[(quantiaTmp*2)+1][alunosTmp+2];
                data[0][0] = alunosTmp;
                data[1][0] = quantiaTmp;
                
                //matriz de nomes
                if(quantiaTmp>=alunosTmp){
                    nomes = new String[quantiaTmp][2];
                }else{
                    nomes = new String [alunosTmp][2];
                }

                //atribuição nome notas
                for(int j=0; j < nomes.length; j++){
                    System.out.print("Nome da " +j+ "º nota: ");
                    nomes[1][j] = input.nextLine();
                }
            }
            // NOTA MINIMA
            if (i == 2){
                System.out.print("Insira nota minina global: ");
                data[2][0] = input.nextFloat();
            }
        }//FIM FOR 1
        
        
        //ATRIBUIÇÃO DE PESOS
        float pesoTmp = 0;
        for (int i = 0; i < data[1][0]; i++){//FOR 2
            check = false;
            System.out.print("peso para " +nomes[1][i]+ ": ");
            data[3][i] = input.nextFloat();
            pesoTmp += data[3][i];
            
            //VERIFICADOR DE PESO
            while(check == false){
                if(pesoTmp > 1){
                    System.out.println("Somatória dos pesos: " + pesoTmp);
                    System.out.print("A somatória dos pesos é maior que 100%, por favor insira um valor menor: ");
                    pesoTmp -= data[3][i];
                    data[3][i] = input.nextFloat();
                    pesoTmp += data[3][i];
                }else{
                    check = true;
                }
            }//fim WHILE
        }//fim FOR 2

        for(int i = 0; i < data[0][0]; i++){ // MAIN
            //MANUTENÇÃO DE VARIÁVEIS
            prodigio = true;
            first = true;
            check = false;
            nota_menor = "\nNotas abaixo da nota mínima necessária: ";
            iteracao = 0;
            media = 0;

            System.out.print("\n\nNome: ");
            input.nextLine();
            nomes[i][0] = input.nextLine();

            do{// DO WHILE
                
                //NOTA
                System.out.print( "nota para " +nomes[1][iteracao]+ ": ");
                data[iteracao][i+2] = input.nextFloat();
                
                //NOTAS MINIMAS
                if (data[2][0] > data[iteracao][i+2]){
                    data[(iteracao+quantiaTmp)][i+2] = data[iteracao][i+2];
                    prodigio = false; 
                }else{
                    data[(iteracao+quantiaTmp)][i+2] = 0;
                }

                //MEDIA
                data[(quantiaTmp*2)+1][i+2] *= data[iteracao][1];

                //REINSERIR DADOS
                if(iteracao == (data[1][0]-1)){
                    System.out.print(ficha + "\n\nDESEJA REINSERIR OS DADOS PARA O ALUNO ATUAL? \n(1)SIM (2)NAO\n===> ");
                    resposta = input.nextFloat();

                    if (resposta == 2){
                        check = true; 
                    }else{
                        reinserir = true;
                    }

                }else{
                    iteracao++;
                }
                
                //RESET DE VARIÁVEIS (REINSERIR)
                if (reinserir == true){
                    reinserir = false;
                    iteracao = 0;
                }
            }while(check == false);//*fim do DO WHILE*

            //SAÍDA
            System.out.print(nomes[0][i]);
            for(int j=0; j < data[1][0]; j++){
                System.out.print(nomes[1][j]);
                System.out.println(data[j][i+2]);
            }
            System.out.format("Media Final: %.2f", data[(2*quantiaTmp)+1][i+2]);
            if (prodigio == false) {
                System.out.print("notas abaixo da média: ");
                for(int j=0; j < data[0][1]; j++){
                    if(data[j+quantiaTmp][i+2] != 0){
                        System.out.print(nomes[1][j] +":"+data[j+quantiaTmp][i+2]);
                    }
                }
            } else {
                System.out.println("\nTodas a notas do aluno estao acima da nota minima, bixao é brabo mesmo");
            }

            //APROVACAO
            if (data[(quantiaTmp*2)][i+2] <= 2) {
                System.out.println("REPROVADO\n");
            } else if (data[(quantiaTmp*2)][i+2] <= 4.9) {
                System.out.println("SUBSTITUTIVA NECESSARIA\n");
            } else {
                System.out.println("APROVADO\n");
            }

        }//*fim PRIMEIRO FOR*

        // MÉDIA DAS MÉDIAS
        for(int i = 0; i < data[0][0]; i++){
            mediasTmp += data[(quantiaTmp*2)+1][i+2];
        }

        System.out.println("Media dos alunos: " + (mediasTmp/data[0][0]));
        
        input.close();
    }                 
}
