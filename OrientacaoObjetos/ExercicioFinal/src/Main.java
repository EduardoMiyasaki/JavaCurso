
public class Main {
    public static void main(String[] args)  {

        Video[] videos = new Video[3];

        videos[0] = new Video("Slime deu certo");
        videos[1] = new Video("Aula 1 de java");
        videos[2] = new Video("Aula 10 de css");

        //videos[0].status();

        Gafanhoto[] alunos = new Gafanhoto[2];

        alunos[0] = new Gafanhoto("Eduardo",18,"Masculino","eduardomiyasaki@gmail.com");
        alunos[1] = new Gafanhoto("Creuza",22,"Femenino","creuza@gmail.com");

        //alunos[0].status();

        Visualizacao[] visualizacoes = new Visualizacao[3];

        visualizacoes[0] = new Visualizacao(alunos[0],videos[0]);
        visualizacoes[0].avaliar();

        visualizacoes[1] = new Visualizacao(alunos[0],videos[1]);

        visualizacoes[2] = new Visualizacao(alunos[1],videos[0]);
        visualizacoes[2].avaliar(90.0f);
        videos[0].status();

    }
}