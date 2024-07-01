import java.util.Scanner;

public class exercicioContadorFor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor de início do for: ");
        int inicio = teclado.nextInt();

        System.out.print("Informe o valor de fim do for: ");
        int fim = teclado.nextInt();

        if(fim <= inicio) {
        System.out.print("Infome outro valor:(O fim tem que ser maior que o inicio)");
        fim = teclado.nextInt();
        }

        System.out.print("Informe o intervalo da contagem: ");
        int intervalo = teclado.nextInt();

        for (int i = inicio; inicio <= fim; inicio+= intervalo ){
            System.out.println(inicio);
        }
    }
}
