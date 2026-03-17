package Colecciones;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;


    @Override
    public String toString() {
        return "El Libro " + titulo+ " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPaginas + " paginas";
    }

    public Libro(){

    }

    public Libro(String isbn, String titulo, String autor, int numPaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }


}
