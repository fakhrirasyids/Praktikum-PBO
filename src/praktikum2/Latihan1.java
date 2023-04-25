package praktikum2;

public class Latihan1 {
    public static void main(String[] args) {
        Mobil2 avanza = new Mobil2();
        Mobil2 xenia = new Mobil2();
        avanza.setNama("Avanza Silver");
        avanza.hidupkanMobil();
        avanza.ubahGigi();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda Avanza  : " + avanza.getRoda());
        System.out.println("Roda Xenia   : " + xenia.getRoda());
        System.out.println("Mesin Avanza : " + avanza.mesin);
        System.out.println("Mesin Xenia  : " + avanza.mesin);
        avanza.setRoda(5);
        System.out.println("Roda Avanza  : " + avanza.getRoda());
        System.out.println("Roda Xenia   : " + xenia.getRoda());
        Mobil2.mesin = 9;
        System.out.println("Mesin Avanza : " + avanza.mesin);
        System.out.println("Mesin Xenia  : " + xenia.mesin);
        System.out.println("Mesin Avanza : " + avanza.mesin);
        System.out.println("Mesin Xenia  : " + xenia.mesin);
        avanza.matikanMobil();
    }
}

class Mobil2 {

    private String nama;
    private int roda = 4;
    private int body = 1;

    static int mesin = 1;

    Mobil2() {
    }

    void maju() {
        System.out.println("Maju....");
    }

    void mundur() {
        System.out.println("Mundur....");
    }

    void belok() {
        System.out.println("Belok....");
    }

    void hidupkanMobil() {
        System.out.println("\nHidupkan Mobil : " + this.nama);
    }

    void matikanMobil() {
        System.out.println("Matikan Mobil : " + this.nama);
    }

    void ubahGigi() {
        System.out.println("Ubah Gigi Mobil : " + this.nama);
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getRoda() {
        return roda;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getBody() {
        return body;
    }
}
