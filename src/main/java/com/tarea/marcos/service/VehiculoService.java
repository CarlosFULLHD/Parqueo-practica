package com.tarea.marcos.service;

import com.tarea.marcos.dto.VehiculoDto;
import com.tarea.marcos.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehiculoService {
    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }
    //Mostrar todos los vehiculos
    public List<VehiculoDto> getAllVehiculos(){
        return vehiculoRepository.findAll().stream()
                .map(vehiculo -> new VehiculoDto(
                        vehiculo.getPlaca(),
                        vehiculo.getTipo(),
                        vehiculo.isActivo()
                ))
                .collect(Collectors.toList());
    }
}
