package com.robertHalf.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_GENDER")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGender;

    @Column(nullable = false)
    private String name;

    // Construtor padrão
    public Gender() {
    }

    // Getters e Setters
    public Integer getIdGender() {
        return idGender;
    }

    public void setIdGender(Integer idGender) {
        this.idGender = idGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}