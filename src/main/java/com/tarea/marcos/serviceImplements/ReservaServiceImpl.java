package com.tarea.marcos.serviceImplements;

import com.tarea.marcos.dto.ReservaDto;
import com.tarea.marcos.entity.Reserva;
import com.tarea.marcos.exception.NoReservaFoundException;
import com.tarea.marcos.interfaceService.InterfaceReservaService;
import com.tarea.marcos.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaServiceImpl implements InterfaceReservaService {
    private final ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }
    //Mostrar todas las reservas
    public List<ReservaDto> getAllReservas(){
        List<Reserva> reservas = reservaRepository.findAll();
        if(reservas.isEmpty()){
            throw new NoReservaFoundException("No se encontraron reservas");
        }
        return reservas.stream()
                .map(reserva -> new ReservaDto(
                        reserva.getUsuario().getNombre(),
                        reserva.getVehiculo().getPlaca(),
                        reserva.getEstado()
                ))
                .collect(Collectors.toList());
    }
}
