package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.repositorio.IGeneralRepositorio;

import java.util.List;

public abstract class CRUDimpl<T,ID> implements ICRUD<T,ID>{

    protected abstract IGeneralRepositorio<T,ID> getRepo();
    @Override
    public T BuscarPorId(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public List<T> BuscarTodos() {
        return getRepo().findAll();
    }

    @Override
    public T crear(T t) {
        return getRepo().save(t);
    }

    @Override
    public T editar(T t) {
        return getRepo().save(t);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);

    }
}
