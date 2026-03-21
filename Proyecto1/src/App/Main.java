package App;
import views.Login;
import utils.Sistema;

public class Main {

    public static void main(String[] args) {
        Sistema.cargarUsuarios();
        Sistema.inicializarAdmin(); 
        Sistema.cargarPrestamos();
        Sistema.cargarLibros();
        Login iniciar = new Login();
        iniciar.show();
    }
    
}
