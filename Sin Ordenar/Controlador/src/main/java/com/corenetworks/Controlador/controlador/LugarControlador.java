package com.corenetworks.Controlador.controlador;

import com.corenetworks.Controlador.modelo.Lugar;
import com.corenetworks.Controlador.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares")
public class LugarControlador {
    @Autowired
    private ILugarServicio lugarServicio;
    @GetMapping

    public List<Lugar> obtenertodos(){
        return lugarServicio.obtenerTodos();
    }
    @GetMapping("/{id}")
    public Lugar obtenerUno(@PathVariable("id") int id){
        return lugarServicio.obtenerUno(id);
    }
    @PostMapping
    public Lugar insertarUno(@RequestBody Lugar l1){
        return lugarServicio.insertar(l1);
    }
    @PutMapping
    public Lugar modificarUno(@RequestBody Lugar l1){
        return lugarServicio.modificar(l1);
    }
    @DeleteMapping("/{id}")
    public void eliminarUno(@PathVariable int id){
        lugarServicio.Eliminar(id);
    }

}
