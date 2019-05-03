package com.penguinclub.project.services;

import com.penguinclub.project.models.Assistance;

import java.util.List;

public interface AssistanceService {
    List<Assistance> findAll();
    Assistance create(Assistance Assistance);
    Assistance update(Integer id, Assistance Assistance);
}
