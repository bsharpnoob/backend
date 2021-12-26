package com.example.demo.students;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public Student getStudents() {
        return new Student(1234,"John Cena",24, LocalDate.now(),"johncena@gmail.com");
    }
}
