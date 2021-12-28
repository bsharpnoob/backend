package com.example.demo.students;


import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping(path = "/api/create", method = RequestMethod.POST)
public class CreateStudentController {

    CreateStudentService createStudentService = new CreateStudentService();

    @PostMapping
    public void createUser(@RequestBody Student studentInfo) throws SQLException { createStudentService.AddStudent(studentInfo);}


}
