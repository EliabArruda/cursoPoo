package exercicios.heranca;

public class Carro extends Veiculo {

    private String tipoDeCambio;

    //Métodos Construtores
    public Carro() {


    }

    public Carro(String modelo, String cor, float capacidadeDoTanque) {
        super(modelo, cor, capacidadeDoTanque);
    }

}


