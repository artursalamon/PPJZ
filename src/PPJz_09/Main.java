package PPJz_09;

/**
 * Created by Artur Salamon on 2015-11-30.
 */
public class Main {
    public static void main(String[] args) {
        Kwadrat figura = new Kwadrat(10);
        figura.showKwadrat();
        System.out.println();
        Walec figura2 = new Walec(5,1);
        figura2.show();

        Walec figura3 = figura.przygotujWalec();
        figura3.show();
        System.out.println();
        System.out.println();
        Wyraz wyraz = new Wyraz("kurdemol");
        wyraz.dodajZnak('a');
        wyraz.dodajZnak('r');
        wyraz.dodajZnak('a');
        wyraz.dodajZnak('r');
        wyraz.dodajZnak('a');
        wyraz.dodajZnak('r');
        System.out.println(wyraz.toString());
        System.out.println(wyraz.length());
        System.out.println();

        Wyraz2 wyraz2 = new Wyraz2("Ala ");
        wyraz2.setNastepnyWyraz("ma ");
        wyraz2.b.setNastepnyWyraz("kota ");
        wyraz2.b.b.setNastepnyWyraz("a ");
        wyraz2.b.b.b.setNastepnyWyraz("kot ");
        wyraz2.b.b.b.b.setNastepnyWyraz("ma ");
        wyraz2.b.b.b.b.b.setNastepnyWyraz("Ale");
        //System.out.println(wyraz2);
        wyraz2.show();

    }
}
