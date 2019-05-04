package com.penguinclub.project.repositories;

import com.penguinclub.project.models.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {
    List<Subject> findAll();
}
