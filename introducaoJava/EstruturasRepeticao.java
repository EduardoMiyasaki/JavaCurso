import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main (String[] args) {

        // While e for em java


        int Contador = 5;

        //Contagem de 1 a 100 pulando de 10 em 10
        for(int index = 0; index <= 100;index+=10){
            if(index == 0){
                System.out.println(index + 1);
                continue;
            }
            System.out.println(index);
        }

        // Estruturas aninhadas

        for (int ind = 1; ind <= 3 ; ind ++) {
            System.out.println(ind);
            for (int j = 0; j <= 2; j++) {
                System.out.println(j);
            }
        }


        for (int i = 0; i < Contador; i++) {
            System.out.println("Oi" + (i + 1));
        }

        int i = 0;
        while (i < Contador) {
            System.out.println("Tchau" + i);
            i++;
        }

        int contadorCambalhota = 0;

        while(contadorCambalhota < 10) {

            contadorCambalhota++;

            if(contadorCambalhota == 5 || contadorCambalhota == 7 ){
                System.out.println("Oi " + contadorCambalhota);
                continue;
                // Esse comando continue
                // faz com que caso o contador seja 5 ou 7 como nesse exemplo
                // o for não executará as ações abaixo e sim irá pro começo do for;
                // Não é muito utilizado
                //Hoje me dia usa o if e uma mensagem explicando do porque pular
            }
            System.out.println("Cambalhota " + contadorCambalhota);
        }

        // Existe também o break
        // que faz o oposto quando a condição for verdadeira vai jogar para
        // fora do laço de repetição

        for (int contador = 1 ; contador < 5;contador ++) {

            if(contador > 3){
                break;
            }
            System.out.println("oi" + contador);
        }
        System.out.println("Fora do for");

        // Exercício fatorial

        Scanner teclado = new Scanner (System.in);

        int  resultadoF = 1;
        System.out.println("Informe o valor do fatorial: ");
        int fatorial = teclado.nextInt();

        for (int contadorF = fatorial; contadorF >= 1;contadorF --) {
           // 5! = 5 x 4 x 3 x 2 x 1
             resultadoF = resultadoF * contadorF;
            System.out.print(contadorF + " * ");
        }
        System.out.println("= " + resultadoF);
        }
    }

