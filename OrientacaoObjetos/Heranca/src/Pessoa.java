public class Pessoa {
// Pessoa é a classe mãe ou progenitora ou superClasse
// ou seja todas as classes que herdam ela vai herdar todos os atributos e metodos

// e aluno, funcionario e professor sao as filhas ou subclasses

    private String nome;
    private int idade;
    private String sexo;

    // Metódo construtor

    // Metódos especiais
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public String getSexo() {
        return this.sexo;
    }

    // Metódo público

    public void fazerArniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    public void status() {
        System.out.println("O nome da pessoa é " + this.getNome());
        System.out.println("A idade da pessoa é " + this.getIdade());
        System.out.println("O sexo é " + this.getSexo());
    }
}
