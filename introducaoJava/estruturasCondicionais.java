import java.util.Scanner;
import java.util.Calendar;

public class estruturasCondicionais {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua primeira nota:");
        float nota1 = teclado.nextFloat();

        System.out.print("Informe sua segunda nota:");
        float nota2 = teclado.nextFloat();

        float media = (float) (nota1 + nota2) / 2;

        System.out.println("Sua média é " + media);

        if (media >= 9) {
            System.out.println("Parabéns, sua média foi maior ou igual a 9");
        }


        // Condicional idade
        System.out.print("Informe seu ano de nascimento:");
        int anoNascimento = teclado.nextInt();

        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);

        int idade = ano - anoNascimento;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Verificador de par ou ímpar

        System.out.println("Informe um número");
        int numero = teclado.nextInt();

        int resto = numero % 2;

        if (resto == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        // Verificador de perna

        System.out.println("Informe o números de pernas");
        int numeroPernas = teclado.nextInt();

        String tipo= "";

        // switch == trocar
        switch (numeroPernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}

