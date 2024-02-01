package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Lugar;

import java.util.List;

public interface ILugarServicio {
    Lugar insertar(Lugar l);
    Lugar modificar (Lugar l);

    void Eliminar (int idLugar);

    List<Lugar> obtenerTodos();

    Lugar obtenerUno(int idLugar);
}
