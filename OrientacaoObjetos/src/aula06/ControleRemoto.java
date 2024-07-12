package aula06;

// Quando você implementa você é obrigado a trazer todos os metódos abstratos
public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Metódo construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Metódos especiais
    private void setVolume(int v) {
        this.volume = v;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setLigado(boolean ligarDesligar) {
        this.ligado = ligarDesligar;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setTocando(boolean tocar) {
        this.tocando = tocar;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(getLigado());
        System.out.println(getVolume());

        for (int i = 0; i < getVolume(); i += 10) {
            System.out.println("|");
        }
        System.out.println(getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {

        if (getLigado()) {
            setVolume(getVolume() + 1);
        } else {
            System.out.println("Tv está desligada");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()) {
            setVolume(getVolume() - 1);
        } else {
            System.out.println("Tv está desligada");
        }
    }

    @Override
    public void ligarMudo() {

        if (getLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {

        if (getLigado() && !getTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {

        if (getLigado() && getTocando()) {
            setTocando(false);
        }
    }
}

