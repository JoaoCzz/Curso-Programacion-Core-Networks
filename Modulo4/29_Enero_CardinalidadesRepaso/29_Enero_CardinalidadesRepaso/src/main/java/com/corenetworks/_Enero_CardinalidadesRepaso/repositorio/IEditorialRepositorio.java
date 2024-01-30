package com.corenetworks._Enero_CardinalidadesRepaso.repositorio;

import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Editorial;
import com.corenetworks._Enero_CardinalidadesRepaso.modelo.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEditorialRepositorio extends JpaRepository <Editorial,Integer> {
    @Query("from Editorial e where e.Direccion = :direccion")
    List<Editorial> filtroPorDireccion(@Value("direccion") String direccion);
    @Query(value = "Select e.id_editorial,direccion,nombre_editorial from editoriales e where e.nombre_editorial= :nombre",nativeQuery = true)
    List<Editorial> filtroporNombre(@Value("nombre")String nombre);
    @Query(value = "Select e.id_editorial,direccion,nombre_editorial from editoriales e where nombre_editorial like :letra%",nativeQuery = true)
    List<Editorial> filtroPorPletras(@Value("letra")char letra);




}
