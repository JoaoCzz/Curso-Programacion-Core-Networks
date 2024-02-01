package com.corenetworks.MadurezRestFull.repositorio;

import com.corenetworks.MadurezRestFull.modelo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepositorio extends IGeneralRepositorio <Paciente,Integer> {
}
