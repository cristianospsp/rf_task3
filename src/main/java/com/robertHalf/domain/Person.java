package com.robertHalf.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPerson;

    @NotBlank(message = "Full Name is mandatory")
    @Size(min = 3, message = "Full Name must have at least 3 characters")
    @Column(name = "FULLNAME", nullable = false)
    private String fullName;

    @NotNull(message = "Birthdate is mandatory")
    @Past(message = "Birthdate must be in the past")
    @Column(nullable = false)
    private LocalDate birthdate;

    @ManyToOne
    @JoinColumn(name = "ID_GENDER")
    private Gender gender;

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
