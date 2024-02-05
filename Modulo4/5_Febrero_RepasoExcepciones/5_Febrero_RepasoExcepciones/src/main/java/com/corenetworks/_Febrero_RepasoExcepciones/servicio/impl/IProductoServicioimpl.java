package com.corenetworks._Febrero_RepasoExcepciones.servicio.impl;

import com.corenetworks._Febrero_RepasoExcepciones.modelo.Producto;
import com.corenetworks._Febrero_RepasoExcepciones.repositorio.IGenericoRepositorio;
import com.corenetworks._Febrero_RepasoExcepciones.repositorio.IProductoRepositorio;
import com.corenetworks._Febrero_RepasoExcepciones.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProductoServicioimpl extends CRUDimpl<Producto,Integer> implements IProductoServicio{
    @Autowired
    private IProductoRepositorio repo;
    @Override
    protected IGenericoRepositorio<Producto, Integer> getrepo() {
        return repo;
    }
}
