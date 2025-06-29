package com.tarea.marcos.serviceImplements;

import com.tarea.marcos.dto.VehiculoDto;
import com.tarea.marcos.interfaceService.InterfaceVehiculoService;
import com.tarea.marcos.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehiculoServiceImpl implements InterfaceVehiculoService {
    private final VehiculoRepository vehiculoRepository;

    public VehiculoServiceImpl(VehiculoRepository vehiculoRepository) {
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
    //Filtrar por vehiculos activos
    public List<VehiculoDto> getVehiculosActivos(){
        return vehiculoRepository.findAll().stream()
                .filter(vehiculo -> vehiculo.isActivo())
                        .map(vehiculo -> new VehiculoDto(
                                vehiculo.getPlaca(),
                                vehiculo.getTipo(),
                                vehiculo.isActivo()
                        ))
                .collect(Collectors.toList());
    }
}
