package com.corenetworks.Tablas.Modelo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class ReversaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "id_perro",nullable = false,foreignKey = @ForeignKey(name = "FK_reservaPK_perros"))
    private Perro perro;
    @ManyToOne
    @JoinColumn(name = "id_habitacion",nullable = false,foreignKey = @ForeignKey(name = "FK_reservaPK_habitaciones"))
    private Habitacion habitacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReversaPK reversaPK = (ReversaPK) o;
        return Objects.equals(perro, reversaPK.perro) && Objects.equals(habitacion, reversaPK.habitacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perro, habitacion);
    }
}
