insert into tabla_departamento (cod_Departamento, departamento) VALUES ('D001', 'Cundinamarca');
insert into tabla_departamento (cod_Departamento, departamento) VALUES ('D002', 'Santander');
insert into tabla_departamento (cod_Departamento, departamento) VALUES ('D003', 'Boyaca');
insert into tabla_departamento (cod_Departamento, departamento) VALUES ('D004', 'Antioquia');
insert into tabla_departamento (cod_Departamento, departamento) VALUES ('D005', 'Caldas');

insert into tabla_ciudad (cod_Ciudad, ciudad, cod_Departamento) VALUES ('C001', 'Bogota', 'D001');
insert into tabla_ciudad (cod_Ciudad, ciudad, cod_Departamento) VALUES ('C002', 'Soacha', 'D001');
insert into tabla_ciudad (cod_Ciudad, ciudad, cod_Departamento) VALUES ('C003', 'Medellin', 'D004');
insert into tabla_ciudad (cod_Ciudad, ciudad, cod_Departamento) VALUES ('C004', 'Tunja', 'D003');
insert into tabla_ciudad (cod_Ciudad, ciudad, cod_Departamento) VALUES ('C005', 'Sogamoso', 'D003');

insert into tabla_lugar (cod_lugar, nombre_lugar, direccion, cod_Ciudad) VALUES ('L001', 'Plaza Imperial', 'Cra. 104 #148 - 07', 'C001');

insert into tabla_mesa (mesa, cod_lugar) VALUES (301, 'L001');

insert into tabla_persona (cedula, primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, genero, edad, jurado, cod_Mesa) VALUES (1100958834, 'Christian', 'Romario', 'Chacon', 'Pinzon', 'M', 29, 'Y', '1');
insert into tabla_persona (cedula, primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, genero, edad, jurado, cod_Mesa) VALUES (1100958835, 'Juan', 'Camilo', 'Chacon', 'Pinzon', 'M', 27, 'N', '1');

insert into tabla_registro (registro, cedula) VALUES (0, 1100958834);
insert into tabla_registro (registro, cedula) VALUES (0, 1100958835);