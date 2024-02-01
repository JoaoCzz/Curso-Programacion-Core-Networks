package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;

import java.util.List;

public interface ICRUD <T,ID>{
    T BuscarPorId(ID id);
    List<T> BuscarTodos();

    T crear(T t);
    T editar(T t);
    void eliminar(ID id);
}
