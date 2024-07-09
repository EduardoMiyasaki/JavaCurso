public class Livro {

    String nomeLivro;
    String tema;
    int ano;
    String escritor;
    int quantidadePaginas;
    boolean aberto;

    void leitura (){

        if(this.aberto == true){
            System.out.println("Lendo");
        }
        else{
            System.out.println("O livro está fechado!!!");
        }
    }

    void abrir(){
        if(this.aberto == false){
            this.aberto = true;
        }
    }

    void fechar(){
        if(this.aberto == true){
            this.aberto = false;
        }
    }

    void statusLivro(){

        System.out.println("O nome do livro é" + this.nomeLivro);
        System.out.println("O tema do livro é " + this.tema);
        System.out.println("O ano de lançamento do livro é " + this.ano);
        System.out.println("O escritor(a) do livro foi " + this.escritor);
        System.out.println("A quantidade de páginas do" + this.nomeLivro + " é " + this.quantidadePaginas);
        System.out.println("O livro está aberto? " + this.aberto);
    }
}
