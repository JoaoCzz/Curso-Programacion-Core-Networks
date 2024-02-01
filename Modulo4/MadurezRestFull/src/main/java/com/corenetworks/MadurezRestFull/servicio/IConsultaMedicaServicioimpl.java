package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.MadurezRestFull.repositorio.IConsultaMedicaRepositorio;
import com.corenetworks.MadurezRestFull.repositorio.IGeneralRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class IConsultaMedicaServicioimpl extends CRUDimpl<ConsultaMedica,Integer>  implements IConsultaMedicaServicio{

    @Autowired
    private IConsultaMedicaRepositorio repo;


    @Override
    protected IGeneralRepositorio<ConsultaMedica, Integer> getRepo() {
        return repo;
    }
}
