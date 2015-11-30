package PPJz_09;

/**
 * Created by Artur Salamon on 2015-11-30.
 */
public class Kwadrat {
    public double bok;

    public Kwadrat(){

    }

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public void showKwadrat(){
        System.out.println("Pole: " + bok*bok);
        System.out.println("Objetosc: " + bok*bok*bok);
    }

    public Walec przygotujWalec(){
        Walec walec = new Walec(bok/2, bok);
        return walec;
    }
}
