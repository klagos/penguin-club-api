package com.penguinclub.project.services;

import com.penguinclub.project.models.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course create(Course Course);
    Course update(Integer id, Course Course);
}
