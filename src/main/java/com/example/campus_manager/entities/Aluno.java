package com.example.campus_manager.entities;
import com.example.campus_manager.entities.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_aluno")
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private String matricula;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;



}
