package org.latihan.java;

import org.latihan.java.dev.User;

public class UserApp {
    public static void main(String[] args) {
        User fauzan = new User();
        fauzan.setName("Fauzan Aditia Pamungkas");
        fauzan.setAge(19);
        fauzan.setAddress("Cibubur, Ciracas");
        System.out.println(fauzan);
    }
}
