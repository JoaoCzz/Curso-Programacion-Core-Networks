package com.corenetworks._Febrero_RepasoExcepciones.controlador;

import com.corenetworks._Febrero_RepasoExcepciones.excepcion.ExcepcionPersonalizada;
import com.corenetworks._Febrero_RepasoExcepciones.modelo.Producto;
import com.corenetworks._Febrero_RepasoExcepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {
    @Autowired
    private IProductoServicio servicio;

    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody Producto p) throws Exception{
        Producto p1=servicio.crear(p);
        return new ResponseEntity<>(p1, HttpStatus.CREATED);
    }@PutMapping
    public ResponseEntity<Producto> modificar(@RequestBody Producto p) throws Exception{
        Producto p1= servicio.mostrarUno(p.getIdProducto());
        if (p1 == null){
            throw new ExcepcionPersonalizada("Producto de id = "+ p.getIdProducto() +" no encontrado");
        }

        return new ResponseEntity<>(servicio.modificar(p), HttpStatus.OK);
    }
@GetMapping
    public ResponseEntity<List<Producto>> mostrarTodos() throws Exception{
        return new ResponseEntity<>(servicio.mostrarTodos(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> mostrarUno(@PathVariable(name = "id") int id)throws Exception{
        Producto p1= servicio.mostrarUno(id);
        if (p1==null){
            throw new ExcepcionPersonalizada("Producto de id = "+ id +" no encontrado");
        }
        return new ResponseEntity<>(p1,HttpStatus.OK);
    }
@DeleteMapping("/{id}")
    public ResponseEntity<Producto> Eliminar(@PathVariable(name = "id") int id)throws Exception{
        Producto p1= servicio.mostrarUno(id);
        if (p1==null){
            throw new ExcepcionPersonalizada("Producto de id = "+ id +" no encontrado");
        }
    servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
