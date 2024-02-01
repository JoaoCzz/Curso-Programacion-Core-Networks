package com.corenetworks.Tablas.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "perros")
public class Perro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerro;
    @Column(length = 20)
    private String raza;
    @Column(length = 60)
    private String nombre;
    private int edad;
    private String tamaño;
}
