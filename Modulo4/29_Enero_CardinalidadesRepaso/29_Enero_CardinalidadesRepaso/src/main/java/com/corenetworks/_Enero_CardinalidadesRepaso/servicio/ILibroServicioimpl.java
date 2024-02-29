package com.corenetworks._Enero_CardinalidadesRepaso.servicio;

import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroDto;
import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroeEditorialDTO;
import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Libro;
import com.corenetworks._Enero_CardinalidadesRepaso.repositorio.ILibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ILibroServicioimpl implements ILibroServicio{
    @Autowired
    private ILibroRepositorio repo;
    @Override
    public List<Libro> ejemploJoin() {
        return repo.obtenerLibrosEditorial();
    }

    @Override
    public List<LibroDto> usarDto() {
        return repo.usarDTO();
    }

    @Override
    public List<LibroeEditorialDTO> usarLEDTO(int id) {
        return repo.usarLEDto(id);
    }
}
