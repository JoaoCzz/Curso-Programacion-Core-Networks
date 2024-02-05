package com.corenetworks._Febrero_RepasoExcepciones.excepcion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExcepcionDetalles {
    private String mensaje;
    private LocalDateTime fecha;
    private String detalle;

}
