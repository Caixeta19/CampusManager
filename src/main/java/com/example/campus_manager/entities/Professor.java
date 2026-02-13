package com.example.campus_manager.entities;
import com.example.campus_manager.entities.enums.GraduacaoEnum;
import com.example.campus_manager.entities.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "tb_professor")

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String email;

    @Enumerated(EnumType.STRING)
    private GraduacaoEnum graduacao;

    private BigDecimal salario;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;







}
