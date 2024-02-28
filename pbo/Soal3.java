package tugas.pkg4.pbo;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (1-1000): ");
        int N = scanner.nextInt();

        cetakPola(N);
    }

    public static void cetakPola(int N) {
        if (N < 1 || N > 1000) {
            System.out.println("Nilai N tidak valid.");
            return;
        }

        System.out.println("Output:");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}