package com.example.campus_manager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "tb_nota")


public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "matricula_id",nullable = false)
    private Matricula matricula;

    @ManyToOne
    @JoinColumn(name = "disciplina_id",nullable = false)
    private Disciplina disciplina;

    private BigDecimal valor;
    private String semestre;
    private Integer ano;


}
