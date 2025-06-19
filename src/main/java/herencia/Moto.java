package herencia;
// Subclase - clase hija
public class Moto extends Vehiculo {
    private boolean tieneCasco;

    public Moto(String marca, int anio, boolean tieneCasco) {
        super(marca, anio);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto: "+
                "Marca: " + marca+
                "\nAnio: " + anio+
                "Tiene casco: " + tieneCasco);
        // Para salto de linea

        // Marca:
        // Anio:
    }

}
