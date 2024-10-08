import java.util.ArrayList;

public class Medienbibliothek {
    private ArrayList<Medium> listMedium;

    public Medienbibliothek(ArrayList<Medium> listMedium) {
        this.listMedium = new ArrayList<>();
    }
    public void addMedium(Medium medium) {
        this.listMedium.add(medium);
    }



}
