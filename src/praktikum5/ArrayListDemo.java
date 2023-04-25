package praktikum5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        ArrayList<Integer> kurang = new ArrayList<>();
        ArrayList<Integer> kali = new ArrayList<>();
        ArrayList<Integer> bagi = new ArrayList<>();

        System.out.println("======================================");
        System.out.print("Masukkan jumlah data yang diinput : ");
        int arrSize = scanner.nextInt();

        System.out.println("Nilai 1");
        for (int i = 0; i < arrSize; i++) {
            nilai1.add(i);
            System.out.println("Index ke " + i + " = " + nilai1.get(i));
        }

        System.out.println("Nilai 2");
        for (int i = 0; i < arrSize; i++) {
            nilai2.add(i);
            System.out.println("Index ke " + i + " = " + nilai2.get(i));
        }

        System.out.println();
        for (int i = 0; i < arrSize; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
        }
        System.out.println("*** Hasil Jumlah Nilai 1 + Nilai 2 ***");
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Jumlah index ke " + i + " = " + jumlah.get(i));
        }

        System.out.println();
        for (int i = 0; i < arrSize; i++) {
            kurang.add(nilai1.get(i) - nilai2.get(i));
        }
        System.out.println("*** Hasil Kurang Nilai 1 - Nilai 2 ***");
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Kurang index ke " + i + " = " + kurang.get(i));
        }

        System.out.println();
        for (int i = 0; i < arrSize; i++) {
            kali.add(nilai1.get(i) * nilai2.get(i));
        }
        System.out.println("*** Hasil Kali Nilai 1 * Nilai 2 ***");
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Kali index ke " + i + " = " + kali.get(i));
        }

        System.out.println();
        for (int i = 0; i < arrSize; i++) {
            if (i == 0) {
                bagi.add(0);
            } else {
                bagi.add(nilai1.get(i) / nilai2.get(i));
            }
        }
        System.out.println("*** Hasil Bagi Nilai 1 / Nilai 2 ***");
        for (int i = 0; i < arrSize; i++) {
            if (i == 0) {
                System.out.println("Bagi index ke " + i + " = TIDAK DAPAT DIBAGI");
            } else {
                System.out.println("Bagi index ke " + i + " = " + bagi.get(i));
            }
        }
    }
}
