package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consultas_analiticas2")
public class Consulta2Analitica2PK {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_consulta",nullable = false,foreignKey = @ForeignKey(name ="FK_consulta_analiticas_2_consulta2"))
    private Consulta2 consulta;
    @Id
    @ManyToOne
    @JoinColumn(name = "id_analitica",nullable = false,foreignKey = @ForeignKey(name = "FK_consulta_analiticas_2_analitica2"))
    private Analitica2 analitica;

    private LocalDate FechaVisita;

}
