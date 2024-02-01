package com.corenetworks.MadurezRestFull.servicio;

import com.corenetworks.MadurezRestFull.modelo.Medico;
import com.corenetworks.MadurezRestFull.repositorio.IGeneralRepositorio;
import com.corenetworks.MadurezRestFull.repositorio.IMedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMedicoimpl extends CRUDimpl<Medico,Integer> implements IMedicoServicio {
    @Autowired
    IMedicoRepositorio repo;
    @Override
    protected IGeneralRepositorio<Medico, Integer> getRepo() {
        return repo;
    }
}
