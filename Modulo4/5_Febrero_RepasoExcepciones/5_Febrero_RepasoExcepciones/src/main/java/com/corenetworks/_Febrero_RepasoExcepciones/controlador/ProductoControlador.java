package com.corenetworks._Febrero_RepasoExcepciones.controlador;

import com.corenetworks._Febrero_RepasoExcepciones.modelo.Producto;
import com.corenetworks._Febrero_RepasoExcepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            throw new Exception("Producto de id = "+ p.getIdProducto() +" no encontrado");
        }

        return new ResponseEntity<>(servicio.modificar(p), HttpStatus.OK);
    }

}
