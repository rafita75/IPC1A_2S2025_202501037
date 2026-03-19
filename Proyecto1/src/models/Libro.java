package models;

public class Libro {
    public String codigo;
    public String isbn;
    public String titulo;
    public String autor;
    public int cantidadTotal;
    public int cantidadDisponible;

    public Libro(String codigo, String isbn, String titulo, String autor, int cantidadTotal) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadTotal = cantidadTotal;
        this.cantidadDisponible = cantidadTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    
}