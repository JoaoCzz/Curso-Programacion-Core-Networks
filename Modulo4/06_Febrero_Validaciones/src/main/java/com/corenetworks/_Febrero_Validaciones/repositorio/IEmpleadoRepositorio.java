package com.corenetworks._Febrero_Validaciones.repositorio;

import com.corenetworks._Febrero_Validaciones.dto.ResumenDTO;
import com.corenetworks._Febrero_Validaciones.modelo.Empleado;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmpleadoRepositorio extends iGenericoRespositorio<Empleado,Integer> {
    @Query(value = "Select count(e.id_empleados) as contador, avg(e.sueldo) as sueldo_promedio\n" +
            "from empleados e",nativeQuery = true)
    List<ResumenDTO> sueldoPromedio() throws Exception;


}
