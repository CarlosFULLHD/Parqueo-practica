package com.tarea.marcos.dto;

public class ReservaDto {
    private String nombreUsuaio;
    private String placaVehiculo;
    private String estado;

    public ReservaDto() {
    }

    public ReservaDto(String nombreUsuaio, String placaVehiculo, String estado) {
        this.nombreUsuaio = nombreUsuaio;
        this.placaVehiculo = placaVehiculo;
        this.estado = estado;
    }

    public String getNombreUsuaio() {
        return nombreUsuaio;
    }

    public void setNombreUsuaio(String nombreUsuaio) {
        this.nombreUsuaio = nombreUsuaio;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
