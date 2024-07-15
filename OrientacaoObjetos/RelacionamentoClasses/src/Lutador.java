public class Lutador implements Lutar {

    // Atributos do lutador
    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso;
    private double altura;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Metódo construtor

    public Lutador(String nome, String nacionalidade, int idade, double altura, double pe, int vi, int de, int emp) {

        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(emp);
    }

    // Metódos especiais
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setPeso(double p) {
        this.peso = p;
        setCategoria();
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public double getAltura() {
        return this.altura;
    }

    private void setCategoria() {

        if (this.peso < 52.2) {
            this.categoria = "Abaixo do peso";
        }
        else if (this.peso <= 70.3) {

            this.categoria = "Peso Pena";
        }
        else if (peso <= 83.9) {
            this.categoria = "Peso Médio";
        }
        else if (peso <= 120.2) {
            this.categoria = "Peso pesado";
        }
        else {
            this.categoria = "Acima do peso";
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }

    public int getEmpates() {
        return this.empates;
    }


    // Metódos públicos

    @Override
    public void apresentar() {
        System.out.println("O nome do lutador é " + getNome());
        System.out.println("O seus país de origem é " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos de idade");
        System.out.println("Com " + getAltura() + " de altura");
        System.out.println("Pesando " + getPeso() + "kg");
        System.out.println("Ganhou " + getVitorias() + " lutas ");
        System.out.println("Perdeu " + getDerrotas() + " lutas ");
        System.out.println("Empatou " + getEmpates() + " lutas ");
    }

    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
        // this.vitorias = this.vitoria + 1
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
