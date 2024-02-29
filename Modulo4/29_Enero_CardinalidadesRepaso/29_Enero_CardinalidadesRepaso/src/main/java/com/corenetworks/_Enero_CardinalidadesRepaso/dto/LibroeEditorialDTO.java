package com.corenetworks._Enero_CardinalidadesRepaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroeEditorialDTO {
    private String ISBN;
    private String titulo;
    private String direccion;
    private String nombre;

}
