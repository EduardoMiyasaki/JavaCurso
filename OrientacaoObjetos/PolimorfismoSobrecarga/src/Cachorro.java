public class Cachorro extends Mamifero {

    private String nomeDono;
    private String nome;

    // Metódos especiais
    public void setNomeDono(String nD) {
        this.nomeDono = nD;
    }

    public String getNomeDono() {
        return this.nomeDono;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    // Polimorfismo de sobreposição

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    // Polimorfismo de sobrecarga pois tem diferentes assinaturas(Paramêtros diferentes e está na mesma classe)

    public void reagir(String frase) {

        if (frase.equals("Toma comida") || frase.equals("Ola")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(DonoCachorro dC) {
        if (dC.getNome().equals(getNomeDono()) && dC.getNomeCachorro().equals(getNome())) {
            System.out.println("Abanar!!!Pois é meu dono");
        } else {
            System.out.println("Morder!!!pois não é meu dono");
        }
    }

    public void reagir(int idade, float peso) {
        if (getIdade() < 5 && peso < 10){
            System.out.println("Abanar");
        }
        else{
            emitirSom();
        }
    }

}
