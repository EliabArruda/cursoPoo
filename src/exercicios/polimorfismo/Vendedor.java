package exercicios.polimorfismo;

public class Vendedor extends Funcionario{

    private int quantidadeDeVendasMensais;

    public Vendedor(){

    }

    public Vendedor(String nome, int idade, String funcao, double salario, int quantidadeDeVendas) {
        super(nome, idade, funcao, salario);
        this.quantidadeDeVendasMensais = quantidadeDeVendas;
    }

    public int getQuantidadeDeVendasMensais() {
        return quantidadeDeVendasMensais;
    }

    public void setQuantidadeDeVendasMensais(int quantidadeDeVendasMensais) {
        this.quantidadeDeVendasMensais = quantidadeDeVendasMensais;
    }


    //Regra de Negócio
    @Override
    public void baterMeta() {

        System.out.println("Parabéns pelas vendas " + nome);
        metaBatida = true;
    }

    public void verificacaoDeVendas(){

        if (quantidadeDeVendasMensais >= 40) {
            baterMeta();

            System.out.println("Parabéns! Você bateu a meta fazendo " + quantidadeDeVendasMensais + " vendas");
        } else {
            System.out.println("Infelizmente não bateu a meta, você fez " + quantidadeDeVendasMensais + " vendas");
            metaBatida = false;
        }

    }

        public void calcularBonus() {
            System.out.println("Salário antigo: R$" + getSalario());

            if (metaBatida == true) {

                setSalario(getSalario() + (getSalario() * 0.1));

                double bonus = getSalario();

                System.out.println("Seu novo salário é: R$" + bonus);

            }

        }
    }
