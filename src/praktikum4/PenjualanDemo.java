package praktikum4;

import java.util.Scanner;

public class PenjualanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==========================");
            System.out.print("\n Masukkan Kode   : ");
            String kode = scanner.next();
            System.out.print(" Masukkan Nama   : ");
            String nama = scanner.next();
            System.out.print(" Masukkan Harga  : ");
            float harga = scanner.nextFloat();
            System.out.print(" Masukkan Jumlah : ");
            int jumlah = scanner.nextInt();

            Penjualan penjualan = new Penjualan();
            penjualan.setData(kode, nama, harga, jumlah);

            penjualan.cetakNota();

            System.out.print("\n Input data lagi [Y/T] ? : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    private float totalPembelian;
    private String bonus;

    void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    void getTotalPembelian() {
        this.totalPembelian = this.harga * Float.parseFloat(String.valueOf(this.jumlah));
    }

    void getBonus() {
        if (this.totalPembelian >= 500000 && this.jumlah > 5) {
            this.bonus = "Setrika";
        } else if (this.totalPembelian >= 100000 && this.jumlah > 3) {
            this.bonus = "Payung";
        } else if (this.totalPembelian >= 50000 && this.jumlah > 2) {
            this.bonus = "Ballpoint";
        } else {
            this.bonus = "-";
        }
    }

    void cetakNota() {
        getTotalPembelian();
        getBonus();

        System.out.println("\n================  NOTA  ================");
        System.out.println(" Kode   : " + this.kode);
        System.out.println(" Nama   : " + this.nama);
        System.out.println(" Harga  : Rp " + String.format("%,.2f", this.harga));
        System.out.println(" Jumlah : " + this.jumlah);
        System.out.println("----------------------------------------");
        System.out.println(" Total  : Rp " + String.format("%,.2f", this.totalPembelian));
        System.out.println(" Bonus  : " + this.bonus);
        System.out.println("========================================");
    }
}
