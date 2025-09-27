import java.util.*;

public class Usuario {
    private String nombre;
    private ArrayList<Libro> libroTomado;
    private Scanner sc;

    public Usuario(){
        System.out.println("Ingresar nombre: ");
        this.nombre=sc.nextLine();
    }

    public void TomarPrestadoLibros(Libro[] libroDisponibles){
        System.out.println("Cuantos libros desee tomar");
        int cantidad=sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            libroTomado.add()
        }
    }
}
