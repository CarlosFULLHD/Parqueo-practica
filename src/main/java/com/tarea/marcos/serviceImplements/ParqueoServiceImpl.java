package com.tarea.marcos.serviceImplements;

import com.tarea.marcos.dto.ParqueoDto;
import com.tarea.marcos.entity.Parqueo;
import com.tarea.marcos.interfaceService.InterfaceParqueoService;
import com.tarea.marcos.repository.ParqueoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParqueoServiceImpl implements InterfaceParqueoService {

//    Tarea 2:
//    Crear el método getAllParqueos() que haga:
//
//    Obtener lista de Parqueo del repository y
//
//    Convertirla a ParqueoDto con .stream().map().collect(...).
//
private final ParqueoRepository parqueoRepository;

    public ParqueoServiceImpl(ParqueoRepository parqueoRepository) {
        this.parqueoRepository = parqueoRepository;
    }

    public List<ParqueoDto> getAllParqueos() {
        List<Parqueo> parqueos = parqueoRepository.findAll();
        if(parqueos.isEmpty()) {
            throw new RuntimeException("No hay parqueos disponibles");
        }
            return parqueos.stream()
                    .map(parqueo -> new ParqueoDto(
                            parqueo.getUbicacion(),
                            parqueo.isDisponible(),
                            parqueo.getTarifaHora()
                    ))
                    .collect(Collectors.toList());
        }
    }
