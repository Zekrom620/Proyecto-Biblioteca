package com.biblioteca.cl.pruebaBiblioteca.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.cl.pruebaBiblioteca.modelo.Autor;
import com.biblioteca.cl.pruebaBiblioteca.repositorio.AutorRepositorioInterface;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorioInterface autRepoInter;

    public Autor save(Autor aut) {
        return autRepoInter.save(aut);
    }

    public Autor findById(Integer id_autor) {
        return autRepoInter.findById(id_autor).get();
    }

    public List<Autor> findAll() {
        return autRepoInter.findAll();
    }

    public void delete(Integer id_autor) {
        autRepoInter.deleteById(id_autor);
    }
}