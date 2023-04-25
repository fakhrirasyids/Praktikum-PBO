package praktikum3;

public class TestStatic1 {
    int a = 10;
    static int b = 2;
    protected int c = 30;
    public int d = 40;
    private int e = 50;

    void satu() {
        dua();
        System.out.println("satu.............");
        System.out.println("satu.............a : " + a);
        System.out.println("satu.............b : " + b);
        System.out.println("satu.............c : " + c);
        System.out.println("satu.............d : " + d);
        System.out.println("satu.............e : " + e);
    }

    static void dua() {
        System.out.println("dua.........." + b);
    }

    public static void main(String[] args) {
        dua();
    }
}
