package exercicios.polimorfismo;

public class Main {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();


        //Upcast
        Vendedor vendedor = new Vendedor("",18,"Vendedor",1000d, 45);

        vendedor.setQuantidadeDeVendasMensais(50);
        vendedor.verificacaoDeVendas();
        vendedor.calcularBonus();







        }

    }

