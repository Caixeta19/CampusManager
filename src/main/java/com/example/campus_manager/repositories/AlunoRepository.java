package com.example.campus_manager.repositories;
import com.example.campus_manager.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UUID> {

    Optional<Aluno> findByNome(String nome);

    List<Aluno> findByMatricula(String matricula);
}
