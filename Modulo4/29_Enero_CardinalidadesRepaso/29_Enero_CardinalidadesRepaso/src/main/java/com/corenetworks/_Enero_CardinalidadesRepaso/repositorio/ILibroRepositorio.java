package com.corenetworks._Enero_CardinalidadesRepaso.repositorio;

import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroDto;
import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroeEditorialDTO;
import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILibroRepositorio extends JpaRepository <Libro,String> {
    @Query("Select l FROM Libro l JOIN FETCH l.editorial")
    List<Libro> obtenerLibrosEditorial();
    @Query("Select new com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroDto(l.isbn,l.titulo) from Libro l")
    List<LibroDto> usarDTO();
    @Query("Select new com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroeEditorialDTO(l.isbn,l.titulo,l.editorial.Direccion,l.editorial.nombreEditorial) from Libro l JOIN  l.editorial " +
            "WHERE l.editorial.idEditorial= :id")
    List<LibroeEditorialDTO> usarLEDto(@Value("id")int id);
}
