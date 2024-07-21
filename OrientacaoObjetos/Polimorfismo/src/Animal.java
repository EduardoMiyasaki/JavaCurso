public abstract class Animal {

    private String nome;
    private int peso;
    private int idade;
    private int membros;

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

    public void setPeso(int p) {
        this.peso = p;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setMembros(int m) {
        this.membros = m;
    }

    public int getMembros() {
        return this.membros;
    }

    // Metódos públicos
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();
}
