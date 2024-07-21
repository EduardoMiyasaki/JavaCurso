public class DonoCachorro extends Pessoa {

    private boolean dono;
    private String nomeCachorro;

    public boolean getDono() {
        return this.dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public void setNomeCachorro(String nc) {

        if (getDono()) {
            this.nomeCachorro = nc;
        }
        else {
            System.out.println("Você não é dono");
        }
    }

    public String getNomeCachorro() {
        return this.nomeCachorro;
    }
}
