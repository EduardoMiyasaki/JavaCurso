public class operadoresLogicos {
    public static void main(String[] args) {

        /*
        && Operador E
        || Operador Ou
        ^ Operador XOU está nas linhas de baixo
        ! Operador Not
        */

        int x,y,z;
        x = 4;
        y = 7;
        z = 12;

        boolean resultado;
        resultado = (x < y ^ y == z)? true:false;
        System.out.println(resultado);


    }
}
           /*  ^  Operador XOU ou (Or Exclusivo)
            *   P Q   P^Q (P ou Exclusivamente Q sejam v)
            *   V V    F
            *   V F    V
            *   F V    V
            *   F F    V
            */