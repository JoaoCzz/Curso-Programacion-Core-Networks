package com.corenetworks.Capas.servicio;

import com.corenetworks.Capas.modelo.Pedido;
import com.corenetworks.Capas.repositorio.IPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IPedidoServicioimpl implements IPedidoServicio{
    @Autowired
    private IPedidoRepositorio repositorio;
    @Override
    public Pedido insertar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public Pedido modificar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Pedido obtenerUno(int id) {
        return repositorio.findById(id).orElse(new Pedido());
    }

    @Override
    public List<Pedido> obtenerTodos() {
        return repositorio.findAll();
    }
}
