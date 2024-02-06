package com.corenetworks._Febrero_Validaciones.servicio.impl;

import com.corenetworks._Febrero_Validaciones.dto.ResumenDTO;
import com.corenetworks._Febrero_Validaciones.modelo.Empleado;
import com.corenetworks._Febrero_Validaciones.repositorio.IEmpleadoRepositorio;
import com.corenetworks._Febrero_Validaciones.repositorio.iGenericoRespositorio;
import com.corenetworks._Febrero_Validaciones.servicio.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEmpleadoServicioimpl extends CRUDimpl<Empleado,Integer> implements IEmpleadoServicio {
    @Autowired
    private IEmpleadoRepositorio repositorio;
    @Override
    protected iGenericoRespositorio<Empleado, Integer> getRepo() {
        return repositorio;
    }

    @Override
    public List<ResumenDTO> sueldoPromedio() throws Exception {
        return repositorio.sueldoPromedio();
    }
}
