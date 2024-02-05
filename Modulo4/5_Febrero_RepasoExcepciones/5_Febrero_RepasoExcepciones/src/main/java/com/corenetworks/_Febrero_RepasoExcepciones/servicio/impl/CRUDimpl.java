package com.corenetworks._Febrero_RepasoExcepciones.servicio.impl;

import com.corenetworks._Febrero_RepasoExcepciones.repositorio.IGenericoRepositorio;
import com.corenetworks._Febrero_RepasoExcepciones.servicio.ICRUD;

import java.util.List;

public abstract class CRUDimpl<T,ID>  implements ICRUD <T,ID> {
    protected abstract IGenericoRepositorio<T,ID> getrepo();
    @Override
    public List<T> mostrarTodos() throws Exception {
        return getrepo().findAll();
    }

    @Override
    public T mostrarUno(ID id) throws Exception {
        return getrepo().findById(id).orElse(null);
    }

    @Override
    public T crear(T t) throws Exception {
        return getrepo().save(t);
    }

    @Override
    public T modificar(T t) throws Exception {
        return getrepo().save(t);
    }

    @Override
    public void eliminar(ID id) throws Exception {
          getrepo().deleteById(id);
    }


}
