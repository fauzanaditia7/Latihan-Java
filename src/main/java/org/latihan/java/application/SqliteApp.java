package org.latihan.java.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteApp {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Connection conn = DriverManager.getConnection("jdbc:sqlite:Fauzan.db");
        Statement st = conn.createStatement();

        System.out.print("Masukkan kata kunci pencarian : ");
        String keyword = buffer.readLine();

        String query = "SELECT * FROM mahasiswa WHERE (NPM = '"+ keyword +"') OR (Nama LIKE '%" + keyword + "%')";
//        System.out.println(query);
        ResultSet result = st.executeQuery(query);
        System.out.println("NPM \t Nama Mahasiswa \t Kelas \t Rata - Rata");
        while (result.next()) {
            int rata2 = result.getInt("Rata_Rata");
            String grade;
            if (rata2 >= 85) {
                grade = "A";
            } else if (rata2 >= 70) {
                grade = "B";
            } else if (rata2 >= 56) {
                grade = "C";
            } else if (rata2 >= 45) {
                grade = "D";
            } else {
                grade = "E";
            }
            String info = result.getString("NPM") + " \t " + result.getString("Nama") + " \t "
                    + result.getString("Kelas") + " \t " + result.getString("Rata_Rata") + " \t " + grade;
            System.out.println(info);
        }

    }
}

