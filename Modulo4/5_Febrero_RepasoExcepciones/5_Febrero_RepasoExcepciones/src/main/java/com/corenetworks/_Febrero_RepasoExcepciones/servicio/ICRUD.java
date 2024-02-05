package com.corenetworks._Febrero_RepasoExcepciones.servicio;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


public interface ICRUD<T,ID> {
    List<T> mostrarTodos() throws Exception;
    T mostrarUno(ID id) throws Exception;

    T crear(T t) throws Exception;

    T modificar(T t) throws Exception;

    void eliminar(ID id) throws Exception;
}
