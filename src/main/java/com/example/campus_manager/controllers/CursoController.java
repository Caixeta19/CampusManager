package com.example.campus_manager.controllers;
import com.example.campus_manager.entities.Curso;
import com.example.campus_manager.services.CursoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/curso")
public class CursoController {

    private CursoService service;

    public CursoController(CursoService service) {
       this.service = service;
    }
@PostMapping
    public Curso cadastrarCurso(@RequestBody Curso curso){
        return service.cadastrarCurso(curso);
}
@GetMapping
public List<Curso> listarCurso(){
        return service.listarCurso();
}
@DeleteMapping("/{id}")
    public void deletarCurso(@PathVariable Long id){
    service.deletarCurso(id);

    }
}



