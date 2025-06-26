package com.biblioteca.cl.pruebaBiblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.biblioteca.cl.pruebaBiblioteca.modelo.Editorial;
import com.biblioteca.cl.pruebaBiblioteca.servicio.EditorialServicio;

@RestController
@RequestMapping("/api/v3/editorial")
public class EditorialControlador {

    @Autowired
    private EditorialServicio editServ;

    @PostMapping()
    public ResponseEntity<Editorial> agregarEditorial(@RequestBody Editorial edito1) {
        Editorial edit1 = editServ.save(edito1);
        return ResponseEntity.status(HttpStatus.CREATED).body(edit1);
    }

    @PutMapping("/{id_editorial}")
    public ResponseEntity<Editorial> acutualizarEditorial(@PathVariable Integer id_editorial, @RequestBody Editorial edito2) {
        try {
            Editorial edit2 = editServ.findById(id_editorial);
            edit2.setNomEditorial(edito2.getNomEditorial());

            editServ.save(edit2);
            return ResponseEntity.ok(edito2);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id_editorial}")
    public ResponseEntity<Editorial> buscarEditorialEspecifica(@PathVariable Integer id_editorial) {
        try {
            Editorial edit3 = editServ.findById(id_editorial);
            return ResponseEntity.ok(edit3);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<Editorial>> listarEditoriales() {
        List<Editorial> edit4 = editServ.findAll();
        if (edit4.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(edit4);
    }

    @DeleteMapping("/{id_editorial}")
    public ResponseEntity<?> eliminarEditorial(@PathVariable Integer id_editorial) {
        try {
            editServ.delete(id_editorial);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}