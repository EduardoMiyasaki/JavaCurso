public class Main {
    public static void main(String[] args) {

        // Para fazer sobreposição tem que ter a mesma assinatura ou seja os parametros tem que ser iguais em quantidades e tipos
        // e em classes diferentes

        // Polimorfismo de sobrecarga tem assinaturas diferentes ou seja tem parametros diferentes seja na quantidade ou tipo
        // e é feito na mesma classe como por exemplo na classe cachorro

        DonoCachorro dono1 = new DonoCachorro();

        dono1.setNome("Eduardo");
        dono1.setIdade(18);
        dono1.setPeso(59.9f);
        dono1.setDono(true);
        dono1.setNomeCachorro("Dora");

        DonoCachorro dono2 = new DonoCachorro();

        dono2.setNome("Fernando");
        dono2.setIdade(13);
        dono2.setPeso(57.9f);
        dono2.setDono(true);
        dono2.setNomeCachorro("Wiggle");

        Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("Dora");
        cachorro1.setCor("Preta");
        cachorro1.setIdade(13);
        cachorro1.setPeso(13.5f);
        cachorro1.setMembros(4);
        cachorro1.setNomeDono("Eduardo");
        cachorro1.reagir(12, 14f);

        cachorro1.reagir(dono2);

        Cachorro cachorro2 = new Cachorro();

        cachorro2.setNome("Wiggle");
        cachorro2.setCor("Branco");
        cachorro2.setIdade(7);
        cachorro2.setPeso(18.5f);
        cachorro2.setMembros(4);
        cachorro2.setNomeDono("Fernando");
        cachorro2.reagir("Ola");
        cachorro2.reagir(19);
        cachorro2.reagir(dono2);
    }
}