package com.yahel.crud_act3.controller;

import com.yahel.crud_act3.entity.Consola;
import com.yahel.crud_act3.service.ConsolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consolas")
public class ConsolaController {

    @Autowired
    private ConsolaService consolaService;

    // Obtener todas las consolas
    @GetMapping
    public List<Consola> listar() {
        return consolaService.obtenerTodas();
    }

    // Crear una nueva consola
    @PostMapping
    public Consola crear(@RequestBody Consola consola) {
        return consolaService.guardar(consola);
    }
}