public class Livro {
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.getTitulo());
        System.out.println("Autor: " +this.getAutor());
    }
}