package POO;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductoMap {
    public static void main(String[] args) {
        Map<String, Producto> mapaProductos = new HashMap<>();

        //Agrego tres prductos
        mapaProductos.put("pan", new Producto("Pan", 2, 100));
        mapaProductos.put("agua", new Producto("agua", 1.5, 150));
        mapaProductos.put("cereales", new Producto("cereales", 2.4, 80));

        //Muestro por consola producto pan
        Producto producto = mapaProductos.get("pan");
        producto.mostrarInformacionProducto();

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
        listaProductos.add(new Producto("Chocolate",2.5,120));
        listaProductos.add(new Producto("galleta",1,90));
        listaProductos.add(new Producto("zumo",1.10,100));
        listaProductos.add(new Producto("vino",3,100));
        listaProductos.add(new Producto("cerveza",1.10,150));

        Map<String,Producto> mapaProductos2 = new HashMap<>();
        //Acceso directo producto con map


    }
}
