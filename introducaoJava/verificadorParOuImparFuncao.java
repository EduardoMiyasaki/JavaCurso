import java.util.Scanner;

public class verificadorParOuImparFuncao {

    // Isso é uma função
    // pois retorna uma String

    public String verificador(int a){

        String par = "Par";
        String impar = "Impar";

        if(a % 2 == 0){
            return par;
        }
        else{
            return impar;
        }
    }

    // isso também é uma função
    // pois retorna um inteiro

    public int fatorial(int b) {
        int resultado = 1;

        for(int i = b; i >= 1; i--) {

            resultado = resultado * i;

        }
        return resultado;
    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        verificadorParOuImparFuncao obj = new verificadorParOuImparFuncao();

        System.out.print("Informe um valor:");
        int numero1 = teclado.nextInt();

        // o Retorno da função está sendo jogado dentro dessa String
       String resultado =  obj.verificador(numero1);
        System.out.println("O valor " + numero1 + " é " + resultado);

        System.out.print("Informe o valor de fatorial:");
        int numero2 = teclado.nextInt();

        int resultadoFatorial = obj.fatorial(numero2);
        System.out.println("O fatorial de " + numero2 + " é: " + resultadoFatorial );


        System.out.println("Chamando a função somar que está em outro código,utilizando o metódo public dentro da função:" + funcoes.soma(8,2));

    }
}
