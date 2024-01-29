package com.corenetworks._Enero_EjemploControladores.repositorio;

import com.corenetworks._Enero_EjemploControladores.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarritoRepositorio extends JpaRepository<Carrito,Integer> {
}
