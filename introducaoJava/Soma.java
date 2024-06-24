import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero1 = teclado.nextInt();

        System.out.println("Digite outro número");
        int numero2 = teclado.nextInt();

        int soma = numero1 + numero2;
        
        System.out.println("A soma dos dois números é " + soma);
    }
}
