package com.corenetworks._Enero_EjemploControladores.repositorio;

import com.corenetworks._Enero_EjemploControladores.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
