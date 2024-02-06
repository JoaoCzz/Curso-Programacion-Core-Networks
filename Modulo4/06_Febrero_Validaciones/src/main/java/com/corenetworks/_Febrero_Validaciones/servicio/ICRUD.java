package com.corenetworks._Febrero_Validaciones.servicio;

import java.util.List;

public interface ICRUD <T,ID>{

    T crear(T t);
    T modificar (T t);
    List<T> mostrarTodos();
    T mostrarUno( ID id);
    void eliminar( ID id);
}
