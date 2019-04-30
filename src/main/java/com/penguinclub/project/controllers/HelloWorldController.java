package com.penguinclub.project.controllers;

import com.penguinclub.project.models.Student;
import com.penguinclub.project.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.apache.log4j.Logger;

import java.util.List;

@RestController
public class HelloWorldController {
    private Logger logger = Logger.getLogger(HelloWorldController.class);

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> helloWorld() {
        logger.info("Controller - HelloWorld : Method helloWorld");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody ResponseEntity<List<Student>> findStudents() {
        logger.info("Controller - HelloWorld : Method findStudents");
        List<Student> studentList = studentService.findAll();
        return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST,headers="Accept=application/json")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        Student savedStudent = this.studentService.create(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.OK);
    }
}
