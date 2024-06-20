public class Variaveis {
    public static void main(String[] args) {
/*     Existem 8 tipos de variaveis
       4 de valores inteiros

      Byte que vai de -128 a 127
       short que vai de -32,768 a 32,767
       int -2,147,483,648 a 2,147,483,647
       long que vai de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,804

        Método booleano utiliza
        boolean

        Char
        Varíavel que armazena caracteres
        Podendo ser apenas 1 caracter

        String não é um tipo primitivo mas é uma varíavel que armazena muitos caracteres

        Double e float são para números decimais

        double salario = 22.50;
        float salario = 22.50F;
*/

        boolean eBrasileiro = true;

        char Caracter = '#';

        byte idade;
        idade = 18;
        // A utilização do byte se deve ao fato de nenhuma idade humana ser maior que 128
        String nome;
        nome = "Eduardo";

        System.out.print("A idade do " + nome + " é " + idade + " Anos");
    }
}