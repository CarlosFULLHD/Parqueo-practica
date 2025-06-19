package InventarioMap;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductoMain {
    public static void main(String[] args) {
        //Crear lista
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Cocacola", "Bebidas", 1.5, 200, true));
        productos.add(new Producto("Fanta", "Bebidas", 1.5, 190, true));
        productos.add(new Producto("Sprite", "Bebidas", 1.6, 150, true));
        productos.add(new Producto("Aquarius", "Bebidas", 1.9, 0, false));
        productos.add(new Producto("Pan", "Panaderia", 0.80, 250, true));
        productos.add(new Producto("Croaisant", "Panaderia", 1, 100, true));
        productos.add(new Producto("Donut", "Panaderia", 1.20, 110, true));
        productos.add(new Producto("Ensaimada", "Panaderia", 1.30, 0, false));
        productos.add(new Producto("Leche", "Lacteos", 0.90, 250, true));
        productos.add(new Producto("Queso", "Lacteos", 2.5, 120, true));
        productos.add(new Producto("Yogurt", "Lacteos", 1.70, 0, false));
        productos.add(new Producto("Patatas", "Snacks", 0.95, 180, true));
        productos.add(new Producto("Gusanitos", "Snacks", 0.75, 0, false));
        //Convertir lista en Map
        Map<String, Producto> mapa = productos.stream()
                .collect(Collectors.toMap(
                        Producto::getNombre,
                        p -> p,
                        (a, b) -> a
                ));
        //Filtrar productos activos
        List<Producto> activos = productos.stream()
                .filter(Producto::isActivo)
                .collect(Collectors.toList());
        //Mostrar los productos activos
        System.out.println("Productos activos: ");
        activos.forEach(System.out::println);
        //Agrupar productos por categoria
        Map<String, List<Producto>> agrupados = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));
        //Recorremos el Map
        agrupados.forEach((categoria, listaproductos) -> {
            System.out.println("Categoria: " + categoria);
            listaproductos.forEach(p -> p.mostrar());
        });
        //Buscar productos caros (+ de 1.2) y con poco stock (- de 100)
        List<Producto> filtradoAvanzado = productos.stream()
                .filter(p -> p.getPrecio() > 1.2 && p.getStock() < 100)
                .collect(Collectors.toList());
        //Mostrar productos filtrado avanzado
        System.out.println("Productos especificos precio y stock: ");
        filtradoAvanzado.forEach(System.out::println);
        //Bonus entrada producto por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        if (mapa.containsKey(nombreProducto)) {
            mapa.get(nombreProducto).mostrar();
        } else {
            System.out.println("Prodiucto no encontrado");
        }
    }
}
