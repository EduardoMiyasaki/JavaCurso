public final class Bolsista extends Aluno {

    private int bolsa;

    // Metódos especiais
    public void setBolsa(int b) {
        this.bolsa = b;
    }

    public int getBolsa() {
        return this.bolsa;
    }

    // Metódos públicos

    public void renovarBolsa() {

        System.out.println("Informe quando sua nova bolsa vence");
        int vencimento = teclado.nextInt();
        if (vencimento > getBolsa()) {

            this.setBolsa(vencimento);
        }
        else{
            System.out.println("Sua bolsa antiga tem duração maior que a nova");
        }
    }

    // Sobreescrevendo o metódo de aluno
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " sua mensalidade já foi paga!!! Você é bolsista");
    }
}
