package praktikum3;

public class SuhuDemo {
    public static void main(String[] args) {
        double suhuAwal = 100;

        Suhu suhu = new Suhu(suhuAwal);
        System.out.println("Suhu awal : " + suhuAwal);

        System.out.println("\nKonversi ke Kelvin : " + suhu.toKelvin());
        System.out.println("Konversi ke Fahrenheit : " + suhu.toFahrenheit());
        System.out.println("Konversi ke Rankine : " + suhu.toRankine());
        System.out.println("Konversi ke Delisle : " + suhu.toDelisle());
        System.out.println("Konversi ke Newton : " + suhu.toNewton());
        System.out.println("Konversi ke Reaumur : " + suhu.toReaumur());
        System.out.println("Konversi ke Romer : " + suhu.toRomer());
    }
}
