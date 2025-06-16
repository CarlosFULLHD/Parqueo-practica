package POO;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductoMap {
    public static void main(String[] args) {
        Map<String, Producto> mapaProductos = new HashMap<>();

        //Agrego tres productos
        mapaProductos.put("pan", new Producto("Pan", 2, 100,"Panaderia"));
        mapaProductos.put("agua", new Producto("agua", 1.5, 150,"Bebidas"));
        mapaProductos.put("cereales", new Producto("cereales", 2.4, 80,"Dulces"));

      //Muestro por consola producto pan
    //    Producto producto = mapaProductos.get("pan");
    //    producto.mostrarInformacionProducto();

        //Elimino el producto agua
        Producto eliminado = mapaProductos.remove("agua");
        System.out.println("Producto eliminado con exito " + eliminado);

        //Verificar si exixte producto llamado agua
        if(mapaProductos.containsKey("cereales")){
            System.out.println("El producto cereales exixte ");
        }else{
            System.out.println("El producto cereales no existe");
        }

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Chocolate",2.5,120,"Dulces"));
        listaProductos.add(new Producto("galleta",1,90,"Dulces"));
        listaProductos.add(new Producto("zumo",1.10,100,"Refrescos"));
        listaProductos.add(new Producto("vino",3,100,"Bebidas"));
        listaProductos.add(new Producto("cerveza",1.10,150,"Bebidas"));

        Map<String,Producto> mapa = listaProductos.stream()
                .collect(Collectors.toMap(
                        Producto::getNombre,
                        producto -> producto
                ));
        //Acceso directo producto con map
        Producto producto = mapa.get("Chocolate");
        System.out.println(producto);

    //Agrgar productos por categoria
    ArrayList<Producto>listaProductos2 = new ArrayList<>();
    listaProductos2.add(new Producto("Donuts",2,150,"Dulces"));
    listaProductos2.add(new Producto("Ensaimadas",1,120,"Dulces"));
    listaProductos2.add(new Producto("Vino",8,150,"Bebidas"));
    listaProductos2.add(new Producto("Cerveza",2,130,"Bebidas"));
    listaProductos2.add(new Producto("Manzana",1,200,"Frutas"));
    listaProductos2.add(new Producto("Pera",1.2,150,"Frutas"));

    //Agrupo los productos por categoria
    Map<String, List<Producto>> productosPorCategoria = listaProductos2.stream()
            .collect(Collectors.groupingBy(Producto::getCategoria));
    //Mostrar todos los productos por catergoria
        productosPorCategoria.forEach((categoria, productos) ->{
            System.out.println("Categoria: " + categoria);
            productos.forEach(p -> p.mostrarInformacionProducto());
                });


    }


}
