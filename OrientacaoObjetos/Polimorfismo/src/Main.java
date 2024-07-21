public class Main {
    public static void main(String[] args) {

        // Polimorfismo
        // Poli = muitas
        // Morfo = formas


        // Polimorfismo = permite que um mesmo nome represente vários comportamentos diferentes


        //                       Assinaturas do método

        // Quantidade e os tipos de parâmetros


        //                          Tipos de polimorfismo

        // Sobreposição = Acontece quando substituímos um método de uma superClasse na sua subClasse,usando a mesma assinatura

        // Sobrecarga =

        Mamifero mamifero1 = new Mamifero();

        mamifero1.setNome("Cachorro");
        mamifero1.setIdade(10);
        mamifero1.setCor("Preto");
        mamifero1.setMembros(4);
        mamifero1.setPeso(30);
        mamifero1.locomover();
        mamifero1.alimentar();
        mamifero1.emitirSom();
        System.out.println(mamifero1.getNome());

        Reptil reptil1 = new Reptil();
        reptil1.setNome("Cameleão");
        reptil1.setIdade(3);
        reptil1.setCor("Muitas");
        reptil1.setMembros(4);
        reptil1.setPeso(10);
        reptil1.locomover();
        reptil1.alimentar();
        reptil1.emitirSom();
        System.out.println(reptil1.getNome());

        Peixe peixe1 = new Peixe();
        peixe1.setNome("Dory");
        peixe1.setIdade(15);
        peixe1.setCor("Azul");
        peixe1.setMembros(0);
        peixe1.setPeso(4);
        peixe1.locomover();
        peixe1.alimentar();
        peixe1.emitirSom();
        peixe1.soltarBolha();
        System.out.println(peixe1.getNome());

        Ave ave1 = new Ave();
        ave1.setNome("Gavião");
        ave1.setIdade(114);
        ave1.setCor("Preto e branco");
        ave1.setMembros(2);
        ave1.setPeso(47);
        ave1.locomover();
        ave1.alimentar();
        ave1.emitirSom();
        ave1.fazerNinho();
        System.out.println(ave1.getNome());

        Canguru canguru1 = new Canguru();

        canguru1.setNome("Canguru1");
        canguru1.setIdade(13);
        canguru1.setCor("Amarelo");
        canguru1.setMembros(4);
        canguru1.setPeso(35);
        canguru1.locomover();
        canguru1.alimentar();
        canguru1.emitirSom();
        canguru1.usarBolsa();

       Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("Dora");
        cachorro1.setIdade(13);
        cachorro1.setCor("Preto");
        cachorro1.setMembros(4);
        cachorro1.setPeso(35);
        cachorro1.locomover();
        cachorro1.alimentar();
        cachorro1.emitirSom();
        cachorro1.enterrarOsso();
        cachorro1.abanarRabo();

        Tartaruga tartaruga1 = new Tartaruga();
        tartaruga1.setNome("Tortuguita");
        tartaruga1.setIdade(95);
        tartaruga1.setCor("Marrom");
        tartaruga1.setMembros(4);
        tartaruga1.setPeso(40);
        tartaruga1.locomover();
        tartaruga1.alimentar();
        tartaruga1.emitirSom();
    }
}