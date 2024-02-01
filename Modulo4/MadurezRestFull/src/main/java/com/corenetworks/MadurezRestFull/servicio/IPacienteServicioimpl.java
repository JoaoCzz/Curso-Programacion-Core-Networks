package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.modelo.Paciente;
import com.corenetworks.MadurezRestFull.repositorio.IGeneralRepositorio;
import com.corenetworks.MadurezRestFull.repositorio.IPacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPacienteServicioimpl extends CRUDimpl<Paciente,Integer>  implements IPacienteServicio{
    @Autowired
    private IPacienteRepositorio repo;


    @Override
    protected IGeneralRepositorio<Paciente, Integer> getRepo() {
        return repo;
    }
}
