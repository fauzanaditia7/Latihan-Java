package org.latihan.java.application.uas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Nomor3 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Connection conn = DriverManager.getConnection("jdbc:sqlite:Fauzan.db");
        Statement st = conn.createStatement();

        System.out.println("                         DATA NILAI PEMPROGRAMAN 3");
        System.out.println("==============================================================================");
        System.out.print("            Masukkan kata kunci pencarian : ");
        String keyword = buffer.readLine();
        String query = "SELECT * FROM mahasiswa WHERE (NPM = '"+ keyword +"') OR (Nama LIKE '%" + keyword + "%')";
        ResultSet result = st.executeQuery(query);
        System.out.println("==============================================================================");
        System.out.println("Hasil Pencarian : " + keyword);
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("%-15s %-28s %-7s %-14s %-6s\n", "NPM", "Nama Mahasiswa", "Kelas", "Rata-rata", "Grade");
        System.out.println("------------------------------------------------------------------------------");

        while (result.next()) {
            float rata2 = result.getFloat("Rata_Rata");
            String grade = "E";
            if (rata2 >= 84.99) {
                grade = "A";
            } else if (rata2 >= 69.99) {
                grade = "B";
            } else if (rata2 >= 55.99) {
                grade = "C";
            } else if (rata2 >= 44.99) {
                grade = "D";
            }
            System.out.printf("%-15s %-28s %-10s %-13s %-3s\n",
                    result.getString("NPM"),
                    result.getString("Nama"),
                    result.getString("Kelas"),
                    rata2,
                    grade);
        }
        System.out.println("------------------------------------------------------------------------------");

    }
}

