package org.latihan.java.application;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Digit terakhir NPM Anda : ");
        int npm = abc.nextInt();
        System.out.println(npm + "\t" + pagi(npm));
    }

    static int pagi(int b) {
        if (b == 0) return 3;
        else return 2 * pagi(b - 1) - 1;
    }
}
