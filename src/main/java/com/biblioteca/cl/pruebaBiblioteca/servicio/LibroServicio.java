package com.biblioteca.cl.pruebaBiblioteca.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biblioteca.cl.pruebaBiblioteca.modelo.Libro;
import com.biblioteca.cl.pruebaBiblioteca.repositorio.LibroRepositorioInterface;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibroServicio {

    @Autowired
    private LibroRepositorioInterface libRepoInter;

    public Libro save(Libro lib){
        return libRepoInter.save(lib);
    }

    public Libro findById(Integer id_libro){
        return libRepoInter.findById(id_libro).get();
    }

    public List<Libro> findAll(){
        return libRepoInter.findAll();
    }

    public void delete(Integer id_libro){
        libRepoInter.deleteById(id_libro);
    }
}