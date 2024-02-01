package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAutobusServicio {
    Autobus insertar(Autobus a);
    Autobus modificar (Autobus a);

    void Eliminar (String matricula);

    List <Autobus> obtenerTodos();

    Autobus obtenerUno(String matricula);
}
