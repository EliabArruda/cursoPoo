package exercicios.associacao;

public class Aula {


    private Professor professor;
    private Aluno aluno;
    private String tema;
    private int duracao;

    public Aula(){


    }

    public Aula(Professor professor, Aluno aluno, String tema, int duracao){
        this.professor = professor;
        this.aluno = aluno;
        this.tema = tema;
        this.duracao = duracao;


    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return
                "professor=" + getProfessor() +
                ", aluno=" + getAluno() +
                ", tema='" + getTema() + '\'' +
                ", duracao=" + getDuracao() +
                '}';
    }
}
