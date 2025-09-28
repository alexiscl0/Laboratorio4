import java.util.*;
public class Sistema{
    public static void main(String[] args) {
        boolean bucle=true;
        int opcion;
        Scanner sc=new Scanner(System.in);
        Biblioteca biblioteca=new Biblioteca();
        while(bucle){
            System.out.println("Selecciona una opcion\n0) Ya no quiero\n1) Prestar un libro\n2) Devolver un libro");
            opcion=sc.nextInt();
            switch (opcion) {
                case 0:
                    bucle=false;
                    biblioteca.mostrarUsuarioLibro();
                    break;
                case 1:
                    biblioteca.PrestarLibro();
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("No es un opcion válida");
                    break;
            }
        }
    }
}