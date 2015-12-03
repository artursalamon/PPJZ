package PPJz_10;

/**
 * Created by Artur Salamon on 2015-12-03.
 */
public class Main {

    public static void main(String[] args) {
        Zadanie1 zad = new Zadanie1(123, 6.66, "Szatan");
        Zadanie1 zad2 = new Zadanie1(zad);
        Zadanie1 zad3 = new Zadanie1(123, 6.66, "Szatannn");
        zad2.show();
        System.out.println(zad2.equals(zad3));
        System.out.println();
        System.out.println(zad.toString());
        String napis = new String(zad3.toString());
        System.out.println(napis);
    }

}
