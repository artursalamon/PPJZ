package PPJz_09;

/**
 * Created by Artur Salamon on 2015-11-30.
 */
public class Wyraz2 {
    public String a;
    public Wyraz2 b;
//
    public Wyraz2(String a){
        this.a = a;
        this.b =null;
    }

    public void setNastepnyWyraz(String x){
        this.b = new Wyraz2(x);

        while(this.b != null)
     //       this = this.b;
        this.b = new Wyraz2(x);



    }





    public void show(){
        System.out.print(a);
        if(this.b !=null)
            b.show();
    }
}
