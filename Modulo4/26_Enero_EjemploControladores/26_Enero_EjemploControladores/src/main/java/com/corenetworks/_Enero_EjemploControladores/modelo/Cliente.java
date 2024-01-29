package com.corenetworks._Enero_EjemploControladores.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 10,nullable = false)
    private String movil;
    @Column(length = 100,nullable = false)
    private String email;
    @Column(length = 50,nullable = false)
    private String contraseña;


}
