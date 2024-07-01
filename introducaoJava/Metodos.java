import java.util.Scanner;

public class Metodos {

    // Void significa que é um procedimento
    // indica que não vai ter retorno
    // o metódo estático só funciona dentro da classe

    // Um procedimento é uma rotina que não retorna valor
    // rotina = pode ser executada várias vezes

    static void soma(int a, int b) {

        int resultado = a + b;
        // resultado = a + b;
        System.out.println("A soma é " + resultado);
    }

    public static void main(String[] args) {

        // O começo do programa sempre é aqui no metódo main
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        int numero2 = teclado.nextInt();

        soma(numero1, numero2);
        soma(9, 3);

        // Existem dois metódos getter e setter
        // O metódo getter serve para pegar o valor de algum elemento

        // Já o metódo setter
        // Você seta(adiciona) um novo valor

        // Em java não existe uma function () como em javaScript
        // Em java são metódos

    }
}
