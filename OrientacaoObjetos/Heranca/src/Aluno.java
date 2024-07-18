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
}
