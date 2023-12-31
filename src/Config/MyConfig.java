/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    protected static Connection connection;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;

    protected static void connection() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Data Base Connected Succes");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
