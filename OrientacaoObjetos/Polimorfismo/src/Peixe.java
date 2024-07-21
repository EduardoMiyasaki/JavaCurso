public class Peixe extends Animal {

    private String corEscama;

    public void setCor(String c) {
        this.corEscama = c;
    }

    public String getCor() {
        return this.corEscama;
    }

    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }

    //Polimorfismo pois estou reescrevendo metódos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
}
