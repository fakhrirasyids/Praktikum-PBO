package praktikum7;

public class Karyawan {
    public double tunjanganAnak;
    public Karyawan(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }
}

class KaryawanTetap extends Karyawan {
    public double gajiPokok;

    KaryawanTetap(double gajiPokok, double tunjanganAnak) {
        super(tunjanganAnak);
        this.gajiPokok = gajiPokok;
    }

    double menghitungTotalGaji() {
        return gajiPokok + super.tunjanganAnak;
    }
}

class KaryawanKontrak extends Karyawan {
    public double upahHarian;
    public int jumlahHariMasuk;

    KaryawanKontrak(double upahHarian, int jumlahHariMasuk, double tunjanganAnak) {
        super(tunjanganAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    double menghitungTotalGaji() {
        return (upahHarian * jumlahHariMasuk) + super.tunjanganAnak;
    }
}