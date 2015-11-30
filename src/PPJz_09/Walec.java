package PPJz_09;

/**
 * Created by Artur Salamon on 2015-11-30.
 */
public class Walec {
    public double promien;
    public double wysokosc;

    public Walec(double promien, double wysokosc){
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show(){
        System.out.println("Pole powierzchni walca to:" + (promien*promien*3.14*2+2*3.14*promien*wysokosc));
        System.out.println("Objetosc walca to: " + promien*promien*3.14*wysokosc);

    }
}
