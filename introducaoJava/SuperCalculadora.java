import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um valor:");
        int numero1 = teclado.nextInt();

        int resto = numero1 % 2;
        float elevadoCubo = (float) Math.pow(numero1, 3);
        float raizQuadrada = (float) Math.sqrt(numero1);
        float raizCubo = (float) Math.cbrt(numero1);
        int valorAbsoluto = Math.abs(numero1);

        System.out.println("\n Resto da divisão por 2: " + resto + "\n Elevado ao cubo: " + elevadoCubo + "\n Raiz Quadrada: " + raizQuadrada + "\n Raiz Cúbica: " + raizCubo + "\n Valor Absoluto:" + valorAbsoluto);
    }
}
