import java.util.Scanner;

public class Luta {

    // Agregação com Lutador
    // Uma luta tem um lutador

    // essa atributo desafiado é uma instancia de lutador
    // com o tipo abstrato ao inves de primitivo

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    Scanner teclado = new Scanner(System.in);

    // Metódos especiais

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
        // this.desafiado.setNome(dd.getNome());
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setAprovada(boolean a) {
        this.aprovada = a;
    }

    public boolean getAprovado() {
        return this.aprovada;
    }

    // Metódos principais

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {

        this.desafiado = lutador1;
        this.desafiante = lutador2;

        if (this.desafiado.getCategoria() != this.desafiante.getCategoria()) {
            System.out.println("Não pode haver luta!!!Categorias diferentes");
            this.aprovada = false;
        } else if (this.desafiado.getNome().equals(this.desafiante.getNome())) {
            System.out.println("Não pode haver luta!!!São a mesma pessoa");
            this.aprovada = false;
        } else {
            System.out.print("Informe a quantidade de rounds:");
            int qtdRounds = teclado.nextInt();
            setRounds(qtdRounds);
            this.aprovada = true;
            System.out.println("Luta será realizada");
        }
    }

    private void apresentarLutadores() {
        System.out.println("E o primeiro lutador é");
        this.desafiado.apresentar();
        System.out.println("---------------------------------------------------------");
        System.out.println("E o segundo lutador é");
        this.desafiante.apresentar();
    }

    public void lutar() {

        if (getAprovado()) {

            this.apresentarLutadores();

            // da pra fazer esse sorteio de outra forma
            // Random aleatorio = new Random();
            // int vencedor = aleatorio.nextInt(3);

            float vencedor = (float) Math.random();
            vencedor = vencedor * 2;
            int vencedor1 = Math.round(vencedor);

            System.out.println("============= Resultado da luta ===========");
            if (vencedor1 == 0) {
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                System.out.println("E a luta deu empate");
            } else if (vencedor1 == 1) {
                System.out.println("O vencedor foi " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else {
                System.out.println("E o vencedor é " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
            }
        } else {
            System.out.println("Luta não pode acontecer, pois não foi aprovada");
        }
            System.out.println("====================================");
    }
}
