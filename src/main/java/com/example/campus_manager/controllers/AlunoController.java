package com.example.campus_manager.controllers;
import com.example.campus_manager.entities.Aluno;
import com.example.campus_manager.services.AlunoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoService service;

        public AlunoController(AlunoService service){
            this.service = service;
        }
 @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
            return service.cadastrarAluno(aluno);
 }
@GetMapping
    public List<Aluno> listarAlunos(){
            return service.listarAlunos();
}
@DeleteMapping("/{id}")
public void deletarAluno(@PathVariable UUID id){
    service.deletarAluno(id);

}
}
