package com.example.campus_manager.services;
import com.example.campus_manager.entities.Disciplina;
import com.example.campus_manager.repositories.DisciplinaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DisciplinaService {

    private DisciplinaRepository repository;

    public DisciplinaService(DisciplinaRepository repository) {
        this.repository = repository;
    }
    public Disciplina cadastrarDisciplina(Disciplina disciplina){
        return repository.save(disciplina);
    }
    public List<Disciplina> listarDisciplinas(){
        return repository.findAll();
    }
    public void deletarDisciplina(Long id){
        repository.deleteById(id);
    }
}
