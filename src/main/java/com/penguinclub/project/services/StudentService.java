package com.penguinclub.project.services;

import com.penguinclub.project.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student create(Student student);
    Student update(Integer id, Student student);
}
