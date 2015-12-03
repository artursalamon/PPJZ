package PPJz_10;

/**
 * Created by Artur Salamon on 2015-12-03.
 */
public class Prowadzacy extends Osoba {

    private String stopienNaukowy;
    private String nazwaPrzedmiotu;

    public String getStopienNaukowy() {
        return stopienNaukowy;
    }

    public void setStopienNaukowy(String stopienNaukowy) {
        this.stopienNaukowy = stopienNaukowy;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Prowadzacy(String imie, String nazwisko, int wiek, boolean czyFacet, String stopienNaukowy, String nazwaPrzedmiotu) {
        super(imie, nazwisko, wiek, czyFacet);
        this.stopienNaukowy = stopienNaukowy;
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }
}
