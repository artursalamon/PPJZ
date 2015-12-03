package PPJz_10;

import java.util.ArrayList;

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
        System.out.println();
        System.out.println();


        Student ja = new Student("Artur", "Salamon", 26, true, "s13577");
        Student kolega = new Student("Marian", "Kowalski", 25, true, "s14555");
        ArrayList<Student> lista = new ArrayList<>();
        lista.add(ja);
        lista.add(kolega);
        Prowadzacy lan = new Prowadzacy("Truong", "Lan Le", 38, true, "mgr", "ppj");
        Przedmiot ppj = new Przedmiot(lan, lista);

        ppj.show();

    }

}
