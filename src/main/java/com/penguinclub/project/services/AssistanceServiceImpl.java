package com.penguinclub.project.services;

import com.penguinclub.project.models.Assistance;
import com.penguinclub.project.repositories.AssistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistanceServiceImpl implements AssistanceService {
    @Autowired
    private AssistanceRepository repository;

    public AssistanceServiceImpl() {

    }

    @Override
    public List<Assistance> findAll() {
        return (List<Assistance>) this.repository.findAll();
    }

    @Override
    public Assistance create(Assistance Assistance) {
        return this.repository.save(Assistance);
    }

    @Override
    public Assistance update(Integer id, Assistance Assistance) {
        Assistance toUpdate = this.repository.findById(id).get();
        toUpdate.setDate(Assistance.getDate());
        toUpdate.setState(Assistance.getState());
        return this.repository.save(toUpdate);
    }
}