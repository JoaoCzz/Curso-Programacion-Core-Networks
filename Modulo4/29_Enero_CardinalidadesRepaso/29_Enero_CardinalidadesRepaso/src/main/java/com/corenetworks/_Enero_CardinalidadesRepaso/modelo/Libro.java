package com.corenetworks._Enero_CardinalidadesRepaso.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @Column(length = 20)
    private String isbn;
    @Column(nullable = false,length = 60)
    private String autor;
    @Column(nullable = false)
    private double precio;
    @Column(nullable = false,length = 60)
    private String titulo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_editorial",nullable = false,foreignKey = @ForeignKey(name = "FK_libros_editoriales"))
    private Editorial editorial;
}
