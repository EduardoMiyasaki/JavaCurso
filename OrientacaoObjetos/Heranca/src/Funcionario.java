import java.util.Scanner;

public class Funcionario extends Pessoa{

   private String setor;
   private boolean trabalhando;

   Scanner teclado = new Scanner(System.in);

   public void setSetor(String set){
       this.setor = set;
   }

   public String getSetor(){
       return this.setor;
   }

   public void setTrabalhando(boolean trab){
       this.trabalhando = trab;
   }

   public boolean getTrabalhando(){
       return this.trabalhando;
   }

   public void mudarTrabalho(){

       System.out.print("informe o novo setor:");
       String novoSetor = teclado.next();

       this.setSetor(novoSetor);
   }
}
