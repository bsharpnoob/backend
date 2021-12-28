package com.example.demo.students;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentService {

    DatabaseConnection dbConnection = new DatabaseConnection();
    Connection connection = dbConnection.getConnection();


    public void AddStudent(Student studentInfo) throws SQLException {
        String query = "insert into student(id,name) values(?,?)";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1,studentInfo.getId());
        statement.setString(2,studentInfo.getName());
        statement.executeUpdate();



        //Statement statement = connection.createStatement();
        //statement.executeUpdate(query);
    }
}
