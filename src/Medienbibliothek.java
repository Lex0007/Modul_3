import java.util.ArrayList;

public class Medienbibliothek {
    private ArrayList<Medium> listMedien;

    public Medienbibliothek(ArrayList<Medium> listMedien) {
        this.listMedien = new ArrayList<>();
    }

    public void addMedium(Medium medium) {
        this.listMedien.add(medium);
    }

    public void allesAusgeben() {
        for (Medium m : listMedien) {
            System.out.println("--------------------------------");
            m.anzeigen();
        }
    }

    public ArrayList<Filme> listFilme(){
        ArrayList<Filme> filmes = new ArrayList<>();
        for( Medium m : listMedien)
        {
            if (m instanceof Filme) {
                filmes.add((Filme) m);
            }

        }
       return filmes;
    }
}


