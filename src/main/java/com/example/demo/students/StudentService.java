package com.example.demo.students;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1234,"John Cena",24, LocalDate.now(),"johncena@gmail.com"));
    }
}
