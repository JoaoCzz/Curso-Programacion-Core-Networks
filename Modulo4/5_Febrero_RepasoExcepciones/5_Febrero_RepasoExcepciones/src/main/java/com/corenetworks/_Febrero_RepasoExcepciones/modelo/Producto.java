package com.corenetworks._Febrero_RepasoExcepciones.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdProducto;
    @Column(length = 60,nullable = false)
    private String nombreProducto;
    private double precio;
}
