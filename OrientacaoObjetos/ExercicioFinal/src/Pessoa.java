public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    // método construtor
    public Pessoa(String nome,int idade,String sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setExperiencia(0);
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia(){
        return this.experiencia;
    }

    public void setExperiencia(int exp){
        this.experiencia = exp;
    }

    // Metódo público
    public void ganharExp(){
        this.setExperiencia(getExperiencia() + 1);
    }

    public void status(){
        System.out.println("O nome da pessoa é: " + this.getNome());
        System.out.println("a idade da pessoa é: " + this.getIdade());
        System.out.println("o sexo da pessoa é: " + this.getSexo());
        System.out.println("a experiência da pessoa é: " + this.getExperiencia());

    }
}
