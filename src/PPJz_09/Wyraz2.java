package PPJz_09;

/**
 * Created by Artur Salamon on 2015-11-30.
 */
public class Wyraz2 {
    public String a;
    public Wyraz2 b;
// drugi comm
    // komenatdzą
    public Wyraz2(String a){
        this.a = a;
    }

    public void setNastepnyWyraz(String b){
        this.b = new Wyraz2(b);
    }

    public void show(){
        System.out.print(a);
        if(b!=null)
            b.show();
    }
}
