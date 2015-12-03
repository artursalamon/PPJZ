package PPJz_10;

/**
 * Created by Artur Salamon on 2015-12-03.
 */
public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;
    private boolean czyFacet;



    public Osoba(String imie, String nazwisko, int wiek, boolean czyFacet) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.czyFacet = czyFacet;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isCzyFacet() {
        return czyFacet;
    }

    public void setCzyFacet(boolean czyFacet) {
        this.czyFacet = czyFacet;
    }
}
