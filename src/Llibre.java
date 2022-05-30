public abstract class Llibre {

    private String nom;

    private String editorial;

    private String tipo;

    private int isbn;

    public Llibre(String nom, String editorial, String tipo, int isbn) {
        this.nom = nom;
        this.editorial = editorial;
        this.tipo = tipo;
        this.isbn = isbn;
    }

    public String getNom() {
        return nom;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
