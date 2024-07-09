public class CanetaVisiblidade {

    public String modelo;
    public String cor;
    private Double ponta;
    protected int carga;
    private boolean estaTampado;

    public void rabiscar() {

        if (this.estaTampado == false) {
            System.out.println("Rabiscando");
        } else {
            System.out.println("ERROR");
            System.out.println("Caneta está tampada");
        }
    }

    public void tampar() {

        // Mexendo em um atributo privado pois estou na mesma classe :)
        if (this.estaTampado == false) {
            this.estaTampado = true;
            System.out.println("Tampei a caneta");
        }
    }

    public void destampar() {
        // Mexendo em um atributo privado pois estou na mesma classe :)
        if (this.estaTampado == true) {
            this.estaTampado = false;
            System.out.println("Destampando a caneta");
        }
    }

   public void status() {

        //Quem chamou o esse metódo vai ser substítuido por this

        System.out.println("Uma caneta " + this.cor + " da marca " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga + "%");
        System.out.println("Está tampada? " + this.estaTampado);
        System.out.println(".");
    }
}

