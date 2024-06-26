import java.util.ArrayList;
import java.util.Arrays;

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

        ArrayList<Integer> precos = new ArrayList<Integer>();

        // Adicionando valores ao vetor
        precos.add(22);
        precos.add(50);
        precos.add(14);

        ArrayList<Integer> Quantidades = new ArrayList<Integer>();

        Quantidades.add(1);
        Quantidades.add(2);

        //Removendo valores do vetor
        precos.remove(0);

        // Pegando valores do vetor
        precos.get(1);

        // Vendo o tamanho do vetor, seria o length em javaScript, só funciona no ArrayList em outros vetores é realmente length
        precos.size();

        System.out.println("Pegando o valor do vetor " + precos.get(0));

        System.out.println("O número atual de elementos dentro do ArrayList(precos),atualmente é " +precos.size() + " Lembrando que este vetor pode mudar de tamanho");

        System.out.println("Verificando se dentro do vetor preços existe o valor 50: " + precos.contains(50));

        // Adicionando todos os valores do vetor Quantidades dentro do vetor precos
        precos.addAll(Quantidades);

        System.out.println(precos);
    }

}
