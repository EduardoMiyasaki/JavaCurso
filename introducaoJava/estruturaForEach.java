public class estruturaForEach {
        public static void main(String[] args) {

            // Esse forEach é exclusivo para vetores
            int[] numeros = {3,5,1,8,4};
            // Funciona só para vetores

            for(int valor: numeros){
                System.out.println(valor);
            }

            String[] nomes = {"Eduardo","Fernando"};

            for(String valores : nomes){
                System.out.println(valores);
            }
        }
    }

