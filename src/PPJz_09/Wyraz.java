package PPJz_09;

/**
 * Created by Artur Salamon on 2015-11-30.
 */
public class Wyraz {
    public String a;
    public int b;

    public Wyraz(){
        this.a="";
        this.b=0;
    }

    public Wyraz(String a) {
        this.a = a;
    }

    public void dodajZnak(char znak){
        a+=znak;
        b++;
    }

    public String toString(){
        return a;
    }

    public int length(){
        return a.length();
    }
}
