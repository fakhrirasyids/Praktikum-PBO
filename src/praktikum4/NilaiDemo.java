package praktikum4;

import java.util.Scanner;

public class NilaiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==========================");
            System.out.print("\n Masukkan NIM : ");
            String nim = scanner.next();
            System.out.print(" Masukkan Nama : ");
            String nama = scanner.next();
            System.out.print(" Masukkan Nilai Tugas : ");
            double nilaiTugas = scanner.nextDouble();
            System.out.print(" Masukkan Nilai UTS : ");
            double nilaiUts = scanner.nextDouble();
            System.out.print(" Masukkan Nilai UAS : ");
            double nilaiUas = scanner.nextDouble();

            Nilai nilai = new Nilai(
                    nim,
                    nama,
                    nilaiUts,
                    nilaiTugas,
                    nilaiUas
            );

            nilai.hitungNilai();
            nilai.cetakNilai();

            System.out.print("\n Input data lagi [Y/T] ? : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

class Nilai {
    private String nim;
    private String nama;
    private double nilaiUts;
    private double nilaiTugas;
    private double nilaiUas;
    private double pNilaiUts;
    private double pNilaiTugas;
    private double pNilaiUas;
    private double pNilaiAkhir;
    private char pNilaiHuruf;

    Nilai(String nim, String nama, double nilaiUts, double nilaiTugas, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }

    void hitungNilai() {
        pNilaiTugas = nilaiTugas * 0.2;
        pNilaiUts = nilaiUts * 0.35;
        pNilaiUas = nilaiUas * 0.45;
        this.pNilaiAkhir = this.pNilaiTugas + this.pNilaiUts + this.pNilaiUas;
        this.pNilaiHuruf = this.getNilHuruf(this.pNilaiAkhir);
    }

    char getNilHuruf(double nilai) {
        char nHuruf;
        if (nilai >= 85)
            nHuruf = 'A';
        else if (nilai >= 70)
            nHuruf = 'B';
        else if (nilai >= 60)
            nHuruf = 'C';
        else if (nilai >= 40)
            nHuruf = 'D';
        else
            nHuruf = 'E';
        return nHuruf;
    }

    String getPredikat(char huruf) {

        return switch (huruf) {
            case 'A' -> "Apik";
            case 'B' -> "Baik";
            case 'C' -> "Cukup";
            case 'D' -> "Dablek";
            default -> "Elek";
        };
    }

    void cetakNilai() {


        System.out.println("\nNim          : " + this.nim);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Nilai Tugas  : " + this.nilaiTugas + " 20%    : " + this.pNilaiTugas);
        System.out.println("Nilai Uts    : " + this.nilaiUts + " 35%    : " + this.pNilaiUts);
        System.out.println("Nilai Uas    : " + this.nilaiUas + " 45%    : " + this.pNilaiUas);
        System.out.println("Nilai Akhir  : " + this.pNilaiAkhir);
        System.out.println("Nilai Huruf  : " + this.pNilaiHuruf);
        System.out.println("Nilai Uas    : " + this.getPredikat(this.pNilaiHuruf));
    }
}

