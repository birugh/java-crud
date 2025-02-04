package app.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *  @author biru
 */

public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/db_jcrud";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
            return null;
        }
    }
}
