package org.latihan.java.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteTestApp {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Connection conn = DriverManager.getConnection("jdbc:sqlite:Fauzan.db");
        Statement st = conn.createStatement();
        System.out.print("Masukkan kata kunci pencarian : ");
        String keyword = buffer.readLine();
        String query = "SELECT * FROM mahasiswa WHERE (NPM = '"+ keyword +"') OR (Nama LIKE '%" + keyword + "%')";
        ResultSet result = st.executeQuery(query);


        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("| %-3s| %-14s| %-30s| %-5s | %-12s| %-6s|\n", "No", "NPM", "Nama Mahasiswa", "Kelas", "Rata - Rata", "Grade");
        System.out.println("------------------------------------------------------------------------------------");
        int i = 0;
        while (result.next()) {
            i += 1;
            float rata2 = result.getFloat("Rata_Rata");
            String grade;
            if (rata2 >= 84.99) {
                grade = "A";
            } else if (rata2 >= 69.99) {
                grade = "B";
            } else if (rata2 >= 55.99) {
                grade = "C";
            } else if (rata2 >= 44.99) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.printf("| %-3s| %-14s| %-30s| %-5s | %-12s| %-6s|\n",
                    i,
                    result.getString("NPM"),
                    result.getString("Nama"),
                    result.getString("Kelas"),
                    rata2,
                    grade);
        }
        System.out.println("------------------------------------------------------------------------------------");

    }
}

