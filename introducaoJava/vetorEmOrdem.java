import java.util.Arrays;

public class vetorEmOrdem {
    public static void main(String[] args) {

        int[] numeros = {3,5,1,8,-4,1};

        // Ordenando o vetor
        Arrays.sort(numeros);

        // o binarySearch só funciona quando o vetor está ordenado
        // key é o valor que você está buscando

        int posicao = Arrays.binarySearch(numeros,1);
        System.out.println("Encontrei o valor na posicão: " + posicao);

        // Com esse comando eu transformo todos os valores dentro do meu vetor em nove
        // Arrays.fill(numeros , 9);

        // Utilizando forEach para mostrar os valores do vetor
        for (int valores : numeros){

            System.out.println(valores);
        }
    }
}
