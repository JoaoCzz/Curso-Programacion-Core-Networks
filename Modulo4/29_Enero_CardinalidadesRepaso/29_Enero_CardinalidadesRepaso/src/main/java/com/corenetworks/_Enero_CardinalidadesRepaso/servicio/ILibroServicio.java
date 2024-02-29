package com.corenetworks._Enero_CardinalidadesRepaso.servicio;

import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroDto;
import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroeEditorialDTO;
import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Libro;

import java.util.List;

public interface ILibroServicio {
    List<Libro> ejemploJoin();

    List<LibroDto> usarDto();

    List<LibroeEditorialDTO> usarLEDTO(int id);
}
