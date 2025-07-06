package InventarioMap;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private boolean activo;

    public Producto(String nombre, String categoria, double precio, int stock, boolean activo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrar(){
        System.out.println("Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoría='" + categoria + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", activo=" + activo +
                '}');
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", activo=" + activo +
                '}';
    }
}
