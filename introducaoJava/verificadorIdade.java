import java.util.Scanner;
import java.util.Calendar;

public class verificadorIdade {
    public static void main(String[] args) {

        String voto = "";
        String situacao;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        System.out.print("Informe seu mês de nascimento: ");
        String mesNascimento = teclado.next();

        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        // int mes = cal.get(Calendar.MONTH);

        int idade = ano - anoNascimento;

        if(idade >= 18){
            situacao = "maior de idade";
        }else{
            situacao = "menor de idade";
        }

        if(idade >= 16 && idade <= 18 || idade > 70){
           voto = "opcional";
        } else if(idade < 16){
            voto = "não pode votar";
        }
        else{
            voto = "obrigatório";
        }

        System.out.println("Você nasceu em " + anoNascimento + " no mês de " + mesNascimento + "\n Você tem " + idade + " anos e você é " + situacao + "\n Seu voto é " +voto);
    }
}
