package com.corenetworks._Febrero_Validaciones.servicio.impl;

import com.corenetworks._Febrero_Validaciones.repositorio.iGenericoRespositorio;
import com.corenetworks._Febrero_Validaciones.servicio.ICRUD;

import java.util.List;

public abstract class CRUDimpl <T,ID> implements ICRUD<T,ID>  {
    protected abstract iGenericoRespositorio<T,ID> getRepo();
    @Override
    public T crear(T t) {
        return getRepo().save(t);
    }

    @Override
    public T modificar(T t) {
        return getRepo().save(t);
    }

    @Override
    public List<T> mostrarTodos() {
        return getRepo().findAll();
    }

    @Override
    public T mostrarUno(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);
    }




}
