public class Aluno extends Pessoa{

    private int anoMatricula;
    private String curso;

    // Metódos especiais

    public void setMatricula(int anoM) {
        this.anoMatricula = anoM;
    }

    public int getMatricula() {
        return this.anoMatricula;
    }

    public void setCurso(String curs) {
        this.curso = curs;
    }

    public String getCurso() {
        return this.curso;
    }

    //Metodos público

    public void cancelarMatricula(){
        this.anoMatricula = 0;
    }

    @Override
    public void status(){
        System.out.println("O nome da pessoa é " + this.getNome());
        System.out.println("A idade da pessoa é " + this.getIdade());
        System.out.println("O sexo é " + this.getSexo());
        System.out.println("O ano de matrícula foi " + this.getMatricula());
        System.out.println("O curso que está sendo feito é " + this.getCurso());

    }
}
