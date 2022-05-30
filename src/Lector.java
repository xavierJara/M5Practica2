
import java.util.ArrayList;

public class Lector {

    private int id;

    private ArrayList<Copia> prestecs;

    public Lector(int id) {
        this.id = id;
        
    }

    public int getId() {
        return id;
    }

    public ArrayList<Copia> getPrestecs() {
        return prestecs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrestecs(ArrayList<Copia> prestecs) {
        this.prestecs = prestecs;
    }
    
}
