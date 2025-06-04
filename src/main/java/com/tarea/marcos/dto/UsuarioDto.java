package com.tarea.marcos.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDto implements Serializable {
    private String nombre;
    private String correo;
    private String rol;
}