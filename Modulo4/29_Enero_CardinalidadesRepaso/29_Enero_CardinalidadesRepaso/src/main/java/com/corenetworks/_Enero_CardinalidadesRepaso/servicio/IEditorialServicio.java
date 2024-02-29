package com.corenetworks._Enero_CardinalidadesRepaso.servicio;

import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Editorial;

import java.util.List;

public interface IEditorialServicio {
//    Editorial insertaUno(Editorial e);
//    Editorial modificarUno(Editorial e);
    void EliminarUno(int id);
    List<Editorial> obtenerTodos();
    Editorial BuscarUno(int id);

    List<Editorial> filtroPorDireccion(String direccion);

    List<Editorial> filtroPorNombre(String nombre);
    List <Editorial> filtroPorLetra(char letra);
}
