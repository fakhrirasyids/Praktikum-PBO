package praktikum5;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> queueList = new ArrayList<>();

        while (true) {
            System.out.println("Queue Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");

            System.out.print("Your Choice : ");

            int menuChoice = scanner.nextInt();

            if (menuChoice == 1) {
                System.out.print(" Tambahkan Angka : ");
                int num = scanner.nextInt();
                queueList.add(num);
            } else if (menuChoice == 2) {
                if (queueList.isEmpty()) {
                    System.out.println("Queue masih Kosong!");
                } else {
                    int firstQueueTemp = queueList.get(0);
                    queueList.remove(0);
                    System.out.println("Berhasil menghapus data pertama = " + firstQueueTemp + "!");
                }
            } else if (menuChoice == 3) {
                if (queueList.isEmpty()) {
                    System.out.println("Queue masih Kosong!");
                } else {
                    int ptr = 1;
                    System.out.println();
                    for (int num : queueList) {
                        System.out.println("Data ke-" + ptr + " : " + num);
                    }
                }
            } else if (menuChoice == 4) {
                if (queueList.isEmpty()) {
                    System.out.println("Data masih Kosong!");
                } else {
                    System.out.println("Data tidak Kosong!");
                }
            } else if (menuChoice == 5) {
                if (queueList.isEmpty()) {
                    System.out.println("Data masih Kosong!");
                } else {
                    System.out.println("Data full!");
                }
            } else if (menuChoice == 6) {
                System.out.println("Size = " + queueList.size());
            }

            System.out.print("\nDo you want to continue (Type y or n) : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
