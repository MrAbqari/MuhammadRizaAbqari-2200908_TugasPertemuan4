package tugas.pkg4.pbo;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        tampilkanPrimaKomposit(batasAwal, batasAkhir);
    }

    public static boolean cekPrima(int angka) {
        if (angka < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void tampilkanPrimaKomposit(int batasAwal, int batasAkhir) {
        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}