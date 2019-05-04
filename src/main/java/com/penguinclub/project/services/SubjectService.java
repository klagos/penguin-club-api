package com.penguinclub.project.services;

import com.penguinclub.project.models.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();
    Subject create(Subject Subject);
    Subject update(Integer id, Subject Subject);
}
