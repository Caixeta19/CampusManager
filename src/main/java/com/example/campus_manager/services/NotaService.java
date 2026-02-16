package com.example.campus_manager.services;
import com.example.campus_manager.entities.Nota;
import com.example.campus_manager.repositories.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService {

    private NotaRepository repository;

    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }
    public Nota lancarNota(Nota nota){
        return repository.save(nota);
    }
    public List<Nota> listarNotas(){
        return repository.findAll();
    }
    public void deletarNota(Long id){
         repository.deleteById(id);
    }






}
