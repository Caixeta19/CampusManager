package com.example.campus_manager.controllers;
import com.example.campus_manager.entities.Nota;
import com.example.campus_manager.services.NotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {

    private NotaService service;

    public NotaController(NotaService service) {
        this.service = service;
    }
@PostMapping
    public Nota lancarNota(@RequestBody Nota nota){
        return service.lancarNota(nota);
}
@GetMapping
    public List<Nota> listarNotas(){
        return service.listarNotas();
}
@DeleteMapping("/{id}")
    public void deletarNota(@PathVariable Long id){
        service.deletarNota(id);
}
}
