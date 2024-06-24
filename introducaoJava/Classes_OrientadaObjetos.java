public class Classes_OrientadaObjetos {

    String Nome;
    static String Nome2;

    public static void main(String[] args) {
        // Como aqui o metódo é estático não da para fazer referência ao atributo Nome
        // Pois esse metódo pertence a classe
        // System.out.println(Nome);
        // Esse comando não funcionaria pois esse local é estático e só funciona coisas estáticas

        // Agora esse comando de abaixo funcionaria,
        // pois o metódo estático só enxerga coisas estáticas
        Nome2 = "Eduardo";
        System.out.println(Nome2);

    }

    static void Teste() {

    }

    void declaraNome() {

        System.out.println(Nome2);

        Classes_OrientadaObjetos.Teste();
        Nome = "Fernanda";
    }

    String getNome() {
        return Nome;
    }
}

