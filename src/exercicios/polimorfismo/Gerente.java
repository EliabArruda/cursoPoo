package exercicios.polimorfismo;

public class Gerente extends Funcionario {

    public Gerente(){

    }

    @Override
    public void baterMeta() {

        System.out.println("Parabéns pela gestão " + nome);

        metaBatida = true;
    }
}
