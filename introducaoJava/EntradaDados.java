import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();

        if (nome.length() <= 2) {

            System.out.println("ERRO \n Nome dever ter 3 ou mais caracteres \n Digite seu nome:");
            nome = teclado.nextLine();

        }
        else{

        System.out.println("Digite sua nota:");
        float nota = teclado.nextFloat();

        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();

        System.out.println("Seu nome é " + nome + " e sua nota é " + nota + " e sua idade é " + idade);

        // String valor = String.valueOf(idade);
        // Ou posso fazer assim
        String valor = Integer.toString(idade);
        System.out.println(valor + 1);
    }
    }
}
