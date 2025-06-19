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


## 🧠 TAREA N°1 – Implementar Interfaces para los Servicios

### 🎯 Objetivo:
Practicar el uso de interfaces en Java para aplicar **polimorfismo** y **principio de inversión de dependencias (SOLID)** dentro de servicios de Spring Boot.

---

### 📄 Enunciado:

Actualmente los servicios (`UsuarioService`, `ParqueoService`, `VehiculoService`, `ReservaService`) **no tienen una interfaz asociada**.

Tu tarea será lo siguiente:

### 🛠 ¿Qué debes hacer?

1. **Crear una interfaz por cada servicio**, dentro del paquete `com.tarea.marcos.service`.

   Por ejemplo:
   ```java
   public interface UsuarioServiceInterface {
       List<UsuarioDto> getAllUsers();
   }
   ```

Hacer que cada clase de servicio implemente su interfaz correspondiente:

   ```java
   public class UsuarioService implements UsuarioServiceInterface {
   ...
   }
   ```

Verifica que todos los métodos públicos ya existentes estén declarados también en la interfaz.

💡 Ejemplo completo (Usuario):
 Interfaz:

  ```java
   package com.tarea.marcos.service;
   
   import com.tarea.marcos.dto.UsuarioDto;
   import java.util.List;
   
   public interface UsuarioServiceInterface {
      List<UsuarioDto> getAllUsers();
   }

   ```

✅ Implementación:
  ```java
   @Service
   public class UsuarioService implements UsuarioServiceInterface {
       ...
   }

   ```

### 📋 Servicios que debes modificar:
UsuarioService → crea: UsuarioServiceInterface

ParqueoService → crea: ParqueoServiceInterface

ReservaService → crea: ReservaServiceInterface

VehiculoService → crea: VehiculoServiceInterface

### ✅ Criterios de cumplimiento:
Se crean correctamente las 4 interfaces.

Las clases implementan las interfaces.

Las firmas de métodos coinciden.

El código compila y funciona igual que antes.

### 🧠 ¿Por qué esto es importante?
Te prepara para trabajar con principios SOLID (especialmente "Dependency Inversion").

Te permite aplicar inyección de dependencias con facilidad.

Facilita testing con mocks o implementación alternativa.

Refuerza herencia + polimorfismo con interfaces.




## 🧠 TAREA N°2 – Herencia y Polimorfismo: Sistema de Empleados

### 🎯 Objetivo:
Aplicar herencia y polimorfismo creando una jerarquía de clases basada en `Empleado`.

---

### 📄 Enunciado:

Vas a construir una jerarquía simple de empleados en una empresa.

---

### 👷‍♂️ Paso 1 – Crear clase base `Empleado`

Debe tener:
- `String nombre`
- `int edad`
- `double salario`

✅ Debe tener un método:


```java
public void mostrarInformacion();
````

Que imprima los datos básicos del empleado.

---

### Paso 2 – Crear dos subclases

1. `Programador`:

   * Atributo adicional: `String lenguajePrincipal`
   * Sobrescribe `mostrarInformacion()` para incluir el lenguaje.

2. `Diseñador`:

   * Atributo adicional: `boolean usaPhotoshop`
   * Sobrescribe `mostrarInformacion()` para mostrar si usa Photoshop.

---

### Paso 3 – Probar en el `main()`

Crea un `ArrayList<Empleado>` con objetos `Programador` y `Diseñador`.
Llama a `mostrarInformacion()` sobre cada uno usando un **bucle for-each**.

✅ Esto debe mostrar comportamiento **polimórfico**.

---

### 🧾 Ejemplo esperado en consola:

```
👨‍💻 Programador: Carlos, 30 años, $3500 - Lenguaje: Java
🎨 Diseñador: Ana, 28 años, $3000 - Usa Photoshop: Sí
👨‍💻 Programador: Luis, 26 años, $3200 - Lenguaje: Python
🎨 Diseñador: Marta, 35 años, $3100 - Usa Photoshop: No
```

---

### 💡 Pistas:

* Usa `@Override` al redefinir `mostrarInformacion()`
* Llama a `super()` desde los constructores de subclases
* Puedes usar emojis en consola si gustas (`👨‍💻`, `🎨`) para hacerlo más visual








