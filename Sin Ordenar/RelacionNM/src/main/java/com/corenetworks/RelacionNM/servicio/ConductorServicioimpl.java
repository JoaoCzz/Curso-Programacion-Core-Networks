package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Conductor;
import com.corenetworks.RelacionNM.modelo.Lugar;
import com.corenetworks.RelacionNM.repositorio.IConductorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorServicioimpl implements IConductorServicio{
    @Autowired
    IConductorRepositorio repo;


    @Override
    public Conductor insertar(Conductor c) {
        return repo.save(c);
    }

    @Override
    public Conductor modificar(Conductor c) {
        return repo.save(c);
    }

    @Override
    public void Eliminar(String dni) {
repo.deleteById(dni);
    }

    @Override
    public List<Conductor> obtenerTodos() {
        return repo.findAll();
    }

    @Override
    public Conductor obtenerUno(String dni) {
        return repo.findById(dni).orElse(new Conductor());
    }
}
