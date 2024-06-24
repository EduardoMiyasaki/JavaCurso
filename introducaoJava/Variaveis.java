import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
/*     Existem 8 tipos de variaveis
       4 de valores inteiros

       Byte que vai de -128 a 127
       short que vai de -32,768 a 32,767
       int -2,147,483,648 a 2,147,483,647
       long que vai de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,804

        Método booleano utiliza que retorna true ou false
        boolean

        Char
        Varíavel que armazena caracteres
        Podendo ser apenas 1 caracter

        String não é um tipo primitivo mas é uma varíavel que armazena muitos caracteres

        Double e float são para números decimais

        double salario = 22.50;
        float salario = 22.50F;
        Double utiliza 8 bytes e float 4 bytes
*/

        boolean eBrasileiro = true;

        char Caracter = '#';

        byte idade;
        idade = 18;
        // A utilização do byte se deve ao fato de nenhuma idade humana ser maior que 128
        String nome;
        nome = "Eduardo";

        System.out.println("A idade do " + nome + " é " + idade + " Anos");

        // A partir daqui é conteúdo do Curso em video

        // Sempre que tiver new,
        // significa que é um objeto

        // Formas de declarar uma variável

        int ano = 2024;
        float salario = 1825.54f;
        char letra = 'E';
        boolean casado = false;

        int ano1 = (int) 4;
        float salario1 = (float) 1;
        char letra1 = (char) 'E';
        boolean casado1 = (boolean)false;


        Integer idade2 = new Integer(3);
        Float salario2 =  new Float(2);
        Character letra2 = new Character ('G');
        Boolean casado3 = new Boolean(false);

        float nota = (float) 8.5;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Sua nota é " + nota);
        System.out.printf("A nota de %s é %.2f \n" , nome, nota);
        System.out.format("A nota de %s é %.1f \n" , nome, nota);
    }
}

