package praktikum4;

import java.util.Scanner;

public class SecondConversionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==========================");

            double detik;

            System.out.print("Detik : ");
            detik = scanner.nextDouble();

            SecondConversion secondConversion = new SecondConversion(detik);
            secondConversion.printConversion();

            System.out.print("\n Input data lagi [Y/T] ? : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

class SecondConversion {
    private double second;

    SecondConversion(double second) {
        this.second = second;
    }

    void printConversion() {
        double hari = this.second / 86400;
        double jamTemp = (this.second % 86400);
        double jam = jamTemp / 3600;
        double menitTemp = (jamTemp % 3600);
        double menit = menitTemp / 60;
        double detik = menitTemp % 60;

        System.out.println("Hari     : " + Math.round(hari));
        System.out.println("Jam      : " + Math.round(jam));
        System.out.println("Menit    : " + Math.round(menit));
        System.out.println("Detik    : " + Math.round(detik));
    }
}
