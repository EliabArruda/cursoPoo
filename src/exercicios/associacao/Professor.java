package exercicios.associacao;

public class Professor extends Pessoa{

    private String curso;
    private String nivelDeFormacao;


    public Professor(){


    }

    public Professor(String nome, int idade){
        super(nome,idade);
    }

    public Professor(String nome, int idade, float altura, double peso, String sexo, String email){
        super(nome,idade,altura,peso,sexo,email);
        this.curso = curso;
        this.nivelDeFormacao = nivelDeFormacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNivelDeFormacao() {
        return nivelDeFormacao;
    }

    public void setNivelDeFormacao(String nivelDeFormacao) {
        this.nivelDeFormacao = nivelDeFormacao;
    }

    @Override
    public int fazerAniversario() {
        return super.fazerAniversario();
    }
}
