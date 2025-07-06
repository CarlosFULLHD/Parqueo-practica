package herencia;

//Superclase - Padre
// Padre de las clases Moto, Auto, Bicicleta
public class Vehiculo {
    protected String marca;
    protected int anio;

    // TOYOTA
    // 2020


    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca+ "\nAnio: " + anio);
        // Para salto de linea

        // Marca:
        // Anio:
    }


}
