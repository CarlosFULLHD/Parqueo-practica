package com.tarea.marcos.service;

import com.tarea.marcos.dto.ReservaDto;
import com.tarea.marcos.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaService {
    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }
    //Mostrar todas las reservas
    public List<ReservaDto> getAllReservas(){
        return reservaRepository.findAll().stream()
                .map(reserva -> new ReservaDto(
                        reserva.getUsuario().getNombre(),
                        reserva.getVehiculo().getPlaca(),
                        reserva.getEstado()
                ))
                .collect(Collectors.toList());
    }
}
