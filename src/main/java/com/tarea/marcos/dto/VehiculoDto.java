package com.tarea.marcos.dto;

public class VehiculoDto {
    private String placa;
    private String tipo;
    private boolean activo;

    public VehiculoDto() {
    }

    public VehiculoDto(String placa, String tipo, boolean activo) {
        this.placa = placa;
        this.tipo = tipo;
        this.activo = activo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
