package com.corenetworks._Enero_EjemploControladores.servicio;

import com.corenetworks._Enero_EjemploControladores.modelo.Carrito;

import java.util.List;

public interface ICarritoServicio {
    Carrito obtenerUno(int id);
    List<Carrito>ObtenerTodos();
    Carrito insertarUno(Carrito c1);
    Carrito modificarUno(Carrito c1);
    void Eliminar(int id);
}
