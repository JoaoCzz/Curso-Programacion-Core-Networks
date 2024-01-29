package com.corenetworks._Enero_CardinalidadesRepaso.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "editoriales")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;
    @Column(length = 30,nullable = false)
    private String Direccion;
    @Column(length = 30,nullable = false)
    private String nombreEditorial;
    @OneToMany(mappedBy = "editorial",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   private List<Libro> Libros;


}
