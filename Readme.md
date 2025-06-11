# 🚀 Proyecto Parqueo API – Marcos Branch

Este proyecto contiene una API REST en Spring Boot conectada a PostgreSQL con Docker. Está preparado para que trabajes únicamente en la capa de servicios (`service/`).

---

## ✅ Instrucciones de instalación

1. **Clonar el repositorio**
```bash
git clone https://github.com/tu-org/parqueo-api.git
```

2. **Cambiar a la rama asignada**

```bash
cd parqueo-api
git checkout marcos-branch
```
3. **Levantar base de datos con Docker**

```bash
docker run -d \
  --name parqueo-db-v2 \
  -e POSTGRES_DB=parkingdb \
  -e POSTGRES_USER=parkuser \
  -e POSTGRES_PASSWORD=parksecret \
  -p 5434:5432 \
  -v parking-data:/var/lib/postgresql/data \
  postgres:17

```

Y despues manualmente inserta datose n la db en la carpeta /db/init.sql


## 🧠 TAREAS – Uso de Map y Stream en Java

Estas tareas te ayudarán a comprender cómo funcionan los mapas (`Map<K, V>`) y cómo transformar listas usando `stream()`.

---

## ✍️ Ejercicio 1 – Crear y acceder a un `Map`

### 🎯 Objetivo:
Practicar los métodos `.put()`, `.get()`, `.remove()`, `.containsKey()` del `Map` en Java.

### 📄 Enunciado:
1. Crea una clase llamada `Producto` con los siguientes atributos:
    - `String nombre`
    - `double precio`
    - `int stock`
2. Luego, en tu clase `main`, haz lo siguiente:
    - Crea un `Map<String, Producto>` donde la **clave será el nombre del producto**.
    - Agrega al menos **3 productos** distintos.
    - Muestra en consola el producto que tenga como nombre `"Pan"`.
    - Elimina uno de los productos usando su nombre como clave.
    - Verifica si existe un producto llamado `"Agua"` y muestra un mensaje dependiendo del resultado.

### 💡 Pistas:
- Usa `mapa.put("clave", objeto)` para insertar.
- Usa `mapa.get("clave")` para acceder a un objeto.
- Usa `mapa.containsKey("clave")` para verificar si existe.
- Usa `mapa.remove("clave")` para eliminar.
- Puedes agregar un método `mostrar()` dentro de `Producto` para imprimir los datos fácilmente.

---

## ✍️ Ejercicio 2 – Convertir `List<Producto>` a `Map<String, Producto>`

### 🎯 Objetivo:
Practicar el uso de `.stream()` con `.collect(Collectors.toMap(...))`.

### 📄 Enunciado:
1. Crea una `ArrayList<Producto>` con al menos **5 productos distintos**.
2. Convierte esa lista en un `Map<String, Producto>` donde la clave sea el `nombre` del producto.
3. Accede directamente a un producto usando su nombre desde el `Map`.

### 💡 Pistas:
- Usa:
  ```java
  Map<String, Producto> mapa = lista.stream()
      .collect(Collectors.toMap(
          Producto::getNombre, // clave
          producto -> producto // valor
      ));

Una vez que tengas el mapa, puedes hacer mapa.get("Leche") para obtener ese producto directamente.


---

## ✍️ Ejercicio 3 – Agrupar productos por categoría usando `groupingBy`

### 🎯 Objetivo:
Aprender a usar `Collectors.groupingBy()` para clasificar objetos de una lista según una propiedad.

---

### 📄 Enunciado:

1. Agrega un atributo `String categoria` a la clase `Producto`.
2. Llena una lista (`List<Producto>`) con productos de **varias categorías** (por ejemplo: `"Bebidas"`, `"Panadería"`, `"Frutas"`).
3. Agrupa los productos en un `Map<String, List<Producto>>` según su categoría.
4. Recorre el mapa y muestra todos los productos agrupados por categoría en consola.

---

### 💡 Pistas:

- Asegúrate de tener **productos con distintas categorías repetidas** (al menos 2 productos por categoría).
- Para agrupar, puedes usar el siguiente código:

```java
Map<String, List<Producto>> agrupado = lista.stream()
    .collect(Collectors.groupingBy(Producto::getCategoria));

```
Para recorrer y mostrar el contenido del Map:


```java

agrupado.forEach((categoria, productos) -> {
    System.out.println("Categoría: " + categoria);
    productos.forEach(p -> p.mostrar());
});

```

Claro, aquí tienes el **ejercicio integrador completo en Markdown** para que puedas copiarlo directamente a tu `README.md` o material de clase:


## ✍️ Ejercicio Final – Sistema de Inventario de Tienda

### 🎯 Objetivo:
Aplicar el manejo de `ArrayList`, `Map`, streams, filtros y agrupamientos en un contexto práctico.

---

### 📄 Contexto:
Desarrollarás un sistema de inventario básico para una tienda. Vas a modelar los productos, organizarlos por categoría, buscar elementos específicos y optimizar consultas con mapas.

---

### 🧱 Estructura de clase sugerida:

```java
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

    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public boolean isActivo() { return activo; }

    public void mostrar() {
        System.out.println(nombre + " | " + categoria + " | $" + precio + " | Stock: " + stock + " | Activo: " + activo);
    }
}
````

---

## 🧪 Actividades a implementar en `main()`:

### ✅ 1. Crear una `List<Producto>` con datos de ejemplo

Agrega al menos **10 productos**, con categorías como:

* "Bebidas"
* "Panadería"
* "Lácteos"
* "Snacks"

---

### ✅ 2. Convertir la lista en `Map<String, Producto>`

Donde la **clave sea el nombre del producto**.

💡 Usa:

```java
Map<String, Producto> mapa = lista.stream()
    .collect(Collectors.toMap(
        Producto::getNombre,
        p -> p,
        (a, b) -> a // en caso de duplicados, mantener el primero
    ));
```

---

### ✅ 3. Filtrar productos activos (activo == true)

💡 Usa:

```java
List<Producto> activos = lista.stream()
    .filter(Producto::isActivo)
    .collect(Collectors.toList());
```

Muestra los productos activos en consola.

---

### ✅ 4. Agrupar productos por categoría

💡 Usa:

```java
Map<String, List<Producto>> agrupados = lista.stream()
    .collect(Collectors.groupingBy(Producto::getCategoria));
```

Luego recorre el `Map` con:

```java
agrupados.forEach((categoria, productos) -> {
    System.out.println("Categoría: " + categoria);
    productos.forEach(p -> p.mostrar());
});
```

---

### ✅ 5. Buscar productos caros y con poco stock

Filtra productos con:

* Precio mayor a 15
* Stock menor a 10

💡 Usa:

```java
List<Producto> filtroAvanzado = lista.stream()
    .filter(p -> p.getPrecio() > 15 && p.getStock() < 10)
    .collect(Collectors.toList());
```

---

### BONUS – Entrada por teclado (Scanner)

Permite que el usuario ingrese el nombre de un producto y:

* Verifica si existe con `mapa.containsKey(nombre)`
* Si existe, muestra el producto
* Si no, imprime `"Producto no encontrado"`

---

## 🧾 Resultado esperado (ejemplo):

```
🛒 PRODUCTOS ACTIVOS:
Pan | Panadería | $1.5 | Stock: 10 | Activo: true
Leche | Lácteos | $2.8 | Stock: 5 | Activo: true

📦 PRODUCTOS AGRUPADOS:
Categoría: Bebidas
- Agua
- Jugo

Categoría: Snacks
- Papas
- Galletas

⚠ Productos caros con bajo stock:
Queso | Lácteos | $18.0 | Stock: 3
```


