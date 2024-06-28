import java.util.Scanner;
import javax.swing.JOptionPane;

public class interrompe0 {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null,"Olá mundo");
        int totalNumeros = 0;
        int numero1 = 0;
        int soma = 0;
        float media = 0;
        int numerosPar = 0;
        int numerosImpar = 0;
        int numerosAcima100 = 0;

        // Faça enquanto o numero inserido for 0;
        // o while está lá em baixo

        do {

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um número:<br><i>(O valor de 0 interrompe)</i></html>") );

        totalNumeros++;
        soma += numero1;

            if(numero1 % 2 == 0){
                numerosPar++;

            }
            else {
                numerosImpar++;
            }

            if(numero1 > 100){
                numerosAcima100++;
            }

        media = (float) soma / totalNumeros;

        } while(numero1 != 0);

         JOptionPane.showMessageDialog(null, "Total de valores: " + totalNumeros + "\nTotal de pares: " + numerosPar + "\nTotal de ímpares:" + numerosImpar + "\n Acima de 100: " + numerosAcima100 + "\n Média dos valores: " + media);


        int i = 1;
        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosAcima = 0;

        Scanner teclado = new Scanner(System.in);

        for ( ; i >= 0; i++) {
            System.out.println("Informe um número");
            int numero = teclado.nextInt();

            if(numero % 2 == 0){
                numerosPares++;
            }
            else{
                numerosImpares++;
            }

            if(numero > 100) {
                numerosAcima++;
            }
            if(numero == 0){
                break;
            }
        }
        System.out.println("Total de valores: " + i + "\nTotal de pares: " + numerosPares + "\nTotal de ímpares: " + numerosImpares + "\nAcima de 100: " + numerosAcima + "\n Média de valores"  );
    }
}
