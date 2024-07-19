public abstract class Pessoa {
    // Como a classe é abstrata não pode ser instaciada

    private String nome;
    private int idade;
    private String sexo;

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

    // Metódos públicos

    // Metódo final não pode ser sobescrito (@Override)
    public final void fazerArniversario() {
        this.setIdade(getIdade() + 1);
    }


    public void detalhes() {
        System.out.print("O nome da pessoa é " + this.getNome());
        System.out.print(" e a idade dela é " + this.getIdade());
        System.out.println(" e o sexo é " + this.getSexo());
    }
}
