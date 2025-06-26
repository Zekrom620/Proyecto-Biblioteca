package com.biblioteca.cl.pruebaBiblioteca.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.cl.pruebaBiblioteca.modelo.Editorial;
import com.biblioteca.cl.pruebaBiblioteca.repositorio.EditorialRepositorioInterface;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorioInterface editRepoInter;

    public Editorial save(Editorial edit) {
        return editRepoInter.save(edit);
    }

    public Editorial findById(Integer id_editorial) {
        return editRepoInter.findById(id_editorial).get();
    }

    public List<Editorial> findAll() {
        return editRepoInter.findAll();
    }

    public void delete(Integer id_editorial) {
        editRepoInter.deleteById(id_editorial);
    }
}