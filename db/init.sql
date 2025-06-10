-- Tabla: usuarios
CREATE TABLE usuario (
id SERIAL PRIMARY KEY,
nombre VARCHAR(100),
correo VARCHAR(100),
password VARCHAR(100),
rol VARCHAR(50)
);

INSERT INTO usuario(nombre, correo, password, rol) VALUES
('Carlos', 'carlos@mail.com', '123456', 'ADMIN'),
('Ana', 'ana@mail.com', 'abc123', 'USER'),
('Luis', 'luis@mail.com', 'pwd987', 'MOD');

-- Tabla: parqueos
CREATE TABLE parqueo (
id SERIAL PRIMARY KEY,
ubicacion VARCHAR(100),
disponible BOOLEAN,
tarifa_hora DOUBLE PRECISION,
capacidad INT
);

INSERT INTO parqueo(ubicacion, disponible, tarifa_hora, capacidad) VALUES
('Zona A', true, 12.5, 30),
('Zona B', false, 15.0, 20),
('Zona C', true, 10.0, 40);

-- Tabla: vehiculos
CREATE TABLE vehiculo (
id SERIAL PRIMARY KEY,
placa VARCHAR(20) UNIQUE,
tipo VARCHAR(50),
color VARCHAR(50),
anio INT,
activo BOOLEAN
);

INSERT INTO vehiculo(placa, tipo, color, anio, activo) VALUES
('ABC123', 'Auto', 'Rojo', 2018, true),
('XYZ987', 'Moto', 'Negro', 2021, false),
('DEF456', 'Camioneta', 'Blanco', 2019, true);

-- Tabla: reservas
CREATE TABLE reserva (
id SERIAL PRIMARY KEY,
usuario_id INT REFERENCES usuarios(id),
vehiculo_id INT REFERENCES vehiculos(id),
fecha_inicio TIMESTAMP,
fecha_fin TIMESTAMP,
estado VARCHAR(50)
);

INSERT INTO reserva(usuario_id, vehiculo_id, fecha_inicio, fecha_fin, estado) VALUES
(1, 1, '2024-06-01 08:00:00', '2024-06-01 10:00:00', 'FINALIZADA'),
(2, 3, '2024-06-02 09:00:00', '2024-06-02 11:30:00', 'EN CURSO'),
(3, 2, '2024-06-03 07:30:00', '2024-06-03 09:00:00', 'CANCELADA');
