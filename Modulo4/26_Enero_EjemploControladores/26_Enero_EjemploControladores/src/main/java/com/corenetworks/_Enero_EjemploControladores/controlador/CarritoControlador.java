package com.corenetworks._Enero_EjemploControladores.controlador;

import com.corenetworks._Enero_EjemploControladores.modelo.Carrito;
import com.corenetworks._Enero_EjemploControladores.servicio.ICarritoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carritos")
public class CarritoControlador {
    @Autowired
    private ICarritoServicio iCarritoServicio;
    @PostMapping
    public Carrito insertar(@RequestBody Carrito c){
        return iCarritoServicio.insertarUno(c);
    }
    @PutMapping
    public Carrito modificar(@RequestBody Carrito c){
        return iCarritoServicio.modificarUno(c);
    }
    @GetMapping("/{id}")
    public Carrito BuscarUno(@PathVariable("id")int id){
        return iCarritoServicio.obtenerUno(id);
    }
    @GetMapping
    public List<Carrito> ObtenerTodos(){
        return iCarritoServicio.ObtenerTodos();
    }
    @DeleteMapping("/{id}")
    public void eliminarUno(@PathVariable("id") int id){
        iCarritoServicio.Eliminar(id);
    }

}
