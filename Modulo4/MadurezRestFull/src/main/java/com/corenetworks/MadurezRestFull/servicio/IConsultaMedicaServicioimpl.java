package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;
import com.corenetworks.MadurezRestFull.repositorio.IConsultaMedicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class IConsultaMedicaServicioimpl implements IConsultaMedicaServicio{
    @Autowired
    private IConsultaMedicaRepositorio repositorio;
    @Override
    public ConsultaMedica FindConsultaforID(int id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public List<ConsultaMedica> FindAllConsultas() {
        return repositorio.findAll();
    }

    @Override
    public ConsultaMedica insertConsulta(ConsultaMedica c) {
        return repositorio.save(c);
    }

    @Override
    public ConsultaMedica EditConsulta(ConsultaMedica c) {
        return repositorio.save(c);
    }

    @Override
    public void DeleteConsulta(int id) {
repositorio.deleteById(id);
    }
}
