package PPJz_10;

/**
 * Created by Artur Salamon on 2015-12-03.
 */
public class Zadanie1 {

    private int liczba;
    private double liczbaDouble;
    private String napis;

    public Zadanie1() {
        this.liczba = 123;
        this.liczbaDouble = 4.5;
        this.napis = "Artur";
    }

    public Zadanie1(int liczba, double liczbaDouble, String napis) {
        this.liczba = liczba;
        this.liczbaDouble = liczbaDouble;
        this.napis = napis;
    }

    public Zadanie1(Zadanie1 zmienna){
        this.liczba = zmienna.liczba;
        this.liczbaDouble = zmienna.liczbaDouble;
        this.napis = zmienna.napis;
    }

    public void show(){
        System.out.println("liczba: " + this.liczba);
        System.out.println("liczbaDouble: " + this.liczbaDouble);
        System.out.println("napis:" + this.napis);
    }

    public boolean equals(Zadanie1 zmienna){
        if(
                zmienna.liczba == this.liczba &&
                zmienna.liczbaDouble == this.liczbaDouble &&
                zmienna.napis.equals(this.napis)

                )
            return true;
        else
            return false;

    }

    public String toString(){
        return new String(this.liczba+" "+this.liczbaDouble+" "+this.napis);
    }


}
