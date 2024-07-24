use eco_trail;
-- Crear Departamentos
INSERT INTO DEPARTAMENTO (nombre) VALUES
    ('Boyacá'),
    ('Cundinamarca');

-- Crear Municipios
INSERT INTO MUNICIPIO (nombre, id_departamento) VALUES
    ('Tunja', 1), -- Boyacá
    ('Duitama', 1), -- Boyacá
    ('Sogamoso', 1), -- Boyacá
    ('Bogotá', 2), -- Cundinamarca
    ('Zipaquirá', 2), -- Cundinamarca
    ('Chía', 2); -- Cundinamarca

-- Crear Zonas Turísticas
INSERT INTO ZONA_TURISMO (nombre, id_municipio) VALUES
    ('Centro Histórico de Bogotá', 4), -- Bogotá
    ('Catedral de Sal de Zipaquirá', 5), -- Zipaquirá
    ('Lago de Tota', 3); -- Sogamoso

-- Crear Actividades Turísticas
INSERT INTO ACTIVIDAD_TURISTICA (nombre, descripcion, id_zona) VALUES
    ('Visita a la Catedral de Sal', 'Recorrido por las minas de sal convertidas en catedral.', 2), -- id_zona de Zipaquirá
    ('Tour Histórico', 'Recorrido por el centro histórico de Bogotá.', 1), -- id_zona de Bogotá
    ('Paseo en Lancha', 'Paseo en lancha por el Lago de Tota.', 3); -- id_zona de Sogamoso

-- Crear Usuario
INSERT INTO USUARIO (nombre, apellido, mail) VALUES
    ('Dan', 'Cla', 'dan@example.com');

-- Crear Clave para el Usuario
INSERT INTO CLAVE (hash, id_usuario) VALUES
    ('hashed_password', 1); -- Suponiendo que el usuario Juan tiene id_usuario = 1
