import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class OperadoresAritmeticos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o numerador:");
        int numero1 = teclado.nextInt();

        System.out.print("Informe o denominador:");
        int numero2 = teclado.nextInt();

        float resultado = numero1 / numero2;

        float resto = numero1 % numero2;

        System.out.println("O resultado dessa divisão é " + resultado);
        System.out.println("O resto dessa divisão é " + resto);

        //Existe também os os operadores únarios
        // Exemplo A++ = A = A + 1; Igual no javaScript
        // Exemplo A-- = A = A - 1; Igual no javaScript

        int numero3 = 5;
        numero3++;
        System.out.println(numero3);

        numero3--;
        System.out.println(numero3);

        int valor = 5 + numero3++;
        System.out.println(valor);
        // Essa conta vai dar 10,por conta que o incremento vem após fazer a soma

        int valor2 = 5 + ++numero3;
        System.out.println(valor2);
        // Essa conta vai dar 11,por conta que o incremento vem antes de fazer a soma

        int x = 4;
        x += 2; // x = x + 2; da pra fazer com todos sinais += -= *= /=
        System.out.println(x);

        // A partir daqui uso da classe Math

        // Pi = Math.PI;
        // pow = Potência: Exemplo: Math.pow(5,2) ou seja 5 elevado a 2 = 25
        // sqrt = Raiz Quadrada: Exemplo: Math.sqrt(25) raiz quadrada de 25 = 5
        // cbrt = Raiz Cúbica: Exemplo: Math.cbrt(27) raiz cúbica de 27 = 3
        // abs = Valor Absoluto: Exemplo: Math.abs(-10) elimina o negativo ou seja 10

        // Arredondamentos
        // floor = Arrendoda para baixo: Exmeplo : Math.floor(3.9) = 3;
        // ceil = Arrendoda para cima: Exmeplo : Math.ceil(4.2) = 5;
        // round = Arrendoda corretamente: Exmeplo : Math.round(5.6) = 6;


        float y = (float)Math.PI;
        System.out.println(y);

        // Números aleatórios
        // Math.random();
        // Gera números entre 0 e 1;

        // Gerando números entre 5 e 10
        float aleatorio = (float) Math.random();
        int numeroAleatorio = (int)(aleatorio  * 5 + 5);
        System.out.println(numeroAleatorio);

    }
}
   /*     public OperadoresAritmeticos(){
            btnDividir.addActionListener(new ActionListener(){
                @Override
                public void actionPermomed(Action e){
                    int numero1 = Integer.parseInt(txtNumero1.getText());
                    int numero2 = Integer.parseInt(txtNumero2.getText());
                    float resultado = numero1 / numero2;
                    float resto = numero1 % numero2;
                    txtLabel.setText("O resultado da divisão é: " + String.valueOf(resultado));
                    txtLabel2.setText("O resto da divisão é: " + String.valueOf(resto));
                }
            }

        }
        */

