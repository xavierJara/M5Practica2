public class Copia extends Llibre {

    private int id;

    private String estat;

    public Copia(int id, String estat, String nom, String editorial, String tipo, int isbn) {
        super(nom, editorial, tipo, isbn);
        this.id = id;
        this.estat = estat;
    }

    public int getId() {
        return id;
    }

    public String getEstat() {
        return estat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
    
}
