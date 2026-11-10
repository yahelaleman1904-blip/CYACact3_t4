package com.yahel.crud_act3.service;

import com.yahel.crud_act3.entity.Consola;
import com.yahel.crud_act3.repository.ConsolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsolaService {

    @Autowired
    private ConsolaRepository consolaRepository;

    public List<Consola> obtenerTodas() {
        return consolaRepository.findAll();
    }

    public Consola guardar(Consola consola) {
        return consolaRepository.save(consola);
    }
}