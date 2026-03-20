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

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
    
}