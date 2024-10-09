import java.util.Date;

public class eBooks extends Medium{
    private String autor;
    private String ISBN;
    private int seitenanzahl;
    private String auflage;
    public eBooks(String titel, String kommentar, Date erscheinungsdatum, Genre genre) {
        super(titel, kommentar, erscheinungsdatum, genre);
    }

    public eBooks(String titel, String kommentar, Date erscheinungsdatum, Genre genre, String autor, String ISBN, int seitenanzahl, String auflage) {
        super(titel, kommentar, erscheinungsdatum, genre);
        this.autor = autor;
        this.ISBN = ISBN;
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }


    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.print(" autor: " + autor + " ISBN: " + ISBN + " seitenanzahl: " + seitenanzahl + " auflage: " + auflage);
    }
}
