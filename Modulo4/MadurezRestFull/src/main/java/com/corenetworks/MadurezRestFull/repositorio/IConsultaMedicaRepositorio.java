package com.corenetworks.MadurezRestFull.repositorio;

import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.MadurezRestFull.servicio.ICRUD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsultaMedicaRepositorio extends IGeneralRepositorio <ConsultaMedica,Integer> {
}
