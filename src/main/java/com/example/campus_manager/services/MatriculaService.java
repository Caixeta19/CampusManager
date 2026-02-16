package com.example.campus_manager.services;
import com.example.campus_manager.entities.Matricula;
import com.example.campus_manager.repositories.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {


    private MatriculaRepository repository;

    public MatriculaService(MatriculaRepository repository) {
        this.repository = repository;
    }

    public Matricula fazerMatricula(Matricula matricula){
        return repository.save(matricula);
    }
public List<Matricula> listarMatriculas(){
        return repository.findAll();
}
public void deletarMatricula(Long id){
        repository.deleteById(id);
}







}
