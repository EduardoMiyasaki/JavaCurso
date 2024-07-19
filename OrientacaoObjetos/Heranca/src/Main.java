public class Main {
    public static void main(String[] args) {

        // Herança permite basear uma nova classe
        // na definição de uma outra classe previamente existente

        // A herança será aplicada tanto para as características quanto para os comportamentos

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Eduardo");
        pessoa1.setIdade(18);
        pessoa1.setSexo("Masculino");

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Fernando");
        aluno1.setIdade(18);
        aluno1.setSexo("Masculino");
        aluno1.setCurso("Escola");
        aluno1.setMatricula(2024);
        aluno1.status();
        aluno1.cancelarMatricula();

        Professor professor1 = new Professor();

        professor1.setNome("Professor girafales");
        professor1.setIdade(57);
        professor1.setSexo("Masculino");
        professor1.setEspecialidade("Matemática");
        professor1.setSalario(10000);
        professor1.fazerArniversario();
        System.out.println(professor1.getIdade());
        professor1.receberAumento();
        System.out.println(professor1.getSalario());

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Osvaldo");
        funcionario1.setIdade(50);
        funcionario1.setSexo("Masculino");
        funcionario1.setSetor("Máquinas");
        System.out.println(funcionario1.getSetor());
        funcionario1.setTrabalhando(true);
        funcionario1.mudarTrabalho();
        System.out.println(funcionario1.getSetor());
        funcionario1.status();

    }
}