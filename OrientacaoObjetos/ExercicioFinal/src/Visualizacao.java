public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video video){
        this.setEspectador(espectador);
        this.setFilme(video);
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);

    }
    // Métodos especiais
    public void setEspectador(Gafanhoto e) {
        this.espectador = e;
    }

    public Gafanhoto getEspectador() {
        return this.espectador;
    }

    public void setFilme(Video f) {
        this.filme = f;
    }

    public Video getFilme() {
        return this.filme;
    }

    // Métodos públicos
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int tot = 0;

        if(porcentagem <= 20.0){
            tot = 3;
        }
        else if(porcentagem <= 50.0){
            tot = 5;
        }
        else if(porcentagem <= 90.0){
            tot = 8;
        }
        else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public void status(){
        System.out.println("O video sendo assistindo é :" + this.filme.getTitulo());
        System.out.println("O espectador do vídeo é " + this.espectador.getNome());
    }
}
