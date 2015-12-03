package PPJz_10;

import java.util.ArrayList;

/**
 * Created by Artur Salamon on 2015-12-03.
 */
public class Przedmiot {
    private Prowadzacy prowadzacy;
    private ArrayList<Student> uczeszczajacyStudenci;


    public Przedmiot(Prowadzacy prowadzacy, ArrayList<Student> uczeszczajacyStudenci) {
        this.prowadzacy = prowadzacy;
        this.uczeszczajacyStudenci = uczeszczajacyStudenci;
    }

    public Prowadzacy getProwadzacy() {
        return prowadzacy;
    }

    public void setProwadzacy(Prowadzacy prowadzacy) {
        this.prowadzacy = prowadzacy;
    }

    public ArrayList<Student> getUczeszczajacyStudenci() {
        return uczeszczajacyStudenci;
    }

    public void setUczeszczajacyStudenci(ArrayList<Student> uczeszczajacyStudenci) {
        this.uczeszczajacyStudenci = uczeszczajacyStudenci;
    }

    public void show(){

        System.out.println("Nazwa przedmiotu: " + this.prowadzacy.getNazwaPrzedmiotu());
        System.out.println("Prowadzacy: " + this.prowadzacy.getImie() + " " + this.prowadzacy.getNazwisko());
        System.out.println("Lista zapisanych studentow: ");
        System.out.println(this.getUczeszczajacyStudenci());
    }

}
