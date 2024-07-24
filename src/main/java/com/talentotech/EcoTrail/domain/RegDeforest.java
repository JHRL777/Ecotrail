package com.talentotech.EcoTrail.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="reg_deforest")
public class RegDeforest implements Serializable {

    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reg_def;

    @Column(nullable = false)
    private Integer año;

    @Column(nullable = false)
    private Integer impacto;

    @ManyToOne
    @JoinColumn(name = "id_municipio", nullable = false)
    private Municipio municipio;
}