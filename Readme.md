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

# 🧪 TAREAS – Manejo de Excepciones en Servicios (Java + Spring Boot)

Aprenderás a lanzar excepciones simples en la capa `service`, útiles para validar condiciones inesperadas como listas vacías, datos nulos o errores durante una conversión.


# 🧪 TAREAS – Manejo de Excepciones en Servicios (Java + Spring Boot)

Aprenderás a lanzar excepciones simples en la capa `service`, útiles para validar condiciones inesperadas como listas vacías, datos nulos o errores durante una conversión.

---

## ✍️ Ejercicio 1 – Validar lista vacía

### 🎯 Objetivo:
Lanzar una excepción si el repositorio devuelve una lista vacía.

### 📄 Enunciado:
Edita el método `getAllParqueos()` en `ParqueoServiceImpl` para que:

- Si la lista de parqueos está vacía (`size == 0`), se lance una excepción del tipo `RuntimeException` con el mensaje:

```java
throw new RuntimeException("No hay parqueos disponibles.");
````

---

## ✍️ Ejercicio 2 – Validar datos nulos

### 🎯 Objetivo:

Lanzar excepción si se encuentra un dato nulo o incorrecto.

### 📄 Enunciado:

En `getAllVehiculos()` dentro de `VehiculoServiceImpl`:

* Verifica que ningún vehículo tenga `null` en el campo `placa`.

* Si ocurre, lanza:

```java
throw new IllegalArgumentException("Vehículo con placa nula encontrado.");
```

📌 Solo necesitas agregar esta verificación antes del `stream()`.

---

## ✍️ Ejercicio 3 – Captura con try-catch (solo imprimir)

### 🎯 Objetivo:

Usar `try-catch` en la capa `service` para capturar errores y continuar el flujo.

### 📄 Enunciado:

Edita el método `getAllUsers()` en `UsuarioServiceImpl`:

* Usa un bloque `try-catch` para envolver el `stream().map()`.

* Si ocurre algún error, imprime:

```java
System.out.println("Error al convertir usuarios: " + e.getMessage());
```

* Y retorna una lista vacía (`List.of()`).

💡 Ejemplo:

```java
try {
    return usuarioRepository.findAll().stream()
        .map(usuario -> new UsuarioDto(...))
        .collect(Collectors.toList());
} catch (Exception e) {
    System.out.println("Error al convertir usuarios: " + e.getMessage());
    return List.of();
}
```

---

## ✍️ Ejercicio 4 (BONUS) – Excepción personalizada

### 🎯 Objetivo:

Crear y lanzar una excepción propia.

### 📄 Enunciado:

1. Crea una clase nueva en `exceptions/NoReservaFoundException.java`:

```java
public class NoReservaFoundException extends RuntimeException {
    public NoReservaFoundException(String message) {
        super(message);
    }
}
```

2. En `ReservaServiceImpl`, si la lista está vacía:

```java
throw new NoReservaFoundException("No se encontraron reservas.");
```

🎁 *Este ejercicio es opcional y te prepara para manejo global de errores con `@ControllerAdvice` más adelante.*

---

## ✅ Recomendaciones

* No necesitas modificar los controladores, solo la lógica interna de los servicios.
* Usa mensajes claros en las excepciones.
* Asegúrate de que el proyecto compile correctamente antes y después de aplicar los cambios.

```







