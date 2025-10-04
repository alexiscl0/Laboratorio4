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
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            Libros.add(new Libro());
        }
    }
    
    public void RegistrarUsuario(){
        Usuario.add(new Usuario());
    }

    public void PrestarLibro(){
        int posicion=VerPosicion();
        Usuario.get(posicion).VerificarLibro(Libros); 
        Usuario.get(posicion).TomarPrestadoLibros();
    }

    public void DevolverLibro(){
        System.out.println("Cual es su nombre?");
        sc.nextLine();
        String nombre=sc.nextLine();
        for (int i = 0; i < Usuario.size(); i++) {
            if(Usuario.get(i).getNombre().equals(nombre)){
                Usuario.get(i).DevolverLibro();
            }
        }
    }
    
    public void mostrarUsuarioLibro(){
        if(Usuario.size()==0)
            System.out.println("Nohay ningun Usuario que haya tomado libros");
        else{
            for (int i = 0; i < Usuario.size(); i++) {
                System.out.println(" "+Usuario.get(i).getNombre());
                for (int j = 0; j < Usuario.get(i).NumeroLibrosTomados(); j++) {
                    System.out.println(Usuario.get(i).getLibrosTomados(j)); 
                }
            }
        }
        
    }
    
    public String ConfirmacionUsuarioNuevo(){
        System.out.println("Eres usuario nuevo?");
        String confirmacion=sc.next().toUpperCase();
        if(confirmacion.equals("SI")){
            RegistrarUsuario();}
        return confirmacion;
    }
    public int VerPosicion(){
        String nombre;
        int posicion=0;
        String confirmacion=ConfirmacionUsuarioNuevo();
        if(confirmacion.equals("NO")){
            System.out.println("Indique su nombre");
            sc.nextLine();
            nombre=sc.nextLine();
            for (int i = 0; i < Usuario.size(); i++) {
                if(Usuario.get(i).getNombre().equals(nombre))
                    posicion=i;
            }
        }
        else{
            posicion=Usuario.size()-1;
        }
        return posicion;
    }
}
