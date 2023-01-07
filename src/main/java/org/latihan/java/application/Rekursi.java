package org.latihan.java.application;

public class Rekursi {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hasil dari rekursi(%s) adalah %s%n", i, rekursi(i));
        }

//        Hasil dari rekursi(0) adalah 3
//        Hasil dari rekursi(1) adalah 8
//        Hasil dari rekursi(2) adalah 18
//        Hasil dari rekursi(3) adalah 38
//        Hasil dari rekursi(4) adalah 78
//        Hasil dari rekursi(5) adalah 158
//        Hasil dari rekursi(6) adalah 318
//        Hasil dari rekursi(7) adalah 638
//        Hasil dari rekursi(8) adalah 1278
//        Hasil dari rekursi(9) adalah 2558
    }

    public static int rekursi(int n) {
        if (n == 0) return 3;
        return 2 * rekursi(n - 1) + 2;
    }
}
