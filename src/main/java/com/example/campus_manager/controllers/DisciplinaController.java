package com.example.campus_manager.controllers;
import com.example.campus_manager.entities.Disciplina;
import com.example.campus_manager.services.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private DisciplinaService service;

    public DisciplinaController(DisciplinaService service){
        this.service = service;
    }
@PostMapping
    public Disciplina cadastrarDisciplina(@RequestBody Disciplina disciplina){
        return service.cadastrarDisciplina(disciplina);
}
@GetMapping
    public List<Disciplina> listarDisciplinas(){
        return service.listarDisciplinas();
}
@DeleteMapping("/{id}")
public void deletarDisciplina(@PathVariable Long id){
        service.deletarDisciplina(id);
}
}
