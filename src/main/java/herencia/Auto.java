package herencia;

import org.apache.logging.log4j.spi.ReadOnlyThreadContextMap;

// Subclase - clase hija
public class Auto extends Vehiculo {
    // no atributos
    private int puertas;
    // 2, 4, 8


    public Auto(String marca, int anio, int puertas) {
        super(marca, anio);
        this.puertas = puertas;
    }

    //Sobre escribir
    @Override
    public void mostrarInformacion() {
        System.out.println("Este auto es:" + "Marca: " +
                marca+ "\nAnio: " +
                anio + "\ncantidad de puertas: " +
                puertas);
        // Para salto de linea

        // Marca:
        // Anio:
    }

}
