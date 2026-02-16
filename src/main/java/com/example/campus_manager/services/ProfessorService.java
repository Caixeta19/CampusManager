package com.example.campus_manager.services;

import com.example.campus_manager.entities.Professor;
import com.example.campus_manager.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfessorService {

    private ProfessorRepository repository;

    public ProfessorService (ProfessorRepository repository) {
        this.repository = repository;
    }
    public Professor cadastrarProfessor(Professor professor) {
        return repository.save(professor);
    }
    public List<Professor> listarProfessor() {
        return repository.findAll();
    }
    public void deletarProfessor(Long id) {
        repository.deleteById(id);
    }


}
