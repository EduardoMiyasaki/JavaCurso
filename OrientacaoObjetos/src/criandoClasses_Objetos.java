public class CriandoClasses_Objetos {
    public static void main(String[] args) {

        // Instanciando a classe caneta e gerando o objeto canetaBic
        Caneta canetaBic = new Caneta();

        canetaBic.modelo = "bic";
        canetaBic.cor = "azul";
        canetaBic.ponta = 0.5;
        canetaBic.carga = 90;
        canetaBic.estaTampado = false;

        canetaBic.status();
        canetaBic.rabiscar();
        canetaBic.tampar();
        canetaBic.rabiscar();

        Caneta canetaFaber = new Caneta();

        canetaFaber.modelo = "Faber-Castell";
        canetaFaber.cor = "Vermelha";
        canetaFaber.ponta = 1.9;
        canetaFaber.carga = 75;
        canetaFaber.estaTampado = true;

        canetaFaber.status();

        Livro livro1 = new Livro();

        livro1.nomeLivro = "Sherlock Holmes : Um estudo em vermelho";
        livro1.tema = "Suspense";
        livro1.ano = 1887;
        livro1.escritor = "Arthur Conan Doyle";
        livro1.quantidadePaginas = 184;
        livro1.aberto = true;

        livro1.fechar();
        livro1.abrir();
        livro1.leitura();

    }

}
