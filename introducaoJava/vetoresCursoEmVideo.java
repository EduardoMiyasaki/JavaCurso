import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class vetoresCursoEmVideo {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);

        for (int index = 0; index >= -10; index ++) {

            System.out.print("Informe seu nome:(Escreva Sair para sair)");
            String nome = teclado.nextLine();

            // Comparare strings usando equals
                    if(nome.equals("Sair")){
                        break;
                    }
            listaNome.add(nome);
        }
        listaNome.add("Eduardo");
        listaNome.add("Gustavo");
        listaNome.add("Fernando");

        for (int i = listaNome.size() - 1; i >= 0; i--) {
            System.out.println(listaNome.get(i));
        }

        // listaNome.remove(0);

        System.out.println(listaNome);
        System.out.println(listaNome.get(0));
        System.out.println(listaNome.get(1));
        System.out.println("O número atual de itens dentro do vetor é: " + listaNome.size());

        // Jeito que primata faz ⬇️👇
        // Esse jeito é útil quando cê sabe o tamanho do vetor,porém não sabe os valores de dentro ainda.
        // Metódo é tudo que tem parenteses no final

        int[] listaNumeros = new int[4];

        listaNumeros[0] = 3;
        listaNumeros[1] = 5;
        listaNumeros[2] = 8;
        listaNumeros[3] = 2;

        for (int index = listaNumeros.length - 1; index >= 0; index--) {
            System.out.println(listaNumeros[index]);
        }
        // Outro jeito de primata ⬇️👇
        // Esse jeito é util quando já se sabe o tamanho e os valores do vetor

         int[] listaNumeros2 = {3,5,8,2};
         System.out.println(listaNumeros2[3]);

         // Fazendo mostrar a quantidade de dias dos meses

         String[] mes = {"janeiro", "fevereiro" , "março", "abril" , "maio", "junho", "julho", "agosto" , "setembro", "outubro" , "novembro", "dezembro"};

         int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

         Calendar cal = Calendar.getInstance();
         int ano = cal.get(Calendar.YEAR);

         for (int contadorMes = 0; contadorMes < mes.length;contadorMes ++){

             // Verificador de ano bissexto
             if(ano % 4 == 0) {
                 dias[1] = 29;
             }
             System.out.println("O mês de " + mes[contadorMes] + " Tem " + dias[contadorMes] + " Dias");
         }
    }
}
