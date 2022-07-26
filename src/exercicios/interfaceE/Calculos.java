package exercicios.interfaceE;

public class Calculos implements OperacaoMatematica{

    int a;
    int b;

    @Override
    public int adicao() {
        return a + b;
    }

    @Override
    public int subtracao() {

        return a - b;
    }

    @Override
    public int multiplicacao() {

        return a * b;
    }

    @Override
    public int divisao() {

        return a / b;
    }
}
