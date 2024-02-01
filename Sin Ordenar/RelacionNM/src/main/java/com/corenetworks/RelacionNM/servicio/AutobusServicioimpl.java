package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.repositorio.IAutobusRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutobusServicioimpl implements IAutobusServicio{
    @Autowired
    IAutobusRepositorio repo;
    @Override
    public Autobus insertar(Autobus a) {
        return repo.save(a);
    }

    @Override
    public Autobus modificar(Autobus a) {
        return repo.save(a);
    }

    @Override
    public void Eliminar(String matricula) {
        repo.deleteById(matricula);

    }

    @Override
    public List<Autobus> obtenerTodos() {
        return repo.findAll();
    }

    @Override
    public Autobus obtenerUno(String matricula) {
        return repo.findById(matricula).orElse(new Autobus());
    }
}
