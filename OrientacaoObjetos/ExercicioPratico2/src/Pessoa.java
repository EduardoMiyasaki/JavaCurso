import java.util.Calendar;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    private char sexo;

    // Metódos especiais
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char s) {

        if (s == 'M' || s == 'F') {
            this.sexo = s;
        }
        else {
            System.out.println("Esse gênero não existe");
        }
    }

    // Metódos público
    public void fazerArniversario() {

        this.setIdade(this.getIdade() + 1);
    }
}
