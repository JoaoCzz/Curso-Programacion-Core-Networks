package com.corenetworks._Febrero_RepasoExcepciones.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;
@NoRepositoryBean
public interface IGenericoRepositorio<T,ID> extends JpaRepository<T, ID> {
}
