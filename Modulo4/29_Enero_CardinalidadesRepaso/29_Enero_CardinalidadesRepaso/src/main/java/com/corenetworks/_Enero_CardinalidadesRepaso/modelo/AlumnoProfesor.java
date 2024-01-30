package com.corenetworks._Enero_CardinalidadesRepaso.modelo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
@IdClass(AlumnoProfesorPK.class)
public class AlumnoProfesor implements Serializable {
    @Id
    private Alumno alumno;
    @Id
    private Profesor profesor;
}
