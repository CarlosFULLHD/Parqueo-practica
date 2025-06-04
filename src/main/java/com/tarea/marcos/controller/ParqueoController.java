package com.tarea.marcos.controller;


import com.tarea.marcos.dto.ParqueoDto;
import com.tarea.marcos.service.ParqueoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parqueos")
@RequiredArgsConstructor
public class ParqueoController {

    private final ParqueoService parqueoService;

    @GetMapping
    public List<ParqueoDto> getAllParqueos() {
        return parqueoService.getAllParqueos();
    }
}
