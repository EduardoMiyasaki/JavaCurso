public class Gafanhoto extends Pessoa{

    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        setTotalAssistido(0);
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void viuMaisUm(){
        this.setTotalAssistido(this.getTotalAssistido() + 1);
    }

    @Override
    public void status(){
        // super.toString()
        // Chamaria todos os status da pessoa se estivesse sendo usado toString
        
        System.out.println("O nome da pessoa é: " + this.getNome());
        System.out.println("a idade da pessoa é: " + this.getIdade());
        System.out.println("o sexo da pessoa é: " + this.getSexo());
        System.out.println("a experiência da pessoa é: " + this.getExperiencia());
        System.out.println("o login  da pessoa é: " + this.getLogin());
        System.out.println("o total assistido é: " + this.getTotalAssistido());

    }
}
