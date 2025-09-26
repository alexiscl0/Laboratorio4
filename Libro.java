public class Libro {
    private String Titulo;
    private String Autor;
    private int ISBM;
    private boolean disponible;

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setISBM(int ISBM) {
        this.ISBM = ISBM;
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
}
