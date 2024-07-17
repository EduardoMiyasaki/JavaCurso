public class Livro implements Publicacao {

    private String titulo, autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    // metódos especiais

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public void setTotalPaginas(int tP) {
        this.totalPaginas = tP;
    }

    public int getPaginaAtual() {
        return this.paginaAtual;
    }

    public void setPaginaAtual(int pA) {

        if (pA > getTotalPaginas()) {
            System.out.println("Livro só tem " + getTotalPaginas() + " Páginas");
        } else {
            this.paginaAtual = pA;
        }
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }

    // Metódos públicos


    public void detalhes() {

        System.out.println("O título do livro é " + this.getTitulo());
        System.out.println("O autor do livro é o(a) " + this.getAutor());
        System.out.print("O total de páginas de " + getTitulo() + " é " + getTotalPaginas());
        System.out.println(" você atualmente está na página " + getPaginaAtual());

        if (this.aberto) {
            System.out.println("O livro está aberto");
        } else {
            System.out.println("O livro está fechado");
        }
        System.out.print("O nome do leitor é " + getLeitor().getNome());
        System.out.print(" a idade do leitor é " + getLeitor().getIdade());
        System.out.println(" o sexo do leitor é " + getLeitor().getSexo());
    }

    @Override
    public void abrir() {
        if (this.aberto) {
            System.out.println("O livro já está aberto");
        } else {
            this.aberto = true;
        }

    }

    @Override
    public void fechar() {
        if (!this.aberto) {
            System.out.println("O livro já está fechado");
        } else {
            this.aberto = false;
        }
    }

    @Override
    public void folhear(int p) {

        if(p > this.getTotalPaginas()){
            System.out.println("Erro!!!O livro tem apenas " + getTotalPaginas());
        }else{
        this.setPaginaAtual(p);
    }
    }

    @Override
    public void avancarPag() {

        this.setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPaginaAtual(getPaginaAtual() - 1);
    }
}
