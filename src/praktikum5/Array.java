package praktikum5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateWithArray calculateWithArray = new CalculateWithArray();

        while (true) {
            System.out.println("==================================");

            System.out.println("1. [Latihan 1] Input Output Array");
            System.out.println("2. [Latihan 2] Nilai Mahasiswa dengan Array");
            System.out.println("3. [Latihan 3] Sorting");
            System.out.println("4. [Latihan 4] Perkalian Matrix");
            System.out.print("Masukkan pilihan : ");

            int menuChoice = scanner.nextInt();

            if (menuChoice == 1) {
                calculateWithArray.iOwithArray();
            } else if (menuChoice == 2) {
                calculateWithArray.dataMahasiswa();
            } else if (menuChoice == 3) {
                calculateWithArray.sortingWithJava();
            } else if (menuChoice == 4) {
                calculateWithArray.matrixCalculate();
            }

            System.out.print("\n Input data lagi [Y/T] ? : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

class CalculateWithArray {
    int[] x;
    Scanner scanner = new Scanner(System.in);

    void iOwithArray() {
        System.out.print("\nMasukkan Jumlah Data : ");
        int arraySize = scanner.nextInt();

        x = new int[arraySize];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            int arrTemp = scanner.nextInt();
            x[i] = arrTemp;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("Hasil nilai [" + i + "]=" + x[i]);
        }
    }

    void dataMahasiswa() {
        System.out.print("\nMasukkan Jumlah Mahasiswa : ");
        int arraySize = scanner.nextInt();

        NewNilai[] newNilais = new NewNilai[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("\n---------- Data ke-" + (i + 1) + " ----------");
            System.out.print("\n Masukkan NIM : ");
            String nim = scanner.next();
            System.out.print(" Masukkan Nama : ");
            String nama = scanner.next();
            System.out.print(" Masukkan Jumlah Tugas : ");
            int tugasSize = scanner.nextInt();

            double[] nilaiTugas = new double[tugasSize];

            for (int j = 0; j < tugasSize; j++) {
                System.out.print(" Masukkan Nilai Tugas ke-" + (j + 1) + ": ");
                nilaiTugas[j] = scanner.nextDouble();
            }
            System.out.print(" Masukkan Nilai UTS : ");
            double nilaiUts = scanner.nextDouble();
            System.out.print(" Masukkan Nilai UAS : ");
            double nilaiUas = scanner.nextDouble();

            newNilais[i] = new NewNilai();
            newNilais[i].setData(
                    nim,
                    nama,
                    nilaiUts,
                    nilaiTugas,
                    nilaiUas
            );
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println("\n------------ Data Mahasiswa ke-" + (i + 1) + " --------------");
            newNilais[i].hitungNilai();
            newNilais[i].cetakNilai();
        }
    }

    void sortingWithJava() {
        System.out.print("\nMasukkan Banyaknya Data : ");
        int arraySize = scanner.nextInt();
        int[] numData = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print(" Masukkan Data ke-" + (i + 1) + ": ");
            numData[i] = scanner.nextInt();
        }

        System.out.print("\n***Pilihan Sorting*** ");
        System.out.println("\n1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Merge Sort");
        System.out.print("Masukkan pilihan : ");
        int menuChoice = scanner.nextInt();

        for (int num : numData) {
            System.out.print(num + " ");
        }
        System.out.println();

        if (menuChoice == 1) {
            SortingWithJava.bubbleSort(numData);
        } else if (menuChoice == 2) {
            SortingWithJava.quickSort(numData, 0, arraySize - 1);
        } else if (menuChoice == 3) {
            SortingWithJava.insertionSort(numData);
        } else if (menuChoice == 4) {
            SortingWithJava.selectionSort(numData);
        } else if (menuChoice == 5) {
            SortingWithJava.mergeSort(numData, numData.length);
        }
    }

    void matrixCalculate() {
        System.out.print("\nInput Baris Matrix A : ");
        int rowA = scanner.nextInt();
        System.out.print("Input Kolom Matrix A : ");
        int columnA = scanner.nextInt();
        int[][] matrixA = new int[rowA][columnA];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.print("Input elemen matrix A [" + i + "," + j + "] = ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nInput Baris Matrix B : ");
        int rowB = scanner.nextInt();
        System.out.print("Input Kolom Matrix B : ");
        int columnB = scanner.nextInt();
        int[][] matrixB = new int[rowB][columnB];

        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.print("Input elemen matrix B [" + i + "," + j + "] = ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\n***Pilihan Kalkulasi*** ");
        System.out.println("\n1. Penjumlahan");
        System.out.println("2. Transpose dari Penjumlahan");
        System.out.println("3. Perkalian");
        System.out.print("Masukkan pilihan : ");
        int menuChoice = scanner.nextInt();

        int[][] addMatrixTotal;

        if (menuChoice == 1) {
            if (rowA != rowB || columnA != columnB) {
                System.out.println("Matrix tidak dapat dijumlahkan!");
            } else {
                addMatrixTotal = calculateAddMatrix(matrixA, matrixB);
                System.out.println("Hasil penjumlahan:");

                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {
                        System.out.print(addMatrixTotal[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } else if (menuChoice == 2) {
            if (rowA != rowB || columnA != columnB) {
                System.out.println("Matrix tidak dapat di Transverse!");
            } else {
                addMatrixTotal = calculateAddMatrix(matrixA, matrixB);
                int[][] transposedMatrix = new int[addMatrixTotal.length][addMatrixTotal[1].length];

                System.out.println("Hasil Transpose :");

                for (int i = 0; i < addMatrixTotal.length; i++) {
                    for (int j = 0; j < addMatrixTotal[1].length; j++) {
                        transposedMatrix[i][j] = addMatrixTotal[j][i];
                    }
                }

                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {
                        System.out.print(transposedMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } else if (menuChoice == 3) {
            if (rowB != columnA) {
                System.out.println("\n Perkalian tidak memungkinkan!");
            } else {
                int[][] multipliedMatrix = new int[rowA][columnB];

                System.out.println("Hasil Perkalian :");

                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnB; j++) {
                        for (int k = 0; k < rowB; k++)
                            multipliedMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }

                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {
                        System.out.print(multipliedMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    int[][] calculateAddMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] addMatrixTotal = new int[matrixA.length][matrixA[1].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[1].length; j++) {
                addMatrixTotal[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return addMatrixTotal;
    }
}

class NewNilai {
    private String nim;
    private String nama;
    private double nilaiUts;
    private double[] nilaiTugas;
    private double nilaiUas;
    private double pNilaiUts;
    private double pNilaiTugas;
    private double pNilaiUas;
    private double pNilaiAkhir;
    private char pNilaiHuruf;


    void setData(String nim, String nama, double nilaiUts, double[] nilaiTugas, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }

    void hitungNilai() {
        double nilaiTugasTemp = 0;
        for (double nilai : this.nilaiTugas) {
            nilaiTugasTemp += nilai;
        }
        pNilaiTugas = (nilaiTugasTemp / this.nilaiTugas.length) * 0.2;
        pNilaiUts = nilaiUts * 0.35;
        pNilaiUas = nilaiUas * 0.45;
        this.pNilaiAkhir = this.pNilaiTugas + this.pNilaiUts + this.pNilaiUas;
        this.pNilaiHuruf = this.getNilHuruf(this.pNilaiAkhir);
    }

    void daftarNilai() {
        for (int i = 0; i < this.nilaiTugas.length; i++) {
            System.out.println("Nilai Tugas ke-" + (i + 1) + " : " + this.nilaiTugas[i]);
        }
        System.out.println("Nilai Uts    : " + this.nilaiUts + " 35%    : " + this.pNilaiUts);
        System.out.println("Nilai Uas    : " + this.nilaiUas + " 45%    : " + this.pNilaiUas);
        System.out.println("Nilai Akhir  : " + this.pNilaiAkhir);
        System.out.println("Nilai Huruf  : " + this.pNilaiHuruf);
        System.out.println("Nilai Uas    : " + this.getPredikat(this.pNilaiHuruf));
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
        daftarNilai();
    }
}

class SortingWithJava {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);

            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
