package com.penguinclub.project.repositories;

import com.penguinclub.project.models.Assistance;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssistanceRepository extends CrudRepository<Assistance, Integer> {
    List<Assistance> findAll();
}
