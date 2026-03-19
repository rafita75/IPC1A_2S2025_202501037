package models;

public class Usuario {
    public String username;
    public String password;
    public String rol; // admin, operador, estudiante
    public String nombre;

    public Usuario(String username, String password, String rol, String nombre) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}