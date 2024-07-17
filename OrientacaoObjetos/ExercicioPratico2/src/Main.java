public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Eduardo");
        pessoa1.setAltura(1.69f);
        pessoa1.setIdade(18);
        pessoa1.setSexo('M');

        Livro livro1 = new Livro();

        livro1.setTitulo("Sherlock Holmes:O signo dos quatro");
        livro1.setAutor("Artur conan doyle");
        livro1.setTotalPaginas(160);
        livro1.setPaginaAtual(66);
        livro1.setAberto(false);
        livro1.setLeitor(pessoa1);

        livro1.detalhes();

        Pessoa[] pessoas = new Pessoa[3];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa();
        pessoas[0].setNome("Fernando");
        pessoas[0].setIdade(13);
        pessoas[0].setAltura(1.59f);
        pessoas[0].setSexo('M');

        pessoas[1] = new Pessoa();
        pessoas[1].setNome("Rita");
        pessoas[1].setIdade(40);
        pessoas[1].setAltura(1.69f);
        pessoas[1].setSexo('F');

        pessoas[2] = new Pessoa();
        pessoas[2].setNome("Osvaldo");
        pessoas[2].setIdade(50);
        pessoas[2].setAltura(1.79f);
        pessoas[2].setSexo('M');

        livros[0] = new Livro();
        livros[0].setTitulo("Aprendendo java");
        livros[0].setAutor("Jose da silva");
        livros[0].setTotalPaginas(300);
        livros[0].setLeitor(pessoas[0]);

        livros[1] = new Livro();
        livros[1].setTitulo("POO para iniciantes");
        livros[1].setAutor("Pedro paulo");
        livros[1].setTotalPaginas(500);
        livros[1].setLeitor(pessoas[1]);

        livros[2] = new Livro();
        livros[2].setTitulo("Java avançado");
        livros[2].setAutor("Maria candido");
        livros[2].setTotalPaginas(800);
        livros[2].setLeitor(pessoas[2]);

        livros[0].abrir();
        livros[0].folhear(299);
        livros[0].avancarPag();
        livros[0].detalhes();
        livros[1].detalhes();
    }
}