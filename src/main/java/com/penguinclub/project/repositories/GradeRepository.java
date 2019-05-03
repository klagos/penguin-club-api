package com.penguinclub.project.repositories;

import com.penguinclub.project.models.Grade;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GradeRepository extends CrudRepository<Grade, Integer> {
    List<Grade> findAll();
}
