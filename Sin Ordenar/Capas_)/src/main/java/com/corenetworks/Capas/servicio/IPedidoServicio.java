package com.corenetworks.Capas.servicio;

import com.corenetworks.Capas.modelo.Pedido;

import java.util.List;

public interface IPedidoServicio {
    Pedido insertar (Pedido p);
    Pedido modificar (Pedido p);
    void eliminar (int id);
    Pedido obtenerUno(int id);
    List <Pedido> obtenerTodos();
}
