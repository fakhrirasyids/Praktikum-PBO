package praktikum2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(
                "A11.2021.13701",
                "Fakhri Rasyid Saputro",
                90.0,
                80.0,
                87.5
        );

        mahasiswa.hitungNilai();
        mahasiswa.cetakNilai();
    }
}

class Mahasiswa {
    private final String nim;
    private final String nama;
    private final double nilaiUts;
    private final double nilaiTugas;
    private final double nilaiUas;
    private double pNilaiUts;
    private double pNilaiTugas;
    private double pNilaiUas;

    Mahasiswa(String nim, String nama, double nilaiUts, double nilaiTugas, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }

    void hitungNilai() {
        pNilaiUts = nilaiUts * 0.8;
        pNilaiTugas = nilaiTugas * 0.65;
        pNilaiUas = nilaiUas * 0.55;
    }

    void cetakNilai() {
        System.out.println("\nNim          : " + this.nim);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Nilai Tugas  : " + this.nilaiTugas + " 20%    : " + this.pNilaiTugas);
        System.out.println("Nilai Uts    : " + this.nilaiUts + " 35%    : " + this.pNilaiUts);
        System.out.println("Nilai Uas    : " + this.nilaiUas + " 45%    : " + this.pNilaiUas);
    }
}