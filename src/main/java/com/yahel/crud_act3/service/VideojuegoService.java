package com.yahel.crud_act3.service;

import com.yahel.crud_act3.entity.Videojuego;
import com.yahel.crud_act3.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;

    public List<Videojuego> obtenerTodos() {
        return videojuegoRepository.findAll();
    }

    public Optional<Videojuego> obtenerPorId(Long id) {
        return videojuegoRepository.findById(id);
    }

    public Videojuego guardar(Videojuego videojuego) {
        return videojuegoRepository.save(videojuego);
    }

    public void eliminar(Long id) {
        videojuegoRepository.deleteById(id);
    }
}