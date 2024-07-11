package Aula05;

public class ContaBanco {


        private String tipoConta;
        public int numeroConta;
        private String nome;
        private double saldo;
        private boolean status;

        // Metódo construtor
        public ContaBanco() {

            this.status = false;
            this.saldo = 0;
        }

        public void abrirConta(String t) {

            if (t == "Conta corrente") {

                this.tipoConta = t;
                this.saldo = 50;
                this.status = true;
                System.out.println("Conta Corrente criada!!!");

            } else if (t == "Conta poupanca") {

                this.tipoConta = t;
                this.saldo = 150;
                this.status = true;
                System.out.println("Conta Poupança criada!!!");

            } else {

                System.out.println("Erro!!!");
                System.out.println("Conta tem que ser do tipo corrente ou poupança");
            }
        }

        public void fecharConta() {

            if (this.saldo != 0) {
                System.out.println("Não pode fechar a conta! Saldo tem que ser 0");
            } else {
                this.status = false;
            }

        }

        public void depositar(int valor) {

            if (this.status == false) {
                System.out.println("Não pode depositar,pois sua conta está fechada");
            } else {
                this.saldo = this.saldo + valor;
                System.out.println("Depósito efetuado");
            }


        }

        public void sacar(int valor) {

            if (this.status == false) {

                System.out.println("Não pode sacar,pois sua conta está fechada");
            } else {
                if (valor > this.saldo) {
                    System.out.println("Erro! O valor que você está tentando sacar é maior do que o valor da conta");
                } else {
                    this.saldo = this.saldo - valor;
                    System.out.println("Saque efetuado");
                }
            }
        }

        public void pagarMensalidade() {

            if (this.status == false) {

                System.out.println("Não tem mensalidade pois sua conta está fechada");
            } else if (this.tipoConta == "Conta corrente") {
                this.saldo = this.saldo - 12;
                System.out.println("Pagamento da conta corrente efetuado!Foi descontado 12 reais");

            } else {
                this.saldo = this.saldo - 20;
                System.out.println("Pagamento da conta poupanca efetuado!Foi descontado 20 reais");
            }

        }

        public void dadosConta() {
            System.out.println("O tipo da conta é " + this.tipoConta);
            System.out.println("O número da conta é " + this.numeroConta);
            System.out.println("O nome do dono é " + this.nome);
            System.out.println("O saldo da conta é " + this.saldo);

            if (this.status == true) {

                System.out.println("O status da conta é aberta");
            } else {
                System.out.println("O status da conta é fechada");
            }

        }

        public void getNumeroConta() {
            System.out.println("O número da conta é " + this.numeroConta);

        }

        public void setNumeroConta(int n) {
            this.numeroConta = n;
        }

        public void getTipoConta() {
            System.out.println("O tipo da conta é " + this.tipoConta);

        }

        public void getDono() {
            System.out.println("O nome do dono da conta é " + this.nome);
        }

        public void setDono(String n) {
            this.nome = n;
        }

        public void getSaldo() {
            System.out.println("O saldo da conta é " + this.saldo);
        }

        public void setSaldo(int valor) {
            this.saldo = valor;
        }
    }


