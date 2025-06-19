package herencia;

// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista de vehículos (polimorfismo)
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("ToYota", 2020, 4));
        vehiculos.add(new Moto("HOnda", 2022, true));
        vehiculos.add(new Auto("Chevrolet", 2018, 2));
        vehiculos.add(new Moto("Yamaha", 2019, false));

        // Polimorfismo: cada objeto usa su propio método mostrarInfo()
        for (Vehiculo v : vehiculos) {
            v.mostrarInformacion();
        }
    }
}
