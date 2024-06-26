public class operadorRelacional {
    public static void main(String[] args) {

        String nome1 = "Eduardo";
        String nome2 = "Eduardo";
        String nome3 = new String ("Eduardo");
        String resultado;
        String resultado1;

        resultado = nome1 == nome3? "igual":"diferente";
        System.out.println(resultado);
        // Dessa forma vai mostrar difente pois são estruturas diferentes

        resultado1 = nome1.equals(nome3)? "igual":"diferente";
        System.out.println(resultado1);
        // Dessa forma, vai Mostrar igual por conta que desse jeito mostra que o conteúdo dentro de nome1 é igual a n3

        // Equals significa igual daria pra usar o ==
        //if(nome3.equals(nome1)){
        if(nome1 == nome2 ){
            System.out.println("oi");
        }


    }
}
