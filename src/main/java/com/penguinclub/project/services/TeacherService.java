package com.penguinclub.project.services;

import com.penguinclub.project.models.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();
    Teacher create(Teacher Teacher);
    Teacher update(Integer id, Teacher Teacher);
}
