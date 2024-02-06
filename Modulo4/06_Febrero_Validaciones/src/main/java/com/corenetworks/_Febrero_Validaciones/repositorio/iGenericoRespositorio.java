package com.corenetworks._Febrero_Validaciones.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;
@NoRepositoryBean
public interface iGenericoRespositorio<T,ID> extends JpaRepository<T, ID> {
}
