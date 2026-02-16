package com.example.campus_manager.controllers;

import com.example.campus_manager.entities.Professor;
import com.example.campus_manager.services.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }
    @PostMapping
    public void cadastrarProfessor(@RequestBody Professor professor){
        service.cadastrarProfessor(professor);
    }
    @GetMapping
    public List<Professor> listarProfessores(){
        return service.listarProfessor();
    }
    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable Long id){
        service.deletarProfessor(id);
    }
}
