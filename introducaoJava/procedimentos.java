import java.util.Scanner;

public class procedimentos {

    // Colocando essas variáveis fora do metódo detectorPeso e de maneira static
    // Elas se tornam variáveis globais dentro do metódo procedimentos

    // Isso é uma variável global
    static String nomeMaisPesado = "";
    static int maiorPeso = 0;


    // isso é um procedimento,
    // pois não retorna valor
    // Void significa que não retorna valor
    // String nome e int peso são os parametros que são utilizados no metódo main

    static void detectorPeso(String nome, int peso) {

        if (peso > maiorPeso) {
            nomeMaisPesado = nome;
            maiorPeso = peso;
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o nome:");
            String nome = teclado.next();

            System.out.print("Informe seu peso: ");
            int peso = teclado.nextInt();

            detectorPeso(nome, peso);

        }
        System.out.println("A pessoa mais pesada é o(a)" + nomeMaisPesado + " e o seu peso é: " + maiorPeso);

    }
}
