package exercicios.fundamentos;

public class Livro {

    //Atributos do Livro
    private String autor;
    private String editora;
    private String titulo;
    private String edicao;
    private int quantidadePaginas;
    private double preco;

   //Métodos Especiais
    public String getAutor(){

        return this.autor;
    }

    public void setAutor(String autor){

        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
