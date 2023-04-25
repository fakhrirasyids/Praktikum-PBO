package praktikum7;

import praktikum2.Mobil2;

public class Mobil2BMWDemo {
    public static void main(String[] args) {
        Mobil2BMW mobil2BMW = new Mobil2BMW();

        mobil2BMW.setNama("Avanza");
        mobil2BMW.hidupkanMobil();
        mobil2BMW.nontonTv();
        mobil2BMW.ubahGigi();
        mobil2BMW.matikanMobil();
    }
}

class Mobil2BMW extends Mobil2 {
    Mobil2BMW() {
    }

    void nontonTv() {
        System.out.println("TV Dihidupkan");
        System.out.println("TV Mencari Channel");
        System.out.println("TV Menampilkan gambar");
    }

    @Override
    public void hidupkanMobil() {
        super.hidupkanMobil();
    }

    @Override
    public void ubahGigi() {
        super.ubahGigi();
    }

    @Override
    public void matikanMobil() {
        super.matikanMobil();
    }
}