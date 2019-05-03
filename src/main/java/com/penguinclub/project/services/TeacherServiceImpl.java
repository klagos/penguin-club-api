package com.penguinclub.project.services;


import com.penguinclub.project.models.Teacher;
import com.penguinclub.project.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository repository;

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) this.repository.findAll();
    }

    @Override
    public Teacher create(Teacher Teacher) {
        return this.repository.save(Teacher);
    }

    @Override
    public Teacher update(Integer id, Teacher Teacher) {
        Teacher toUpdate = this.repository.findById(id).get();
        toUpdate.setName(Teacher.getName());
        return this.repository.save(toUpdate);
    }
}
