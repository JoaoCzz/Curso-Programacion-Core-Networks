package com.corenetworks.MadurezRestFull.controlador;

import com.corenetworks.MadurezRestFull.excepciones.ExepcionNoEncontrado;
import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.MadurezRestFull.servicio.IConsultaMedicaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas_medicas")
public class ConsultaControlador {
    @Autowired
    private IConsultaMedicaServicio servicio;

    @GetMapping()
    public List<ConsultaMedica> FindAll() {
        return servicio.BuscarTodos();
    }

    @PostMapping
    public ResponseEntity<ConsultaMedica> insert(@RequestBody ConsultaMedica c) {
        ConsultaMedica CBB = servicio.crear(c);
        return new ResponseEntity<>(CBB, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaMedica> FindById(@PathVariable int id) {
        ConsultaMedica cm = servicio.BuscarPorId(id);
        if (cm == null) {
            throw new ExepcionNoEncontrado("Recurso no encontrado " + id);
        }
        return new ResponseEntity<>(cm, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ConsultaMedica> Editar(@RequestBody ConsultaMedica c) {
        ConsultaMedica cm = servicio.BuscarPorId(c.getIdConsulta());
        if (cm == null) {
            throw new ExepcionNoEncontrado("No existe esa consulta medica");
        }
            return new ResponseEntity<>(servicio.editar(c), HttpStatus.OK);
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable(name = "id") int id){
        ConsultaMedica cmBBDD= servicio.BuscarPorId(id);
        if (cmBBDD==null){
            throw new ExepcionNoEncontrado("No existe esa consulta medica");
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


