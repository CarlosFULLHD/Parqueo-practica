package com.tarea.marcos.herenciaPolimorfismo;

public class Programador extends Empleado {
    private String lenguajePrincipal;

    public Programador(String nombre, int edad, double salario, String lenguajePrincipal) {
        super(nombre, edad, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println(" Nombre: " + nombre +
                " Edad: " + edad + " Salario: " + salario +
                " Lenjuage Principal: " + lenguajePrincipal);
    }
}
