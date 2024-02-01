create table temas(
    id_Tema serial primary key,
	descripcion varchar (90) not null
);
create table libros(
isbm char (20) primary key,
	autor varchar(60) not null,
	titulo varchar(60) not null,
	numero_ejemplar integer,
	id_tema integer not null,
	constraint FK_libros_temas_ foreign key(id_Tema) references temas(id_Tema)
);
create table socios(
id_socio serial primary key,
	dni char(9) not null,
	nombre varchar(60),
	direccion varchar(120)
);

create table prestamos(
isbm char(20),
	id_socio integer,
	fecha_prestamo date, 
	fecha_devolucion date,
	constraint PK_prestamos primary key (isbm,id_socio),
	constraint FK_prestamos_libros foreign key(isbm) references libros(isbm),
	constraint FK_prestamos_socios foreign key (id_socio) references socios(id_socio)
);

insert into temas (descripcion)
values('informatica'),
('biologia');

insert into libros (isbm,autor,titulo,numero_ejemplar,id_tema)
values ('123456789','Joao','La biologia de Joao',3,2),
('987456123','Celline','La informatica de Joao',4,1),
('147852963','Paul','Pinguinos de Madagascar',1,2),
('369852147','John','Instrumentos musicales electronicos',1,2),
('654987321','Roberto','Gatos y mas',1,1);

insert into socios (dni,nombre,direccion)
values('123456789','George','Calle alcala'),
('987654321','Jorge','Calle Salamanca');

insert into prestamos (isbm,id_socio,fecha_prestamo)
values ('147852963',1,'2023/12/25'),
('987456123',2,'2023/05/02');

Select * from prestamos
