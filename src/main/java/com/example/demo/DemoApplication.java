package com.example.demo;

import com.example.demo.students.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class DemoApplication {


	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);









	}










}
