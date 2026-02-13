package com.example.campus_manager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table( name = "tb_curso")

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String codigo;
    private Integer cargaHoraria;
    private String descricao;
    private boolean ativo;
}
