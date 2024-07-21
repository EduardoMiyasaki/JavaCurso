public abstract class Pessoa {

    private String nome;
    private int idade;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setPeso(float p){
        this.peso = p;
    }

    public float getPeso(){
        return this.peso;
    }
}
