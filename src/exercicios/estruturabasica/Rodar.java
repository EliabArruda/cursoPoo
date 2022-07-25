package exercicios.estruturabasica;

public class Rodar {

    public static void main(String[] args){

        Carro carro1 = new Carro("Preto", "Fiat Cronos 2020", 48f);
        Carro carro2 = new Carro("Azul", "Chevrolet Camaro SS 2015", 54f);

        //Carro 1
        carro1.setCor("Vermelho");
        carro1.setCapacidadeDoTanque(61f);
        System.out.println(carro1.toString());
        System.out.println();

        System.out.println("O preço total para encher o tanque do veículo "
                + carro1.getModelo() + " é de: R$" + carro1.encherTanque(7.08f));


        System.out.println("================================");
        System.out.println();


        //Carro 2
        carro2.setCor("Amarelo");
        carro2.setCapacidadeDoTanque(58f);
        System.out.println(carro2.toString());
        System.out.println();

        System.out.println("O preço total para encher o tanque do veículo "
                + carro2.getModelo() + " é de: R$" + carro2.encherTanque(7.08f));

    }
}
