package com.corenetworks._Enero_CardinalidadesRepaso.servicio;

import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Editorial;
import com.corenetworks._Enero_CardinalidadesRepaso.repositorio.IEditorialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IEditorialServicioimpl implements IEditorialServicio{
    @Autowired
    private IEditorialRepositorio ir;
    @Override
    public Editorial insertaUno(Editorial e) {
        return ir.save(e);
    }

    @Override
    public Editorial modificarUno(Editorial e) {
        return ir.save(e);
    }

    @Override
    public void EliminarUno(int id) {
ir.deleteById(id);
    }

    @Override
    public List<Editorial> obtenerTodos() {
        return ir.findAll();
    }

    @Override
    public Editorial BuscarUno(int id) {
        return ir.findById(id).orElse(new Editorial());
    }
}
