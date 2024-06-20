import java.util.ArrayList;

public class Vetores {

    public static void main(String [] args){


        //Dessa forma o vetores/array já tem um tamanho/Length definido e também os valores

        int[] idades = {2,3,4};

        // E desta forma o vetor fica vazio,porém ele já tem um tamanho,que no caso são 10 valores
        int[] idades1 = new int [10];

        // Este vetor é de string e tem tamanho 2

        String[] nomes = {"Eduardo","Cleber"};

        System.out.println(nomes[0]);
        System.out.println("O números de elementos dentro do vetor nome é " + nomes.length);

        // Este vetor tem um length mutável ou seja pode ter qualquer tamanho

        ArrayList<Integer> Precos = new ArrayList<Integer>();

        // Adicionando valores ao vetor
        Precos.add(22);
        Precos.add(50);
        Precos.add(14);

        ArrayList<Integer> Quantidades = new ArrayList<Integer>();

        Quantidades.add(1);
        Quantidades.add(2);

        //Removendo valores do vetor
        Precos.remove(0);

        // Pegando valores do vetor
        Precos.get(1);

        // Vendo o tamanho do vetor, seria o length em javaScript, só funciona no ArrayList em outros vetores é realmente length
        Precos.size();

        System.out.println("Pegando o valor do vetor " + Precos.get(0));

        System.out.println("O número atual de elementos dentro do ArrayList(precos),atualmente é " +Precos.size() + " Lembrando que este vetor pode mudar de tamanho");

        System.out.println("Verificando se dentro do vetor preços existe o valor 50: " + Precos.contains(50));

        // Adicionando todos os valores do vetor Quantidades dentro do vetor Precos
        Precos.addAll(Quantidades);

        System.out.println(Precos);
    }

}
