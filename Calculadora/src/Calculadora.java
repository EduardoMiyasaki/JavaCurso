import java.util.Scanner;

public class Calculadora {

    private String operacao;
    private float numero1;
    private float numero2;
    private float resultado;

    Scanner teclado = new Scanner(System.in);

    public void calcular(){
        System.out.println("Informe a operação");
        operacao = teclado.nextLine();

        System.out.println("Informe o primeiro valor:");
        numero1 = teclado.nextFloat();

        System.out.println("Informe o segundo valor:");
        numero2 = teclado.nextFloat();

    }
}
