package exercicios.associacao;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected float altura;
    protected double peso;
    protected String sexo;
    protected String email;

    public Pessoa(){


    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa(String nome, int idade, float altura, double peso, String sexo, String email) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.email = email;
    }

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int fazerAniversario(){

        return idade++;
    }
}
