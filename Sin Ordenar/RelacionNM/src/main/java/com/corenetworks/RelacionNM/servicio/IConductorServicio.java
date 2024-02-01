package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Conductor;

import java.util.List;

public interface IConductorServicio {
    Conductor insertar(Conductor c);
    Conductor modificar (Conductor c);

    void Eliminar (String dni);

    List<Conductor> obtenerTodos();

    Conductor obtenerUno(String dni);
}
