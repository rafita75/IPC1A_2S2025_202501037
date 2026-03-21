package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import models.Usuario;
import models.Libro;

public class Sistema {
    public static Usuario[] usuarios = new Usuario[100];
    public static int contadorUsuarios = 0;
    public static Usuario usuarioActual;
    
    // Libros
    public static Libro[] libros = new Libro[100];
    public static int contadorLibros = 0;
    
    // Cargar Usuario ya guardados desde archivo cuentas.txt
    public static void cargarUsuarios() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("cuentas.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                int carnet = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String password = datos[2];
                String carrera = datos[3];
                String rol = datos[4];

                usuarios[contadorUsuarios++] = new Usuario(carnet, nombre, password, carrera, rol);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo");
        }
    }
    
    // guardar usuarios creades en archivo cuentas.txt
    public static void guardarUsuarioArchivo(Usuario u) {
        try {
            FileWriter fw = new FileWriter("cuentas.txt", true);

            fw.write(u.carnet + ";" + u.nombreCompleto + ";" + u.password + ";" + u.carrera + ";" + u.rol + "\n");

            fw.close();
        } catch (IOException e) {
            System.out.println("Error al guardar usuario");
        }
    }
    
    // Usuario admin predeterminado
    public static void inicializarAdmin() {
        boolean existe = false;

        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].carnet == 0) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            usuarios[contadorUsuarios++] =
                new Usuario(0, "admin", "admin", "admin", "Administrador");
        }
    }
    
    // funcion para reescribir todos los usuario al momento de modificar mas de algo o eliminar
    public static void reescribirArchivoUsuarios() {
        try {
            FileWriter fw = new FileWriter("cuentas.txt");

            for (int i = 0; i < contadorUsuarios; i++) {
                Usuario u = usuarios[i];

                fw.write(u.carnet + ";" + u.nombreCompleto + ";" + u.password + ";" + u.carrera + ";" + u.rol + "\n");
            }

            fw.close();
        } catch (Exception e) {
            System.out.println("Error al reescribir archivo");
        }
    }
    
    
    
    // FUNCIONES DE LIBROS SE USA LO MISMO QUE EN USUARIOS
    
    public static void guardarLibroArchivo(Libro l) {
        try {
            FileWriter fw = new FileWriter("libros.txt", true);

            fw.write(l.codigo + ";" + l.isbn + ";" + l.titulo + ";" + l.autor + ";" + l.cantidadTotal + ";" + l.cantidadDisponible + "\n");

            fw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar libro");
        }
    }
       
    public static void cargarLibros() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("libros.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                String codigo = datos[0];
                String isbn = datos[1];
                String titulo = datos[2];
                String autor = datos[3];
                int total = Integer.parseInt(datos[4]);
                int disponible = Integer.parseInt(datos[5]);

                Libro l = new Libro(codigo, isbn, titulo, autor, total);
                l.cantidadDisponible = disponible;

                libros[contadorLibros++] = l;
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No hay archivo libros.txt");
        }
    } 
    
    public static void reescribirArchivoLibros() {
        try {
            FileWriter fw = new FileWriter("libros.txt");

            for (int i = 0; i < contadorLibros; i++) {
                Libro l = libros[i];

                fw.write(l.codigo + ";" + l.isbn + ";" + l.titulo + ";" + l.autor + ";" + l.cantidadTotal + ";" + l.cantidadDisponible + "\n");
            }

            fw.close();
        } catch (Exception e) {
            System.out.println("Error al reescribir libros");
        }
    }
}
