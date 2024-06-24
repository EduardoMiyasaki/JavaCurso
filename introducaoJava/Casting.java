public class Casting {

    public static void main(String[] args){

        // Tranformando int em double,
        // ou seja, transformando 22 em 22.0
        int idade1 = 22;
        double idade2 = idade1;

        System.out.println(idade2);

        /*
        Ao contrário não iria funcionar

        por exemplo idade1 = idade2;

        Pois, dentro da idade2 está sendo guardado o valor 22.0 que é maior que o valor guardado em idade1
        que no caso seria 22
        então ele tentaria diminuir o valor de idade2 o que não é possível

        Para fazer esse Casting teria que ser explicíto que farei abaixo

         */

        idade1 = (int) idade2;

        // Tranformando um char em String

        char Letra = 'a';
        String Nome = String.valueOf(Letra);
        System.out.println(Nome);

        // Tranformando String em char

        Letra =  Nome.charAt(0);
        System.out.println(Letra);

        //Tranformando inteiro em String


        String Nome2 = String.valueOf(idade1);
        System.out.println(Nome2);



        // Tranformando String em inteiro

        String Cavalos = "22";

        // Integer idade3 = Integer.valueOf(Cavalos);

        //Pode ser assim também

        int idade3 = Integer.parseInt(Cavalos);
        System.out.println(idade3 + 1);

    }
}
