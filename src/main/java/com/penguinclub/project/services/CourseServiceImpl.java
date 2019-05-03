package com.penguinclub.project.services;

import com.penguinclub.project.models.Course;
import com.penguinclub.project.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository repository;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) this.repository.findAll();
    }

    @Override
    public Course create(Course Course) {
        return this.repository.save(Course);
    }

    @Override
    public Course update(Integer id, Course Course) {
        Course toUpdate = this.repository.findById(id).get();
        toUpdate.setName(Course.getName());
        toUpdate.setInitials(Course.getInitials());
        return this.repository.save(toUpdate);
    }
}
