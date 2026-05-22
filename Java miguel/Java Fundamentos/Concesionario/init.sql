CREATE TABLE IF NOT EXISTS coches (
    matricula VARCHAR(20) PRIMARY KEY,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    color VARCHAR(30),
    anio INT,
    precio INT
);

INSERT IGNORE INTO coches (matricula, marca, modelo, color, anio, precio) VALUES 
('1234ABC', 'Toyota', 'Corolla', 'Rojo', 2020, 15000),
('5678DEF', 'Honda', 'Civic', 'Azul', 2021, 18000),
('9012GHI', 'Ford', 'Mustang', 'Negro', 2022, 35000);
