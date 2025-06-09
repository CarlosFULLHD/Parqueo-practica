package com.tarea.marcos.controller;

import com.tarea.marcos.dto.ReservaDto;
import com.tarea.marcos.service.ReservaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")

public class ReservaController {
    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }
    //Obtener todas las resrvas
    @GetMapping
    public List<ReservaDto> getAllReservas(){
        return  reservaService.getAllReservas();
    }
}
