package org.latihan.java.application;

import org.latihan.java.utils.PrettyTable;

public class PrettyTableApp {
    public static void main(String[] args) {
        PrettyTable table = new PrettyTable("Firstname", "Lastname", "Email", "Phone");
        table.addRow("John", "Doe", "johndoe@nothing.com", "+2137999999");
        table.addRow("Jane", "Doe", "janedoe@nothin.com", "+2137999999");
        System.out.println(table);
    }
}
