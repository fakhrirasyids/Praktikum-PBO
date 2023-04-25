package praktikum5;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateWithLoop calculateWithLoop = new CalculateWithLoop();

        while (true) {
            System.out.println("==========================");

            System.out.println("1. Faktorial");
            System.out.println("2. Print Nomor dengan Loop");
            System.out.print("Masukkan pilihan : ");

            int menuChoice = scanner.nextInt();

            if (menuChoice == 1) {
                calculateWithLoop.factorial();
            } else if (menuChoice == 2) {
                calculateWithLoop.printNumLoop();
            }

            System.out.print("\n Input data lagi [Y/T] ? : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

class CalculateWithLoop {
    Scanner scanner = new Scanner(System.in);

    // Latihan 1
    void factorial() {
        System.out.print("\n Bilangan : ");

        int choice = scanner.nextInt();

        int total = 1;

        for (int i = 1; i <= choice; i++) {
            int totalTemp = total;
            total *= i;
            if (i != 1) {
                System.out.println(totalTemp + " x " + i + " = " + total);
            }
        }
    }

    // Latihan 2
    void printNumLoop() {

        System.out.print("\n Bilangan : ");

        int choice = scanner.nextInt();

        for (int i = 1; i <= choice; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("---------------------");

        System.out.print("Dipecah : ");

        int pecah = scanner.nextInt();

        for (int i = 1; i <= choice; i++) {
            System.out.print(i + " ");
            if (i % pecah == 0) {
                System.out.println();
            }
        }
    }
}
