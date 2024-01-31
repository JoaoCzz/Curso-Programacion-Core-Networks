package com.corenetworks.MadurezRestFull.excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ExcepcionPretty {
    private String mensaje;
    private LocalDateTime fecha;
    private String descripcion;
}
