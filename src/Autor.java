
import java.util.ArrayList;

public class Autor {

    private String nom;

    private ArrayList<Llibre> llibres;

    private String nacionalitat;

    public Autor(String nom, String nacionalitat) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Llibre> getLlibres() {
        return llibres;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLlibres(ArrayList<Llibre> llibres) {
        this.llibres = llibres;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }
    
}
