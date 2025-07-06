package com.tarea.marcos.herenciaPolimorfismo;

public class Disenador extends Empleado {
    private boolean usaPhotoshop;

    public Disenador(String nombre, int edad, double salario, boolean usaPhotoshop) {
        super(nombre, edad, salario);
        this.usaPhotoshop = usaPhotoshop;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(" Nombre: " + nombre +
                " Edad: " + edad + " Salario: " + salario +
                 " Usa Photoshop " + usaPhotoshop);
    }

}
