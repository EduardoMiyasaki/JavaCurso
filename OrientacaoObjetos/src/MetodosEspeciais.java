import java.util.Scanner;

public class MetodosEspeciais {

    // Estante estante1 = new Estante();
    // totalDocumentos = estante1.totDoc;
    // para saber a quantidade de "documentos" que aquele pessoa tem

    // Metódo Getter, pegar algo

    // Metódo Setter, colocar algo

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        CanetaVisiblidade canetaMetodos = new CanetaVisiblidade();

        System.out.print("Informe o modelo da caneta:");
        String modelo = teclado.nextLine();

        canetaMetodos.setModelo(modelo);
        String modelo1 = canetaMetodos.getModelo();
        System.out.println("O modelo da caneta é " + modelo1);

        System.out.print("Informe o tamanho da ponta");
        double tamanhoPonta = teclado.nextDouble();

        canetaMetodos.setPonta(tamanhoPonta);
        double ponta = canetaMetodos.getPonta();
        System.out.println("O tamanho da ponta da caneta é " + ponta);
        canetaMetodos.status();

        System.out.println("Tenho uma caneta " + canetaMetodos.getModelo());
    }


}
