package com.corenetworks._Enero_EjemploControladores.servicio;

import com.corenetworks._Enero_EjemploControladores.modelo.Carrito;
import com.corenetworks._Enero_EjemploControladores.repositorio.ICarritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ICarritoServicioimpl implements ICarritoServicio{
    @Autowired
    private ICarritoRepositorio iCarritoRepositorio;
    @Override
    public Carrito obtenerUno(int id) {
        return iCarritoRepositorio.findById(id).orElse(new Carrito());
    }

    @Override
    public List<Carrito> ObtenerTodos() {
        return iCarritoRepositorio.findAll();
    }

    @Override
    public Carrito insertarUno(Carrito c1) {
        return iCarritoRepositorio.save(c1);
    }

    @Override
    public Carrito modificarUno(Carrito c1) {
        return iCarritoRepositorio.save(c1);
    }

    @Override
    public void Eliminar(int id) {
iCarritoRepositorio.deleteById(id);
    }
}
