package com.corenetworks._Febrero_Validaciones.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleados;
    @Column(length = 60)
    private String nombre;
    @Column(length = 9,unique = true)
    private String dni;
    private double sueldo;
}
