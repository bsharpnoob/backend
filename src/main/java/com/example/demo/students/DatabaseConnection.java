package com.example.demo.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

    Connection connection;

    public void Connect()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","test1234");




        }catch(Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Connection getConnection()
    {
        Connect();
        return connection;
    }
}
