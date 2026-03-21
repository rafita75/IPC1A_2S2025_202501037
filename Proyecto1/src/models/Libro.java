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
}