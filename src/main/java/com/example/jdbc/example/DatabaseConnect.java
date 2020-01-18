package com.example.jdbc.example;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DatabaseConnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","example_user","example01");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");
    }

}
