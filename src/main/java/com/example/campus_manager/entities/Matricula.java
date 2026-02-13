package com.example.campus_manager.entities;

import com.example.campus_manager.entities.enums.MatriculaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "tb_matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id",nullable = false)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "curso_id",nullable = false)
    private Curso curso;

    private LocalDate dataMatricula;
    private MatriculaEnum matricula;


}
