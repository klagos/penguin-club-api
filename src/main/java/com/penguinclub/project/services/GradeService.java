package com.penguinclub.project.services;

import com.penguinclub.project.models.Grade;

import java.util.List;

public interface GradeService {
    List<Grade> findAll();
    Grade create(Grade Grade);
    Grade update(Integer id, Grade Grade);
}
