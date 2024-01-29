package com.corenetworks._Enero_EjemploControladores.servicio;

import com.corenetworks._Enero_EjemploControladores.modelo.Cliente;
import com.corenetworks._Enero_EjemploControladores.repositorio.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IClienteServicioimpl implements IClienteServicio{
@Autowired
    private IClienteRepositorio clienteRepositorio;
    @Override
    public Cliente insertarUno(Cliente cl) {
        return clienteRepositorio.save(cl);
    }

    @Override
    public Cliente modificarUno(Cliente cl) {
        return clienteRepositorio.save(cl);
    }

    @Override
    public void EliminarUno(int id) {
        clienteRepositorio.deleteById(id);
    }


    @Override
    public Cliente buscarUno(int id) {
        return clienteRepositorio.findById(id).orElse(new Cliente());
    }

    @Override
    public List<Cliente> Todos() {
        return clienteRepositorio.findAll();
    }
}
