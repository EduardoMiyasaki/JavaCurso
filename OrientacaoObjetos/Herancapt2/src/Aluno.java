import java.util.Scanner;

public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    Scanner teclado = new Scanner(System.in);

    // Metódos especiais
    public void setMatricula(int m){
        this.matricula = m;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setCurso(String c){
        this.curso = c;
    }

    public String getCurso(){
        return this.curso;
    }

    public void pagarMensalidade(){
        System.out.print("Informe o valor da mensalidade:");
        int valor = teclado.nextInt();

        // Poderia chamar this.nome se nome na classe Pessoa fosse protected
        System.out.println("pago a mensalidade do(a) " + this.getNome());
    }
}
