package com.penguinclub.project.repositories;

import com.penguinclub.project.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    List<Course> findAll();
}
