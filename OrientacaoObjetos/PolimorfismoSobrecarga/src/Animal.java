public abstract class Animal {

    private int idade,membros;
    private float peso;

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setPeso(float p){
        this.peso = p;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setMembros(int m){
        this.membros = m;
    }

    public int getMembros(){
        return this.membros;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
