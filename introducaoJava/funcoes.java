import java.util.Scanner;

public class funcoes {

            // isso é uma função
            // só funciona quando ela é chamada ou seja o
            // metódo main é executado primeiro

            // é uma boa prática criar funções
            // Como eu coloquei que esse metódo é public eu posso acessar ele em qualquer outro código
            // Private bloquea os acessos em outros códigos

            public static int soma(int a , int b){

                int somar = a + b;
                return somar;
            }

    public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                funcoes obj = new funcoes();

        System.out.print("Informe o primeiro valor:");
        int n1 = teclado.nextInt();

        System.out.print("Informe o segundo valor:");
        int n2 = teclado.nextInt();

        // int resultado = soma(n1,n2);
        int resultado = obj.soma(n1,n2);
        System.out.println("A soma é " + resultado);
    }
}
