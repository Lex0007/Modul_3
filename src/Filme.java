import java.util.Date;

public class Filme extends Medium{
    private String regisseur;
    private int spielzeit;
    private Bildaufloesung bildaufloesung;

    public Filme(String titel, String kommentar, Date erscheinungsdatum, String genre) {
        super(titel, kommentar, erscheinungsdatum, genre);

    }

    public Filme(String titel, String kommentar, Date erscheinungsdatum, String genre, String regisseur, int spielzeit, Bildaufloesung bildaufloesung) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.bildaufloesung = bildaufloesung;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public int getSpielzeit() {
        return spielzeit;
    }

    public Bildaufloesung getBildaufloesung() {
        return bildaufloesung;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public void setBildaufloesung(Bildaufloesung bildaufloesung) {
        this.bildaufloesung = bildaufloesung;
    }

    public void setSpielzeit(int spielzeit) {
        this.spielzeit = spielzeit;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
    }
}
