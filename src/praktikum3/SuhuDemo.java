package praktikum3;

public class SuhuDemo {

    public static void main(String[] args) {

        double suhuAwal = 100;

        Suhu suhu = new Suhu(suhuAwal);
        System.out.println("Suhu awal : " + suhuAwal);

        System.out.println("\nKonversi ke Kelvin : " + suhu.toKelvin());
        System.out.println("\nKonversi ke Fahrenheit : " + suhu.toFahrenheit());
        System.out.println("\nKonversi ke Rankine : " + suhu.toRankine());
        System.out.println("\nKonversi ke Delisle : " + suhu.toDelisle());
        System.out.println("\nKonversi ke Newton : " + suhu.toNewton());
        System.out.println("\nKonversi ke Reaumur : " + suhu.toReaumur());
        System.out.println("\nKonversi ke Romer : " + suhu.toRomer());
    }
}
