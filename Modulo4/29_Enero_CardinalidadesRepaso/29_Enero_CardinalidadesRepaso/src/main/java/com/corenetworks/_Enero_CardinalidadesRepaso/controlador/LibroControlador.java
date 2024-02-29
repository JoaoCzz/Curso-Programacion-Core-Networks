package com.corenetworks._Enero_CardinalidadesRepaso.controlador;

import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroDto;
import com.corenetworks._Enero_CardinalidadesRepaso.dto.LibroeEditorialDTO;
import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Libro;
import com.corenetworks._Enero_CardinalidadesRepaso.servicio.ILibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Libros")
public class LibroControlador {
    @Autowired
    private ILibroServicio servicio;

    @GetMapping
    public List<Libro> obtenerJoin(){
        return servicio.ejemploJoin();
    }
    @GetMapping("/dto")
    public List<LibroDto> usarDTO(){
        return servicio.usarDto();
    }
    @GetMapping("/LEDto/{id}")
    public List<LibroeEditorialDTO> usarLEDto(@PathVariable(name = "id") int id){
        return servicio.usarLEDTO(id);
    }
}
