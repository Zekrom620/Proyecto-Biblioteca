package com.biblioteca.cl.pruebaBiblioteca.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Autor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_autor;

    @Column(nullable = false)
    private String priNombre;

    @Column(nullable = false)
    private String segNombre;

    @Column(nullable = false)
    private String apePaterno;

    @Column(nullable = false)
    private String apeMaterno;
}