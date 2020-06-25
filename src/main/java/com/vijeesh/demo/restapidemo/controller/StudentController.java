package com.vijeesh.demo.restapidemo.controller;

import com.vijeesh.demo.restapidemo.model.StudentDTO;
import com.vijeesh.demo.restapidemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myapp/api")
public class StudentController {

    @Autowired
    StudentService service;

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    @GetMapping
    //@ResponseBody
    public String gerStudent (){
        return "Hello";
    }

    @GetMapping("/students")
    public List<StudentDTO> allStudents (){
        return service.getAllStudent();
    }

}
