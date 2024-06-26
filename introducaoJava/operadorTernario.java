public class operadorTernario {
    public static void main(String[] args) {

        int numero1, numero2;
        numero1 = 5;
        numero2 = 10;
        int[] vetorNumeros = {3, 4, 5, 6};

        // Lendo o código abaixo
        // Se n1 for maior que n2, Maior recebe o valor de n1 se não recebe n2;
        // E após o ? ele aceita contas matemáticas também :)
        int maior = numero1 > numero2 ? numero1 : numero2;
        System.out.println(maior);

        /* Tentativa com for(Não funcionou)
         * for (int i = vetorNumeros.length; i <= 0; i--) {
         * int maior = vetorNumeros[i] > vetorNumeros[i + 1] ? vetorNumeros[i] : vetorNumeros[i
         * + 1];
         * System.out.println(maior);
         * }
         */

    }
}
