package com.example.campus_manager.services;
import com.example.campus_manager.entities.Aluno;
import com.example.campus_manager.repositories.AlunoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class AlunoService {

private AlunoRepository repository;

  public AlunoService(AlunoRepository repository  ) {
  this.repository = repository;
}

public Aluno cadastrarAluno(Aluno aluno){
        return repository.save(aluno);
}

public List<Aluno> listarAlunos(){
    return repository.findAll();
}
public void deletarAluno(UUID id){
    repository.deleteById(id);
}
}
