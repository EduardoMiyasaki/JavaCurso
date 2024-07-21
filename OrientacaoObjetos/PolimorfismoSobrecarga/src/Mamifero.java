public class Mamifero extends Animal {

    private String corPelo;

    public void setCor(String c) {
        this.corPelo = c;
    }

    public String getCor() {
        return this.corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
