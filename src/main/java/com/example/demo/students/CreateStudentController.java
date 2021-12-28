package com.example.demo.students;


import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/create", method = RequestMethod.POST)
public class CreateStudentController {

    CreateStudentService createStudentService = new CreateStudentService();

    @PostMapping
    public String createUser()
    {return createStudentService.AddStudent();}


}
