public class Main {
    public static void main(String[] args) {

        // Quando uma superClasse não tem mãe é chamada de raiz

        // as classes que não tem filhas se chama folha

        // descedente ou ancestral é quando a filha de uma superclasse tem uma outra filha então
        // ela é descendente da superclasse

        // quando você ve a árvore de cima para baixo se chama especialização
        // ao contrario generalização

        //                              Tipos de herança

        // Herança de implementação = você faz uma herança pobre
        // na qual a filha da superClasse
        // não tem nenhum atributo ou metódos novos a não ser o que veio da superClasse

        // Herança para diferença = a nova subclasse tem novos atributos ou metodos


        // Classe abstrata = Não pode ser instanciada,só pode servir como progenitora

        // Metódo abstrato = declado, mas não implementado na progenitora

        // Classe final = Não pode ser herdada por outra classe,Obrigatoriamente folha(Ou seja está no final da árvore e não pode surgir filhas dela)

        // Metódo Final = Não pode ser sobrescrito pela suas subs-classes,Obrigatoriamente herdado

        // Essa linha de baixo não funcionaria pois a classe pessoa é abstrata
        // Pessoa p1 = new Pessoa();

        Visitante p1 = new Visitante();
        p1.setNome("Cleber");
        p1.setIdade(22);
        p1.setSexo("Masculino");
        p1.detalhes();

        Aluno p2 = new Aluno();
        p2.setNome("Eduardo");
        p2.setIdade(16);
        p2.setSexo("Masculino");
        p2.setMatricula(1111);
        p2.setCurso("Informática");
        p2.pagarMensalidade();

        Bolsista p3 = new Bolsista();
        p3.setNome("Jubileu");
        p3.setIdade(16);
        p3.setSexo("Masculino");
        p3.pagarMensalidade();
    }
}