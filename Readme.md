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
docker build -t parqueo-db-image ./db

docker run --name parqueo-db -e POSTGRES_PASSWORD=admin123 -p 5433:5432 parqueo-db-image
```
### Docker opcion B
```bash
docker run -d --name parqueo-db -e POSTGRES_PASSWORD=admin123 -e POSTGRES_USER=postgres -e POSTGRES_DB=parqueo -p 5433:5432 -v parqueo-data:/var/lib/postgresql/data postgres:17
```

Esto:

- Usa una imagen con init.sql preconfigurado.
- Crea tres tablas: usuarios, parqueos, vehiculos.
- Inserta 3 registros por tabla con datos de prueba.



## TAREAS
Controladores y repositorios ya están listos. 

Tú debes trabajar solo en los servicios.

📌 Ejercicio 1 – UsuarioService
Implementa getAllUsers() que:

Obtiene la lista de usuarios desde el repositorio.

Convierte cada Usuario a UsuarioDto con .stream().map().collect(...).

📌 Ejercicio 2 – ParqueoService
Implementa getAllParqueos() que:

Devuelve solo los campos ubicacion, disponible y tarifaHora en el DTO.


📌 Ejercicio 3 – Crear entidad Vehiculo y su servicio
Objetivo: Modelar una nueva entidad con distintos tipos de datos.

🛠️ Crea:

La entidad Vehiculo con los campos: placa (String), tipo (String), color (String), anio (int), activo (boolean).

Un DTO VehiculoDto con solo: placa, tipo, activo.

El método getAllVehiculos() en VehiculoService que convierte Vehiculo → VehiculoDto.

📌 Ejercicio 4 – Filtrar vehículos activos
Objetivo: Filtrar colecciones usando .filter() y .collect().

🛠️ En VehiculoService, crea un método getVehiculosActivos() que:

Devuelva solo los vehículos donde activo == true.

Aplique .filter() para hacer la selección y luego .map() para retornar DTOs.

📌 Ejercicio 5 – Combinar entidades: Reserva
Objetivo: Relacionar entidades y mapear múltiples datos.

🛠️ Crea:

La entidad Reserva con relaciones @ManyToOne a Usuario y Vehiculo, y los campos: fechaInicio, fechaFin, estado.

Un DTO ReservaDto que contenga: nombreUsuario, placaVehiculo, y estado.

Un método getAllReservas() en ReservaService que retorne todos los ReservaDto usando .map() para unir los datos.

💡 Tip: Puedes acceder al nombre del usuario con reserva.getUsuario().getNombre() y la placa del vehículo con reserva.getVehiculo().getPlaca().

📌 Ejercicio 6 – Extra: Añade Swagger y las configuraciones de open api para probar los endpoints

Tambien realiza el controlador necesario para probar las reservas y hacer un get all reservas

💡 Tip: Ayudate de los proyectos pasados del parqueo y otros que practicaste para realizar esto, 

usa DTO's para toda consulta, no es necesario que hagas otros endpoinst mas que Listas de Get all resrvations, vehicles, users, parkings 