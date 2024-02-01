package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Lugar;
import com.corenetworks.RelacionNM.repositorio.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LugarSservicioimpl implements ILugarServicio{
    @Autowired
    ILugarRepositorio repo;
    @Override
    public Lugar insertar(Lugar l) {
        return repo.save(l);
    }

    @Override
    public Lugar modificar(Lugar l) {
        return repo.save(l);
    }

    @Override
    public void Eliminar(int idLugar) {
repo.deleteById(idLugar);
    }

    @Override
    public List<Lugar> obtenerTodos() {
        return repo.findAll();
    }

    @Override
    public Lugar obtenerUno(int idLugar) {
        return repo.findById(idLugar).orElse(new Lugar());
    }
}
