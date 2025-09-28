import java.util.*;

public class Usuario {
    private String nombre;
    private ArrayList<Libro> libroTomado;
    private ArrayList<Libro> librosdisponibles;
    private Scanner sc=new Scanner(System.in);

    public Usuario(){
        libroTomado=new ArrayList<>();
        setNombre();
    }

    public void TomarPrestadoLibros(){
        String confirmacion;
        do{
            System.out.println("Que libros desee tomar");
            String nombre=sc.nextLine();
            for (int i = 0; i < librosdisponibles.size(); i++) {
                if(librosdisponibles.get(i).getTitulo().equals(nombre)){
                    libroTomado.add(librosdisponibles.get(i));
                    librosdisponibles.get(i).setDisponible(false);
                }
                    
            }
            System.out.println("Desea tomar más libros?");
            confirmacion=sc.nextLine().toUpperCase();
        }while(confirmacion.equals("SI"));
    }

    public void DevolverLibro(){
        
    }

    public void VerificarLibro(ArrayList<Libro> libros){
        librosdisponibles=new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getDisponible()==true)
                librosdisponibles.add(libros.get(i));
        }
    }

    public void setNombre(){
        System.out.println("Ingresar nombre: ");
        this.nombre=sc.nextLine();
    }

    public String getNombre(){
        return nombre;
    }

    public int NumeroLibrosTomados(){
        return libroTomado.size();
    }
    public String getLibrosTomados(int i){
        return libroTomado.get(i).toString();
    }
}
