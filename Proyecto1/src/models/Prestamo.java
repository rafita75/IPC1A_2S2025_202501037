package models;

public class Prestamo {
    public String codigo;
    public String carnet;
    public String codigoLibro;
    public String fechaPrestamo;
    public String fechaLimite;
    public String estado; // ACTIVO o DEVUELTO

    public Prestamo(String codigo, String carnet, String codigoLibro, String fechaPrestamo, String fechaLimite, String estado) {
        this.codigo = codigo;
        this.carnet = carnet;
        this.codigoLibro = codigoLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
    }
}