package com.corenetworks._Enero_CardinalidadesRepaso.controlador;

import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Editorial;
import com.corenetworks._Enero_CardinalidadesRepaso.servicio.IEditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    @Autowired
    private IEditorialServicio servicio;
@PostMapping
    public Editorial insertarUno(@RequestBody Editorial e){
        return servicio.insertaUno(e);
    }
    @GetMapping
    public List<Editorial>ObtenerTodos(){
    return servicio.obtenerTodos();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(name = "id") int id){
    servicio.EliminarUno(id);
    }
    @GetMapping("/{id}")
    public Editorial BuscarUno(@PathVariable (name = "id")int id){
    return servicio.BuscarUno(id);
    }
}
