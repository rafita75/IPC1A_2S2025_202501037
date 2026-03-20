package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import models.Usuario;

public class Sistema {
    public static Usuario[] usuarios = new Usuario[100];
    public static int contadorUsuarios = 0;
    
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
}
