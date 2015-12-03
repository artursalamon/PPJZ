package PPJz_10;

/**
 * Created by Artur Salamon on 2015-12-03.
 */
public class Student extends Osoba {
    private String nrIndeksu;

    public Student(String imie, String nazwisko, int wiek, boolean czyFacet, String nrIndeksu) {
        super(imie, nazwisko, wiek, czyFacet);
        this.nrIndeksu = nrIndeksu;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(String nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    @Override
    public String toString() {
        return this.getImie() + " " + this.getNazwisko() + " " + this.getNrIndeksu();
    }
}
