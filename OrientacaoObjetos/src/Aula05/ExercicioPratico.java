package Aula05;

public class ExercicioPratico {

    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();

        conta1.abrirConta("Conta corrente");
        conta1.setNumeroConta(4);
        conta1.setDono("Eduardo");

        conta1.dadosConta();
        conta1.depositar(100);
        conta1.sacar(150);
        conta1.pagarMensalidade();
        conta1.fecharConta();
        conta1.getNumeroConta();
        conta1.getTipoConta();
        conta1.getDono();
        conta1.getSaldo();

        ContaBanco conta2 = new ContaBanco();

        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("Segunda conta");
        conta2.dadosConta();
        conta2.abrirConta("Conta poupanca");
        conta2.setNumeroConta(87);
        conta2.setDono("Fernando Miyasaki");
        conta2.depositar(500);
        conta2.dadosConta();
    }

}
