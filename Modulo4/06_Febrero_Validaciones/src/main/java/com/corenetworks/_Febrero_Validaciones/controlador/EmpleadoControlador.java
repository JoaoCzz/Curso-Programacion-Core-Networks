package com.corenetworks._Febrero_Validaciones.controlador;

import com.corenetworks._Febrero_Validaciones.dto.EmpleadoDTO;
import com.corenetworks._Febrero_Validaciones.dto.ResumenDTO;
import com.corenetworks._Febrero_Validaciones.exepciones.Excepcion;
import com.corenetworks._Febrero_Validaciones.modelo.Empleado;
import com.corenetworks._Febrero_Validaciones.servicio.IEmpleadoServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoControlador {
    @Autowired
    private IEmpleadoServicio servicio;
    @PostMapping
    public ResponseEntity <EmpleadoDTO> crearEmpleado(@Valid @RequestBody EmpleadoDTO e){
        Empleado e1= e.castEmpleado();
        e1= servicio.crear(e1);
        return new ResponseEntity<>(e.castEmpleadoDTO(e1), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity <EmpleadoDTO> editarEmpleado(@Valid @RequestBody EmpleadoDTO e){
        Empleado e1= servicio.mostrarUno(e.getIdEmpleado());
        if (e1==null){
            throw new Excepcion("Empleado no encontrado"+e.getIdEmpleado());
        }
        e1= servicio.modificar(e1);
        return new ResponseEntity<>(e.castEmpleadoDTO(e1), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDTO> consultarUno(@PathVariable(name = "id") int id){
        Empleado e1= servicio.mostrarUno(id);
        if (e1==null){
            throw new Excepcion("Empleado no encontrado "+id);
        }
        return new ResponseEntity<>(new EmpleadoDTO().castEmpleadoDTO(e1),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUno(@PathVariable(name = "id")int id){
        Empleado e1= servicio.mostrarUno(id);
        if (e1==null){
            throw new Excepcion("Empleado no encontrado "+id);
        }
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping
    public ResponseEntity<List<EmpleadoDTO>> mostrarTodos(){
       List<Empleado> empleadosBBDD= servicio.mostrarTodos();
       List<EmpleadoDTO> EmpleadosDTO= new ArrayList<>();
        for (Empleado elemento:
             empleadosBBDD) {
            EmpleadosDTO.add((new EmpleadoDTO()).castEmpleadoDTO(elemento));
        }
        return new ResponseEntity<>(EmpleadosDTO,HttpStatus.OK);
    }
@GetMapping("/resumen")
    public ResponseEntity<List<ResumenDTO>> sueldopromedio() throws Exception {
        return new ResponseEntity<>(servicio.sueldoPromedio(),HttpStatus.OK);
    }
}
