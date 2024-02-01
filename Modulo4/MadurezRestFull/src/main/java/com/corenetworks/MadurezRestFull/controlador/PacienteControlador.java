package com.corenetworks.MadurezRestFull.controlador;

import com.corenetworks.MadurezRestFull.excepciones.ExepcionNoEncontrado;
import com.corenetworks.MadurezRestFull.modelo.Paciente;
import com.corenetworks.MadurezRestFull.modelo.Paciente;
import com.corenetworks.MadurezRestFull.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping()
    public List<Paciente> FindAll() {
        return servicio.BuscarTodos();
    }

    @PostMapping
    public ResponseEntity<Paciente> insert(@RequestBody Paciente c) {
        Paciente PBB = servicio.crear(c);
        return new ResponseEntity<>(PBB, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> FindById(@PathVariable int id) {
        Paciente PBBDD = servicio.BuscarPorId(id);
        if (PBBDD == null) {
            throw new ExepcionNoEncontrado("Recurso no encontrado " + id);
        }
        return new ResponseEntity<>(PBBDD, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Paciente> Editar(@RequestBody Paciente c) {
        Paciente PBBDD = servicio.BuscarPorId(c.getIdPaciente());
        if (PBBDD == null) {
            throw new ExepcionNoEncontrado("No existe esa consulta medica");
        }
        return new ResponseEntity<>(servicio.editar(c), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable(name = "id") int id){
        Paciente PBBDD= servicio.BuscarPorId(id);
        if (PBBDD==null){
            throw new ExepcionNoEncontrado("No existe esa consulta medica");
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
