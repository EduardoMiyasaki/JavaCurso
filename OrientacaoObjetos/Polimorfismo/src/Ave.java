public class Ave extends Animal {

    private String corPena;

    public void setCor(String c) {
        this.corPena = c;
    }

    public String getCor() {
        return this.corPena;
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("O óóó");
    }
}
