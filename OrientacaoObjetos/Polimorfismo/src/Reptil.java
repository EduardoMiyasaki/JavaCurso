public class Reptil extends Animal {

    private String corEscama;

    public void setCor(String c) {
        this.corEscama = c;
    }

    public String getCor() {
        return this.corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de Réptil");
    }
}
