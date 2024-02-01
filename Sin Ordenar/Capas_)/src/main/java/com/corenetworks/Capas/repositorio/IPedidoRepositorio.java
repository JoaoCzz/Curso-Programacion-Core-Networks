package com.corenetworks.Capas.repositorio;

import com.corenetworks.Capas.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepositorio extends JpaRepository<Pedido,Integer> {
}
