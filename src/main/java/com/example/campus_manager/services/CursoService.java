package com.example.campus_manager.services;

import com.example.campus_manager.entities.Curso;
import com.example.campus_manager.repositories.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoService {

private CursoRepository repository;

public CursoService(CursoRepository repository){
    this.repository = repository;
}
public Curso cadastrarCurso(Curso curso){
        return repository.save(curso);
}
public List<Curso> listarCurso(){
    return repository.findAll();
}
    public void deletarCurso(Long id){
        repository.deleteById(id);
    }


}
