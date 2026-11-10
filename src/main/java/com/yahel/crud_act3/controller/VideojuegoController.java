package com.yahel.crud_act3.controller;

import com.yahel.crud_act3.entity.Videojuego;
import com.yahel.crud_act3.service.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoService videojuegoService;

    // 1. LEER (GET) - Obtener todos
    @GetMapping
    public List<Videojuego> listar() {
        return videojuegoService.obtenerTodos();
    }

    // LEER (GET) - Obtener por ID
    @GetMapping("/{id}")
    public Videojuego obtenerPorId(@PathVariable Long id) {
        return videojuegoService.obtenerPorId(id).orElse(null);
    }

    // 2. CREAR (POST)
    @PostMapping
    public Videojuego crear(@RequestBody Videojuego videojuego) {
        return videojuegoService.guardar(videojuego);
    }

    // 3. ACTUALIZAR (PUT)
    @PutMapping("/{id}")
    public Videojuego actualizar(@PathVariable Long id, @RequestBody Videojuego videojuego) {
        Videojuego existente = videojuegoService.obtenerPorId(id).orElse(null);
        if (existente != null) {
            existente.setTitulo(videojuego.getTitulo());
            existente.setGenero(videojuego.getGenero());
            existente.setConsola(videojuego.getConsola());
            return videojuegoService.guardar(existente);
        }
        return null;
    }

    // 4. ELIMINAR (DELETE)
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        videojuegoService.eliminar(id);
    }
}