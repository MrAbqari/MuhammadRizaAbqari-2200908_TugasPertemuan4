package tugas.pkg4.pbo;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();

            boolean ribuan = cekRibuan(angka);

            if (ribuan) {
                System.out.println("Angka ke-" + i + " merupakan bilangan ribuan.");
            } else {
                System.out.println("Angka ke-" + i + " bukan bilangan ribuan.");
            }
        }
    }

    public static boolean cekRibuan(int angka) {
        return angka >= 1000 && angka < 9999;
    }
}
