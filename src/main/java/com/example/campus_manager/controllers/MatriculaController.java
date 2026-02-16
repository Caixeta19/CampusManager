package com.example.campus_manager.controllers;

import com.example.campus_manager.entities.Matricula;
import com.example.campus_manager.services.MatriculaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

private MatriculaService service;

public MatriculaController(MatriculaService service){
    this.service = service;
}
@PostMapping
    public Matricula fazerMatricula(@RequestBody Matricula matricula){
    return service.fazerMatricula(matricula);
}
@GetMapping
    public List<Matricula> listarMatriculas(){
    return service.listarMatriculas();
}
@DeleteMapping("/{id}")
public void deletarMatricula(@PathVariable Long id){
    service.deletarMatricula(id);
}


}
