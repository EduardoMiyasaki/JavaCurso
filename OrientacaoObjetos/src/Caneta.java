public class Caneta {

    String modelo;
    String cor;
    Double ponta;
    int carga;
    boolean estaTampado;

    void rabiscar(){

        if(this.estaTampado == false){
            System.out.println("Rabiscando");
        }
        else{
            System.out.println("ERROR");
            System.out.println("Caneta está tampada");
        }
    }

    void tampar(){

        if(this.estaTampado == false){
            this.estaTampado = true;
            System.out.println("Tampei a caneta");
        }
    }

    void destampar(){
        if(this.estaTampado == true){
            this.estaTampado = false;
            System.out.println("Destampando a caneta");
        }
    }

    void status(){

        //Quem chamou o esse metódo vai ser substítuido por this

        System.out.println("Uma caneta " + this.cor + " da marca " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga + "%");
        System.out.println("Está tampada? " + this.estaTampado);
        System.out.println(".");
    }
}
