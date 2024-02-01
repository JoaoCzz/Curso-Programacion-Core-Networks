package com.corenetworks.Tablas.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "reservas")
@IdClass(ReversaPK.class)
public class Reserva implements Serializable {
    @Id
    private Perro perro;
    @Id
    private Habitacion habitacion;
    private LocalDate fSalida;
    private LocalDate fEntrada;

}
