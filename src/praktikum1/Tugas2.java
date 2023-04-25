package praktikum1;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("\n*******Fakhri Rasyid Saputro / A11.2021.13701/ A11.442U*******\n");

        Rectangle rectangle;
        Segitiga segitiga;
        Lingkaran lingkaran;
        Kubus kubus;

        System.out.println("===== Persegi =====");

        Double panjang = 12.0;
        Double lebar = 14.0;
        rectangle = new Rectangle(panjang, lebar);

        System.out.println("Panjang : " + panjang + "\nLebar : " + lebar);
        System.out.println("Keliling : " + rectangle.hitungKeliling());
        System.out.println("Luas : " + rectangle.hitungLuas() + "\n");

        System.out.println("===== Segitiga =====");

        Double alas = 6.0;
        Double tinggi = 6.0;
        Double sisi = 3.0;
        segitiga = new Segitiga(alas, tinggi);

        System.out.println("Alas : " + alas + "\nTinggi : " + tinggi + "\nSisi : " + sisi);
        System.out.println("Keliling : " + segitiga.hitungKeliling(sisi, sisi, sisi));
        System.out.println("Luas : " + segitiga.hitungLuas() + "\n");

        System.out.println("===== Lingkaran =====");

        Double jari_jari = 7.0;
        lingkaran = new Lingkaran(jari_jari);

        System.out.println("Jari-Jari : " + jari_jari);
        System.out.println("Keliling : " + lingkaran.hitungKeliling());
        System.out.println("Luas : " + lingkaran.hitungLuas() + "\n");

        System.out.println("===== Kubus =====");

        Double sisiKubus = 12.0;
        kubus = new Kubus(sisiKubus);

        System.out.println("Sisi Kubus : " + sisiKubus);
        System.out.println("Luas Selimut : " + kubus.hitungLuasSelimut());
        System.out.println("Volume : " + kubus.hitungVolume() + "\n");
    }
}

class Rectangle {
    private Double panjang;
    private Double lebar;
    private Double hasil;

    Rectangle(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Double hitungLuas() {
        return hasil = panjang * lebar;
    }

    public Double hitungKeliling() {
        return hasil = 2 * (panjang + lebar);
    }
}

class Segitiga {
    private Double alas;
    private Double tinggi;
    private Double hasil;

    Segitiga(Double alas, Double tinggi) {
        this.alas = tinggi;
        this.tinggi = tinggi;
    }

    public Double hitungLuas() {
        return hasil = (alas * tinggi) / 2;
    }

    public Double hitungKeliling(Double A, Double B, Double C) {
        return hasil = A + B + C;
    }
}

class Lingkaran {
    private Double jari_jari;
    private Double hasil;

    Lingkaran(Double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public Double hitungLuas() {
        return hasil = 3.14 * (jari_jari * jari_jari);
    }

    public Double hitungKeliling() {
        return hasil = 3.14 * (2 * jari_jari);
    }
}

class Kubus {
    private Double sisi;
    private Double hasil;

    Kubus(Double sisi) {
        this.sisi = sisi;
    }

    public Double hitungVolume() {
        return hasil = sisi * sisi * sisi;
    }

    public Double hitungLuasSelimut() {
        return hasil = 6 * (sisi * sisi);
    }
}