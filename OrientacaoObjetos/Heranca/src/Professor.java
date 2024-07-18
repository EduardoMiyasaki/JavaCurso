import java.util.Scanner;

public class Professor extends Pessoa {

    private String especialidade;
    private int salario;

    Scanner teclado = new Scanner(System.in);

    // Metódos especiais

    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setSalario(int sal) {
        this.salario = sal;
    }

    public int getSalario() {
        return this.salario;
    }

    public void receberAumento() {

        System.out.print("Informe em quanto seu salario aumentou:");
        int aumento = teclado.nextInt();

        this.setSalario(this.getSalario() + aumento);
        System.out.println("Aumento realizado com sucesso");
    }
}
