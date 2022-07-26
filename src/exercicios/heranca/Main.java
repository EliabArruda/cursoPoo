package exercicios.heranca;

public class Main {

    public static void main(String[] args){

        Carro carro1 = new Carro("Fiat Cronos 2020", "Preto", 48f);
        Carro carro2 = new Carro("Chevrolet Camaro SS 2015", "Azul", 54f);

        //Carro 1
        carro1.setCor("Vermelho");
        carro1.setCapacidadeDoTanque(61f);
        System.out.println(carro1.toString());
        System.out.println();

        System.out.println("O preço total para encher o tanque do veículo "
                + carro1.getModelo() + " é de: R$" + carro1.encherTanque(7.08f));


        System.out.println("=================================");
        System.out.println();


        //Carro 2
        carro2.setCor("Amarelo");
        carro2.setCapacidadeDoTanque(58f);
        System.out.println(carro2.toString());
        System.out.println();

        System.out.println("O preço total para encher o tanque do veículo "
                + carro2.getModelo() + " é de: R$" + carro2.encherTanque(7.08f));

        System.out.println("=================================");
        System.out.println();


        //===================================================

        Moto moto1 = new Moto();

        moto1.setModelo("XRE 190 2020");
        moto1.setCor("Preta");
        moto1.setCapacidadeDoTanque(13.5f);
        System.out.println(moto1.toString());

        System.out.println("O preço total para encher o tanque do veículo "
                + moto1.getModelo() + " é de: R$" + moto1.encherTanque(5.89f));

        System.out.println("=================================");
        System.out.println();


        //===================================================


        Caminhao caminhao1 = new Caminhao("Volkswagen Worker Euro 5","Branco", 275f);

        
        System.out.println("O preço total para encher o tanque do veículo "
                + caminhao1.getModelo() + " é de: R$" + caminhao1.encherTanque(7.56f));



        System.out.println("=================================");
        System.out.println();


        //===================================================




    }
}
