package org.latihan.java.application;

import org.latihan.java.oop.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserApp {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<User> dataUser = new ArrayList<>();

        System.out.print("Masukkan jumlah user : ");
        int jumlahUser = Integer.parseInt(input.readLine());
        for (int i = 0; i < jumlahUser; i++) {
            System.out.printf("User ke - %s\n", i + 1);
            User user = new User();
            System.out.print("Masukkan nama : ");
            user.setName(input.readLine());
            System.out.print("Masukkan umur : ");
            user.setAge(Integer.parseInt(input.readLine()));
            System.out.print("Masukkan alamat : ");
            user.setAddress(input.readLine());
            System.out.println();
            dataUser.add(user);
        }
        System.out.printf("%-28s %-8s %-20s\n", "Nama", "Umur", "Alamat");
        for (User user : dataUser) {
            System.out.printf("%-28s %-8s %-20s\n", user.getName(), user.getAge(), user.getAddress());
        }
    }
}
