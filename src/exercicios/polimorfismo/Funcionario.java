package exercicios.polimorfismo;

public class Funcionario {

    protected String nome;
    protected int idade;
    protected String funcao;
    protected double salario;
    protected boolean metaBatida;


    //Construtores
    public Funcionario(){


    }

    public Funcionario(String nome, int idade, String funcao, double salario){
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.salario = salario;
    }



    //Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }

    public void baterMeta() {
        metaBatida = true;
    }
}
