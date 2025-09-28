import java.util.*;

public class Biblioteca{
    private ArrayList<Libro> Libros;
    private ArrayList<Usuario> Usuario;
    private Scanner sc=new Scanner(System.in);

    public Biblioteca(){
        Libros=new ArrayList<>();
        Usuario=new ArrayList<>();
        System.out.print("Cuantos Libros desea registrar: ");
        int cantidad=sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Libros.add(new Libro());
        }
    }
    
    public void RegistrarUsuario(){
        Usuario.add(new Usuario());
    }

    public void PrestarLibro(){
        RegistrarUsuario();
        int contador=Usuario.size()-1;
        Usuario.get(contador).VerificarLibro(Libros); 
        Usuario.get(contador).TomarPrestadoLibros();
    }
    
    public void mostrarUsuarioLibro(){
        for (int i = 0; i < Usuario.size(); i++) {
            System.out.println(" "+Usuario.get(i).getNombre());
            for (int j = 0; j < Usuario.get(i).NumeroLibrosTomados(); j++) {
                System.out.println(Usuario.get(i).getLibrosTomados(j)); 
            }
        }
    }
    
    
}
