package com.tarea.marcos.controller;

import com.tarea.marcos.dto.VehiculoDto;
import com.tarea.marcos.serviceImplements.VehiculoServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    private final VehiculoServiceImpl vehiculoService;

    public VehiculoController(VehiculoServiceImpl vehiculoService) {
        this.vehiculoService = vehiculoService;
    }
    @GetMapping
    public List<VehiculoDto> getAllVehiculos(){
        return vehiculoService.getAllVehiculos();
    }
}
