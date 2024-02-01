package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
@Entity
@Table(name = "lugares")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLugar;
    @Column(length = 60,nullable = false)
    private String lugar;

//    @OneToMany(mappedBy = "lugar",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<Visita> visitas;

    public Lugar(int idLugar, String lugar) {
        this.idLugar = idLugar;
        this.lugar = lugar;
    }
}
