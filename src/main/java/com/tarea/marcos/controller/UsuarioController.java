package com.tarea.marcos.controller;

import com.tarea.marcos.dto.UsuarioDto;
import com.tarea.marcos.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDto> getAllUsers() {
        return usuarioService.getAllUsers();
    }
}
