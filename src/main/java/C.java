/**
 * Created by user on 09.10.2016.
 */
public class C implements A {
    private String a;
    private String kk;
    private int inn;

    @Override
    public void Hello() {
        System.out.println("Привет");
    }

    @Override
    public void KK() {
        System.out.println(inn+1);
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setB(String b) {
    }

    public void setKK(String KK) {
        kk = KK;
    }

    public String getKK() {
        return kk;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public int getInn() {
        return inn;
    }
}
