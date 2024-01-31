package com.corenetworks.MadurezRestFull.repositorio;

import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsultaMedicaRepositorio extends JpaRepository<ConsultaMedica,Integer> {
}
