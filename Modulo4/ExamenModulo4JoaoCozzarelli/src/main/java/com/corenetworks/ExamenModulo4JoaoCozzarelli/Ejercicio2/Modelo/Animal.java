package com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio2.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    @Column(nullable = false)
    private LocalDate fNacimiento;
    @Column(nullable = false)
    private char Sexo;
    private int idPais;

    @ManyToOne
    @JoinColumn(name = "idEspecie",nullable = false,foreignKey = @ForeignKey(name = "FK_animales_especies"))
    private Especie especie;
}
