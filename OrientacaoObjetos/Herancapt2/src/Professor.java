import java.util.Scanner;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    Scanner teclado = new Scanner(System.in);

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public void receberAumento() {
        System.out.println("Informe o valor de aumento");
        float aumento = (float) teclado.nextFloat();

        this.setSalario(this.getSalario() + aumento);
    }
}
