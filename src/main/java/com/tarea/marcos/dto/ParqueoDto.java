package com.tarea.marcos.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParqueoDto {
    private String ubicacion;
    private boolean disponible;
    private double tarifaHora;
}