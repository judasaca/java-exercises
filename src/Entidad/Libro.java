package Entidad;

public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro () {

    }
    public Libro (String ISBN, String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
}
