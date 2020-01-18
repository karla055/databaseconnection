package com.example.jdbc.example;

import java.sql.*;
import java.sql.Connection;

public class PostgreSqlExample {

    public static void main(String[] args)  {
        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5431/postgres","postgres","root")){
            System.out.println("java jdbc postgressql example");
            System.out.println("Connected to PostGresSql database ");
            Statement statement = connection.createStatement();
            System.out.println("Reading car records .....");
            System.out.printf("%-30.30s  %-30.30s%n","role_id","role_name");

            ResultSet resultSet = statement.executeQuery("select * from public.role");
            while (resultSet.next()){
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("role_id"), resultSet.getString("role_name"));
            }

        }catch (SQLException sqlException){
            System.out.println("Connection failed");
            sqlException.printStackTrace();
        }

    }

}
