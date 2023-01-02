package org.latihan.java.application;

import org.latihan.java.dev.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteApp {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:database.db");
        Statement st = conn.createStatement();
        String query = """
                CREATE TABLE IF NOT EXISTS user (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    name VARCHAR(50),
                    age INTEGER,
                    address VARCHAR(60)
                );
                """;
        st.executeUpdate(query);
        ResultSet result = st.executeQuery("SELECT * FROM user");
        while (result.next()) {
            User temp = new User();
            temp.setName(result.getString(2));
            temp.setAge(result.getInt(3));
            temp.setAddress(result.getString(4));
            System.out.println(temp);
        }
    }
}

