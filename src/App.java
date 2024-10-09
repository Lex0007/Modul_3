import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class App {
    public static void main(String[] args){

        Medienbibliothek m = new Medienbibliothek();


        Filme filme = new Filme("Marvels", "Super", new Date(2020), new Genre("Action"), "Herrmann", 120, Bildaufloesung.HD);
        eBooks eBooks = new eBooks("Harry Potter", "langweilig", new Date(1997), new Genre("Magic"), "herbert", "665-519841454-655", 500, "3.");

        m.addMedium(filme);
        m.addMedium(eBooks);

        m.allesAusgeben();


        System.out.println();
        System.out.println("-------Titel ausgeben-------");
        for (Filme filme1 : m.listFilme()) {
            System.out.println();
            filme1.anzeigen();
        }


    }
}
