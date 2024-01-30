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
    @PutMapping
    public Editorial modificarUno(@RequestBody Editorial e){
    return servicio.modificarUno(e);
    }
    @GetMapping("/filtro/{direccion}")
    public List<Editorial> FiltroPorDireccion (@PathVariable (name = "direccion") String direccion){
    return servicio.filtroPorDireccion(direccion);
    }
    @GetMapping("/filtro2/{nombre}")
    public List <Editorial> FiltroPorNombre(@PathVariable(name = "nombre") String nombre){
    return servicio.filtroPorNombre(nombre);
    }

    @GetMapping("/filtro3/{letra}")
    public List<Editorial> FiltroPorLetra(@PathVariable(name = "letra")char letra){
    return servicio.filtroPorLetra(letra);
    }
}
