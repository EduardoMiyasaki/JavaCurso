public class CriandoCanetasVisibilidade {
    public static void main(String[] args) {

        CanetaVisiblidade caneta = new CanetaVisiblidade();

        caneta.modelo = "BIC Cristal";
        caneta.cor = "azul";
        //caneta.ponta = "azul";

        // o atributo carga funciona pois caneta é filha
        // eu estou utilizando algo que vem da Classe CanetaVisiblidade então é livre acesso
        //quando algo é protegido

        caneta.carga = 80;

        caneta.status();
        caneta.destampar();
        caneta.rabiscar();
    }
}
