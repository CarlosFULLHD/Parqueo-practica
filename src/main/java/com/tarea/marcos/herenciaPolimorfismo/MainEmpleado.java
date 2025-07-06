package com.tarea.marcos.herenciaPolimorfismo;

import java.util.ArrayList;

public class MainEmpleado {
    public static void main(String[] args) {
        //Creamos lista objetos para mostar pantalla
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Disenador("Ana", 28, 3000, true));
        empleados.add(new Programador("Carlos", 30, 3500, "Java"));
        empleados.add(new Disenador("Marta", 35, 3100,true));
        empleados.add(new Programador("Luis", 26, 3200, "Python"));
        //Polimorfismo mostrar informacion x objeto
        for (Empleado e : empleados){
            e.mostrarInformacion();
        }

    }
}
