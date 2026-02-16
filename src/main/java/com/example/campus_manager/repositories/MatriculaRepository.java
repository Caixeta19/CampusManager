package com.example.campus_manager.repositories;
import com.example.campus_manager.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Long> {
}
