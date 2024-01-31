package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.modelo.ConsultaMedica;

import java.util.List;

public interface IConsultaMedicaServicio {
    ConsultaMedica FindConsultaforID(int id);
    List <ConsultaMedica> FindAllConsultas();

    ConsultaMedica insertConsulta(ConsultaMedica c);
    ConsultaMedica EditConsulta(ConsultaMedica c);
    void DeleteConsulta(int id);
}
