package models;

public class Usuario {
    public int carnet;
    public String nombreCompleto;
    public String password;
    public String rol; // admin, operador, estudiante
    public String carrera;

    public Usuario(int carnet, String nombreCompleto, String password, String rol, String carrera) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.rol = rol;
        this.carrera = carrera;
        this.carnet = carnet;
    }
}