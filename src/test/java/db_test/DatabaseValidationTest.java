package db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Author: Hardik Shah
 * Demo class to showcase Database Testing capabilities using JDBC.
 */
public class DatabaseValidationTest {

    public static void main(String[] args) {
        
        // SANITIZED: Replaced internal Phoenix server with a generic placeholder
        String dbUrl = "jdbc:phoenix:your-db-hostname:2181:/hbase-unsecure";
        String query = "SELECT * FROM demo_table LIMIT 10";

        // Professional practice: Use try-with-resources for automatic closing of connections
        try (Connection con = DriverManager.getConnection(dbUrl);
             PreparedStatement statement = con.prepareStatement(query);
             ResultSet rset = statement.executeQuery()) {

            System.out.println("Connected to Database. Fetching results...");

            while (rset.next()) {
                // SANITIZED: Generic column names
                System.out.printf("Row ID: [%s] | Status: [%s]\n",
                    rset.getString("ID"),
                    rset.getString("STATUS")
                );
            }
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}
