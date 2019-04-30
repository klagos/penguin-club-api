package com.penguinclub.project.services;

import com.penguinclub.project.models.Student;
import com.penguinclub.project.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    public StudentServiceImpl() {

    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) this.repository.findAll();
    }

    @Override
    public Student create(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Student update(Integer id, Student student) {
        Student toUpdate = this.repository.findById(id).get();
        toUpdate.setName(student.getName());
        toUpdate.setRol(student.getRol());
        return this.repository.save(toUpdate);
    }
}
