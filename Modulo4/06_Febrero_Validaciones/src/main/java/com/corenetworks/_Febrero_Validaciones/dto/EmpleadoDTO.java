package com.corenetworks._Febrero_Validaciones.dto;

import com.corenetworks._Febrero_Validaciones.modelo.Empleado;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpleadoDTO {
    private int idEmpleado;
    @NotEmpty
    @Size(min = 3,max = 60)
    private String nombreEmpleado;
    @NotNull
    private String dni;
    @Min(400)
    @Max(32000)
    private double sueldo;

    public Empleado castEmpleado(){
        Empleado e1= new Empleado();
        e1.setIdEmpleados(idEmpleado);
        e1.setNombre(nombreEmpleado);
        e1.setDni(dni);
        e1.setSueldo(sueldo);
        return e1;
    }

    public  EmpleadoDTO castEmpleadoDTO(Empleado e){
        idEmpleado=e.getIdEmpleados();
        nombreEmpleado=e.getNombre();
        dni=e.getDni();
        sueldo=e.getSueldo();
        return this;
    }
}
