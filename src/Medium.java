import java.util.Date;

public abstract class Medium {
    private String titel;
    private String kommentar;
    private Date erscheinungsdatum;
    private String genre;

    public Medium(String titel, String kommentar, Date erscheinungsdatum, String genre) {
        this.titel = titel;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
        this.genre = genre;
    }

    public String getTitel() {
        return titel;
    }

    public String getKommentar() {
        return kommentar;
    }

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void anzeigen(){
        System.out.println("Titel: " + getTitel() + "kommentar: " + getKommentar() +"erscheinungsdatum: "+ getErscheinungsdatum() +  "genre: " + getGenre());
    }

}
