package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;
    @Column(nullable = false)
    private LocalTime hora;
    @Column(nullable = false)
    private LocalDate fecha;
    @ManyToMany
    @JoinTable(name = "consultas_analiticas",joinColumns = @JoinColumn(name = "id_consulta",referencedColumnName = "idConsulta"),
    inverseJoinColumns = @JoinColumn(name = "id_analitica",referencedColumnName = "idAnalitica"))
    private List<Analitica> analiticas;

}
