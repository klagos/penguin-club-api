package com.penguinclub.project.controllers;

import com.penguinclub.project.models.Grade;
import com.penguinclub.project.services.GradeService;

import com.penguinclub.project.models.Student;
import com.penguinclub.project.services.StudentService;

import com.penguinclub.project.models.Assistance;
import com.penguinclub.project.services.AssistanceService;

import com.penguinclub.project.models.Subject;
import com.penguinclub.project.services.SubjectService;

import com.penguinclub.project.models.Teacher;
import com.penguinclub.project.services.TeacherService;

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
    @Autowired
    GradeService gradeService;
    @Autowired
    AssistanceService assistanceService;
    @Autowired
    SubjectService subjectService;
    @Autowired
    TeacherService teacherService;

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

    @RequestMapping(value = "/grade", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody ResponseEntity<List<Grade>> findGrades() {
        logger.info("Controller - HelloWorld : Method findGrades");
        List<Grade> gradeList = gradeService.findAll();
        return new ResponseEntity<List<Grade>>(gradeList, HttpStatus.OK);
    }

    @RequestMapping(value = "/grade", method = RequestMethod.POST,headers="Accept=application/json")
    public ResponseEntity<Grade> save(@RequestBody Grade grade) {
        Grade savedGrade = this.gradeService.create(grade);
        return new ResponseEntity<>(savedGrade, HttpStatus.OK);
    }

    @RequestMapping(value = "/assistance", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody ResponseEntity<List<Assistance>> findAssistances() {
        logger.info("Controller - HelloWorld : Method findAssistences");
        List<Assistance> assistanceList = assistanceService.findAll();
        return new ResponseEntity<List<Assistance>>(assistanceList, HttpStatus.OK);
    }

    @RequestMapping(value = "/assistance", method = RequestMethod.POST,headers="Accept=application/json")
    public ResponseEntity<Assistance> save(@RequestBody Assistance assistance) {
        Assistance savedAssistance = this.assistanceService.create(assistance);
        return new ResponseEntity<>(savedAssistance, HttpStatus.OK);
    }

    @RequestMapping(value = "/subject", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody ResponseEntity<List<Subject>> findSubjects() {
        logger.info("Controller - HelloWorld : Method findSubjects");
        List<Subject> subjectList = subjectService.findAll();
        return new ResponseEntity<List<Subject>>(subjectList, HttpStatus.OK);
    }

    @RequestMapping(value = "/subject", method = RequestMethod.POST,headers="Accept=application/json")
    public ResponseEntity<Subject> save(@RequestBody Subject subject) {
        Subject savedSubject = this.subjectService.create(subject);
        return new ResponseEntity<>(savedSubject, HttpStatus.OK);
    }

    @RequestMapping(value = "/teacher", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public @ResponseBody ResponseEntity<List<Teacher>> findTeachers() {
        logger.info("Controller - HelloWorld : Method findTeachers");
        List<Teacher> teacherList = teacherService.findAll();
        return new ResponseEntity<List<Teacher>>(teacherList, HttpStatus.OK);
    }

    @RequestMapping(value = "/teacher", method = RequestMethod.POST,headers="Accept=application/json")
    public ResponseEntity<Teacher> save(@RequestBody Teacher teacher) {
        Teacher savedTeacher = this.teacherService.create(teacher);
        return new ResponseEntity<>(savedTeacher, HttpStatus.OK);
    }
}
