import java.util.Scanner;

public class chamandoFuncao1 {

    // static não precisa trasnformar em objeto pra usar
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int numero = teclado.nextInt();

        chamandoFuncao2 obj = new chamandoFuncao2();

        /* System.out.println(obj.getFatorial(numero));
        System.out.println(obj.getFormula(numero));
        */

        obj.setValor(numero);
        System.out.print(chamandoFuncao2.getFormula());
        System.out.print(obj.getFatorial());

    }
}
