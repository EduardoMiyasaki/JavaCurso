public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        setAvaliacao(1);
        setViews(0);
        setCurtidas(0);
        setReproduzindo(false);
    }

    // Métodos especiais
    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAvaliacao(int a){
        this.avaliacao = a;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }

    public void setViews(int v){
        this.views = v;
    }

    public int getViews(){
        return this.views;
    }

    public void setCurtidas(int c){
        this.curtidas = c;
    }

    public int getCurtidas(){
        return this.curtidas;
    }

    public void setReproduzindo(boolean r){
        this.reproduzindo = r;
    }

    public boolean getReproduzindo(){
        return this.reproduzindo;
    }

    @Override
    public void play(){
        this.setReproduzindo(true);
    }

    @Override
    public void pause(){
        this.setReproduzindo(false);
    }

    @Override
    public void like(){
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public void status(){
        System.out.println("O título do video é: " + this.getTitulo());
        System.out.println("A quantidade de views do video é: " + this.getViews());
        System.out.println("A quantidade de likes do video é: " + this.getCurtidas());
        System.out.println("A quantidade de estrelas do video é: " + this.getAvaliacao());

        if(this.getReproduzindo()){
            System.out.println("O Video está sendo reproduzido");
        }
        else{
            System.out.println("O vídeo está pausado");
        }

    }
}
