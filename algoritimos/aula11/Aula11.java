package aula11;

public class Aula11{
    public static void main(String[] args){
        //Vetores ou arrays são uma coleção de variáveis. Na memória a definição de vetor é: "espaços consecutivos na memória"
        //Para introduzir um vetor deve-se limitar o tamanho do vetor e só é possível criar vetores de uma mesmo tipo de memória
        //O acesso é aleatório, pode-se acessar qualquer um dos elementos a qualquer momento
        //A seguintaxe de um vetor é a seguinte:

        int [] vetorDeNumeros = new int[5];

        //"A palavra reservada 'new' é para criar novos vetores, apenas aceitem"
        //a função .length mostra o tamanho de um vetor

        //COMO ACESSAR DADOS DE UM VETOR??
        //Para acessar uma variável específica de um vetor basta indicar através de um índice:
        
        //int variavel = vetorDeNumeros[4]

        //Essa linha esta atribuindo a variavel alocada na posição 4 de um vetor para a variavel


        //A melhor maneira de acessar um vetor é pelo loop for, o professor deixou a seguinte sintaxe:


        for (int i = 0; i < vetorDeNumeros.length; i ++){
            System.out.println("Figurinha na posicao: " +i+ ": " + vetorDeNumeros[i]);
        }
    }
}