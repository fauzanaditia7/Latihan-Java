package org.latihan.java;

import org.latihan.java.dev.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserApp_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah user : ");
        int jumlahUser = Integer.parseInt(buffer.readLine());

        ArrayList<User> semuaUser = new ArrayList<>();

        for (int i = 0; i < jumlahUser; i++) {
            User temp = new User();
            System.out.println("User ke - " + (i + 1));
            System.out.print("Masukkan nama : ");
            temp.setName(buffer.readLine());
            System.out.print("Masukkan umur : ");
            temp.setAge(Integer.parseInt(buffer.readLine()));
            System.out.print("Masukkan alamat : ");
            temp.setAddress(buffer.readLine());
            System.out.println();
            semuaUser.add(temp);
        }

        for (User user : semuaUser) {
            if (user.getHobbies().size() == 0) {
                user.addHobi("Test");
            }
        }

        System.out.println(semuaUser.get(0).getHobbies());

    }
}
