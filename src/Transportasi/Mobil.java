package Transportasi;

public class Mobil {
    private String nama;
    private int roda = 4;
    private int body = 1;

    static int mesin = 1;

    public Mobil() {
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

    public void hidupkanMobil() {
        System.out.println("\nHidupkan Mobil : " + this.nama);
    }

    public void matikanMobil() {
        System.out.println("Matikan Mobil : " + this.nama);
    }

    public void ubahGigi() {
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
