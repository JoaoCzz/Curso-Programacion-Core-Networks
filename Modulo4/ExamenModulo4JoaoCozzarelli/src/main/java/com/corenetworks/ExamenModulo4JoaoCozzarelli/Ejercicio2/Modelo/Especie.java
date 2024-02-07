package com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio2.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60,nullable = false)
    private String nombreVulgar;
    private boolean extincion;
    @Column(length = 60,nullable = false)
    private String nombreCientifico;
    @OneToMany(mappedBy = "especie",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Animal> animales;
}
