package com.tarea.marcos.service;

import com.tarea.marcos.dto.ParqueoDto;
import com.tarea.marcos.repository.ParqueoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParqueoService{

//    Tarea 2:
//    Crear el método getAllParqueos() que haga:
//
//    Obtener lista de Parqueo del repository y
//
//    Convertirla a ParqueoDto con .stream().map().collect(...).
//
private final ParqueoRepository parqueoRepository;

    public ParqueoService(ParqueoRepository parqueoRepository) {
        this.parqueoRepository = parqueoRepository;
    }

    public List<ParqueoDto> getAllParqueos() {

        return parqueoRepository.findAll().stream()
                .map(parqueo -> new ParqueoDto(
                        parqueo.getUbicacion(),
                        parqueo.isDisponible(),
                        parqueo.getTarifaHora()
                ))
                .collect(Collectors.toList());
    }
}
