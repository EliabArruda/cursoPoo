package exercicios.associacao;

public class Aluno extends Pessoa{

    private int id;
    private int matricula;
    private String curso;

    public Aluno(){


    }

    public Aluno(String nome, int idade, int id) {
        super(nome, idade);
        this.id = id;
    }

    public Aluno(String nome, int idade, float altura, double peso, String sexo,
                 String email, int id, int matricula, String curso) {
        super(nome, idade, altura, peso, sexo, email);
        this.id = id;
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int fazerAniversario() {
        return super.fazerAniversario();
    }

    @Override
    public String toString() {
        return getNome();
    }
}
