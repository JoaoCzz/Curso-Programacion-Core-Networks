package com.corenetworks._Febrero_Validaciones.servicio;

import com.corenetworks._Febrero_Validaciones.dto.ResumenDTO;
import com.corenetworks._Febrero_Validaciones.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio extends ICRUD<Empleado,Integer> {
    List<ResumenDTO> sueldoPromedio() throws Exception;
}
