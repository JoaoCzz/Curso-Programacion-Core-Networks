package com.corenetworks._Enero_EjemploControladores.controlador;

import com.corenetworks._Enero_EjemploControladores.modelo.Cliente;
import com.corenetworks._Enero_EjemploControladores.repositorio.IClienteRepositorio;
import com.corenetworks._Enero_EjemploControladores.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {
    @Autowired
    private IClienteServicio iClienteServicio;

    @PostMapping
    public Cliente insertarUno(@RequestBody Cliente c){
        return iClienteServicio.insertarUno(c);
    }
    @PutMapping
    public Cliente ModificarUno(@RequestBody Cliente c){
        return iClienteServicio.modificarUno(c);
    }
    @GetMapping("{id}")
    public Cliente BuscarUno(@PathVariable("id") int id){
        return iClienteServicio.buscarUno(id);
    }
    @DeleteMapping("{id}")
    public void EliminarUno(@PathVariable("id") int id){
        iClienteServicio.EliminarUno(id);
    }
    @GetMapping
    public List<Cliente> BuscarTodos(){
        return iClienteServicio.Todos();
    }

}
