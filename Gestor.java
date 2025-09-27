import java.util.*;

public class Gestor {
    private ArrayList<Libro> Libros;
    private ArrayList<Usuario> Usuario;
    private Scanner sc;

    public void RegistrarLibros(){
        System.out.println("Cuantos Libros desea registrar");
        int cantidad=sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Libros.add(new Libro());
        }
        
    }
    
    public void RegistrarUsuario(){
        Usuario.add(new Usuario());
    }

    public void PrestarLibro(){
        
    }
}
