public class chamandoFuncao2 {

    static int numero = 0;
    static int fatorial = 1;
    static String formula = "";

    // Mesmo sem o void
    // funcionaria pois na chamandoFuncao1 eu criei um novo objeto
    // fazendo com que funcionasse

 public static void setValor(int n){

        numero = n;
        int resultadoFatorial = 1;

        String s = "";

        for (int index = numero; index > 1; index --){

            resultadoFatorial = resultadoFatorial * index;
            s += index + " x ";

        }
        s += "1 = ";
        fatorial = resultadoFatorial;
        formula = s;
    }

   static public int getFatorial(){
        return fatorial;
    }

    static public String getFormula(){
        return formula;
    }
}
