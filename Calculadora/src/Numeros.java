import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {

    private String operacao;
    private float numero1;
    private float numero2;
    private float resultado;
    private boolean continuar;

    public void setOperacao(String o) {
        this.operacao = o;

    }

    public String getOperacao() {
        return this.operacao;
    }

    public void setNumero1(float n) {
        this.numero1 = n;
    }

    public float getNumero1() {
        return this.numero1;
    }

    public void setNumero2(float n) {
        this.numero2 = n;
    }

    public float getNumero2() {
        return this.numero2;
    }

    public void setResultado(float r) {
        this.resultado = r;
    }

    public float getResultado() {
        return this.resultado;
    }

    public void setContinuar(boolean c) {
        this.continuar = c;
    }

    public boolean getContinuar() {
        return this.continuar;
    }

    Scanner teclado = new Scanner(System.in);

    public void calcular() {
        try {

            do {

                System.out.println("Informe a operação");
                operacao = teclado.nextLine();

                System.out.println("Informe o primeiro valor:");
                numero1 = teclado.nextFloat();

                System.out.println("Informe o segundo valor:");
                numero2 = teclado.nextFloat();

       /* if(getOperacao().equals("+")){
            setResultado(numero1 + numero2);
        }
        else if(getOperacao().equals("-")){
            setResultado(numero1 - numero2);
        }
        else if(getOperacao().equals("/")){
            setResultado(numero1 / numero2);
        }
        else if(getOperacao().equals("X")){
            setResultado(numero1 * numero2);
        }
        else if(getOperacao().equals( "* ")){
            setResultado((float) Math.pow(numero1, numero2));
        }
*/
                switch (getOperacao()) {
                    case "+":
                        setResultado(numero1 + numero2);
                        break;
                    case "-":
                        setResultado(numero1 - numero2);
                        break;
                    case "X":
                        setResultado(numero1 * numero2);
                        break;
                    case "/":
                        setResultado(numero1 / numero2);
                        break;
                    case "*":
                        setResultado((float) Math.pow((float) numero1, numero2));
                        break;

                    default:
                        System.out.println("Operação é inválida");
                }
                System.out.println(this.resultado);
                System.out.println("Deseja continuar?");
                boolean quer = teclado.nextBoolean();

                setContinuar(quer);
            } while (getContinuar());
        } catch (InputMismatchException ex) {
            System.out.println("Os valores para cálculo devem ser numéricos");
        }


    }
}


