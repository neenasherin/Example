import java.io.FileInputStream;
import java.io.FileOutputStream;

class Car {

    public void displyCar() {
        System.out.println("Car");
    }
}
    class Benz extends Car{
        public void displyCar()
        {
            System.out.println("Benz");
        }
    }
class Volvo extends Car {
    public void displyCar() {
        System.out.println("Volvo");
    }
}
public class PolyExample {
    public static void main(String[] args){
        Volvo v= new Volvo();
        v.displyCar();
        String a="10";
        String b=String .valueOf(a);
        Integer.parseInt(a);

        try{
            FileInputStream fin=new FileInputStream("/Users/sherin/desktop/new.txt");
            FileOutputStream fin1=new FileOutputStream("/Users/sherin/desktop/new.txt",true);
            String bw="NEEEEEEEENaefre";
            byte bs[]=bw.getBytes();
            fin1.write(bs);
            int i=0;
            while((i=fin.read())!=-1) {
                System.out.print((char) i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
