public class Main {

    public static void main(String[] args) {

        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("SnapsShadow", "Estados Unidos", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("DeadCode", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "Estados Unidos", 30, 1.81, 105.7, 12, 2, 4);

        /*  Lutador lutador1 = new Lutador();
        Lutador lutador2 = new Lutador();

        lutador1.setNome("Pretty Boy");
        lutador1.setNacionalidade("França");
        */

        lutadores[3].ganharLuta();
        lutadores[3].perderLuta();
        lutadores[3].empatarLuta();
        lutadores[3].setPeso(53.6);
        lutadores[3].apresentar();
        lutadores[0].status();
    }
}