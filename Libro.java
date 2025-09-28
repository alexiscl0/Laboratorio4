import java.util.*;

public class Libro {
    private String Titulo;
    private String Autor;
    private int ISBM;
    private boolean disponible;
    private Scanner sc=new Scanner(System.in);

    public Libro() {
        System.out.println("Ingrese titulo del libro: ");
        setTitulo(sc.nextLine());
        System.out.println("Ingresar autor del libro: ");
        setAutor(sc.nextLine());
        setISBM();
        setDisponible(true);
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setISBM() {
        int valor;
        do {
           System.out.print("Ingrese un ISBM (mayor a 999): ");
           valor = sc.nextInt();
        } while (valor <= 999);
        this.ISBM = valor;
    }


    public String getTitulo() {
        return this.Titulo;
    }

    public String getAutor() {
        return this.Autor;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public int getISBM() {
        return this.ISBM;
    }

    @Override
    public String toString() {
        return "   - Titulo\t" + getTitulo() + "\n"
                + "   - Autor\t" + getAutor() + "\n"
                + "   - ISBM\t" + getISBM() + "\n" +
                "   - Disponible\t" + getDisponible();
    }
}
