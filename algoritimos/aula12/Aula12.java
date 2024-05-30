package aula12;

public class Aula12{
    public static void main(String[] args){
        // int[] vetor; inicializa um vetor
        // vetor = new int[x] aloca um espaço na memória para o vetor
        // vetor = new int[x+1] aloca um espaço maior na memória para o mesmo vetor, mas todos os dados contido no vetor serão excluídos
        
        //MATRIZES
        //se o vetor é um segmento na memória que segue somente um eixo (X ou Y) uma matriz é o "dobro" disso
        //uma matriz usa do eixo X e do eixo Y e demais eixos possíveis para armazenar as informações
        //ou seja, uma matriz pode armazenar infromações com endereçamento para quantos eixos forem definidos para a matriz
        //logo se uma matriz possui eixo Y,X e Z então o enderaçemento das infromações contidas nessa mtrix terá 3 variáveis
        //para acessar uma informação na matrix é preciso enderaçar onde este dado encontra-se em todos os eixos dessa matriz
        //uma matriz com 2 eixos terá 2 variáveis para endereçar um dado, uma matrix com 3 eixos terá 3 variáveis para endereçar um dado
        //para consegui navegar dentro de uma matrix é necessário um for para cada eixo, logo se para um vetor é necessário somente um for 
        //para uma matriz é necessário um for para cada eixo alocado, ou seja, um for para o eixo X, outro para o eixo Y e assim para os demais eixos
        //a syntaxe para acessar uma matriz é matriz [x][y]

        //"A matriz acaba sendo um vetor de vetores"


        //SYNTAXE DA MATRIZ
        
        int[][] matriz = new int[2][2];
        
        //caso queira adicionar mais um eixo a matriz

        int[][][] matriz2 = new int[3][3][3];

        //uma matriz com os dados inicializado fica:

        int [][] matriz3 ={{3,6,9},{2,4,6}};
        //duas linhas mas 3 colunas por conta do armazenamento de dados
        //nesse caso se quiser adicionar mais uma linha basta colocar mais uma vírgula seguido de uma chave e os dados desejados na chave

        

    }
}