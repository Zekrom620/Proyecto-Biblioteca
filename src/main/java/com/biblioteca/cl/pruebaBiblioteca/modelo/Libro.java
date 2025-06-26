package com.biblioteca.cl.pruebaBiblioteca.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Table(name= "Libro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_libro;

    @Column(unique = true, length = 20, nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private LocalDate fechaIng;

    @Column(nullable = false)
    private int publicacion;

    @ManyToOne
    @JoinColumn(name = "id_editorial", nullable = false)
    private Editorial edito;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;
}