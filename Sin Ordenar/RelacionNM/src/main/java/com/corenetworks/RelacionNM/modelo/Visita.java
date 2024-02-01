package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idVisita;
    @ManyToOne
    @JoinColumn(name = "matricula",nullable = false,foreignKey = @ForeignKey(name = "visitas_autobuses"))
    private Autobus autobus;

    @ManyToOne
    @JoinColumn(name = "Dni",nullable = false,foreignKey = @ForeignKey(name = "visitas_conductores"))
    private Conductor conductor;

    @ManyToOne
    @JoinColumn(name = "id_lugar",nullable = false,foreignKey = @ForeignKey(name = "visitas_lugares"))
    private Lugar lugar;
    @Column(nullable = false)
    private LocalDate FechaVisita;

    @Override
    public String toString() {
        return "AutobusLugaresConductor{" +
                "idVisita=" + idVisita +
                ", FechaVisita=" + FechaVisita +
                '}';
    }

    public Visita(int idVisita, LocalDate fechaVisita) {
        this.idVisita = idVisita;
        FechaVisita = fechaVisita;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        FechaVisita = fechaVisita;
    }
}
