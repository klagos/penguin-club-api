package com.penguinclub.project.services;

import com.penguinclub.project.models.Grade;
import com.penguinclub.project.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeRepository repository;

    public GradeServiceImpl() {

    }

    @Override
    public List<Grade> findAll() {
        return (List<Grade>) this.repository.findAll();
    }

    @Override
    public Grade create(Grade Grade) {
        return this.repository.save(Grade);
    }

    @Override
    public Grade update(Integer id, Grade Grade) {
        Grade toUpdate = this.repository.findById(id).get();
        toUpdate.setDate(Grade.getDate());
        toUpdate.setTitle(Grade.getTitle());
        toUpdate.setWeighing(Grade.getWeighing());
        return this.repository.save(toUpdate);
    }
}
