package com.penguinclub.project.services;

import com.penguinclub.project.models.Subject;
import com.penguinclub.project.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository repository;

    public SubjectServiceImpl() {

    }

    @Override
    public List<Subject> findAll() {
        return (List<Subject>) this.repository.findAll();
    }

    @Override
    public Subject create(Subject Subject) {
        return this.repository.save(Subject);
    }

    @Override
    public Subject update(Integer id, Subject Subject) {
        Subject toUpdate = this.repository.findById(id).get();
        toUpdate.setName(Subject.getName());
        toUpdate.setInitials(Subject.getInitials());
        return this.repository.save(toUpdate);
    }
}
