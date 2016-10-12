/**
 * Created by user on 09.10.2016.
 */
public class B implements A {

    public  B(int i) {
        System.out.println(i);
    }
    public  B(String b) {
        System.out.println(b);
    }

    public  B(int i, String b) {
        System.out.println(i+" "+b);
    }
    private int i=0;
    private String s;

    public void Bek(int i, String b) {
        System.out.println(i+" "+b);
    }

    @Override
    public void Hello() {
        System.out.println(integer + "Hello");
    }

    private int integer = 0;


    @Override
    public void KK() {
        System.out.println("BB");
    }


    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
