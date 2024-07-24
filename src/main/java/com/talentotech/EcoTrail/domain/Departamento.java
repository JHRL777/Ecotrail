package com.talentotech.EcoTrail.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="departamento")

public class Departamento implements Serializable {

    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_departamento;

    @Column(nullable = false, length = 100)
    private String nombre;

}