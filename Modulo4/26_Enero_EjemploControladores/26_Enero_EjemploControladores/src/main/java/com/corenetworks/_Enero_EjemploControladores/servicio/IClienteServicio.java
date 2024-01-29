package com.corenetworks._Enero_EjemploControladores.servicio;

import com.corenetworks._Enero_EjemploControladores.modelo.Carrito;
import com.corenetworks._Enero_EjemploControladores.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
Cliente insertarUno(Cliente cl);
Cliente modificarUno(Cliente cl);
void EliminarUno(int id);
Cliente buscarUno(int id);
List <Cliente> Todos();
}
