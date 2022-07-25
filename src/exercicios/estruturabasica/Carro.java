package exercicios.estruturabasica;

public class Carro {

    private String cor;
    private String modelo;
    private float capacidadeDoTanque;

    public Carro(){


    }

    public Carro(String cor, String modelo, float capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(float capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    //Regra de Negocio
    public float encherTanque( float valorCombustivel){
        return valorCombustivel * capacidadeDoTanque;
    }


    /*  Método 'encherTanque()' Escrito de outra forma mas também Funciona


    public void encherTanque( float valorCombustivel){

        float precoTanqueCheio = valorCombustivel * capacidadeDoTanque;

        System.out.println("O preço total para encher o tanque é de : R$" + precoTanqueCheio);


    }*/

    @Override
    public String toString() {
         return "modelo: " + getModelo() + "\n" +
                "cor: " + getCor() + "\n" +
                "capacidade do Tanque: " + getCapacidadeDoTanque();
    }
}
