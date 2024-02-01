package com.corenetworks.Capas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    @Column(nullable = false)
    private LocalDate fechaPedido;
    @Column(length = 5,nullable = false)
    private String FormaPago;
    @Column(nullable = false)
    private double importe;



}
