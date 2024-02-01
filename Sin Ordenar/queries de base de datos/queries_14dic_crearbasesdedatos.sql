CREATE TABLE personas
(
dni char(9) primary key,
nombre_p varchar(60) not null,
direccion varchar (120));

CREATE TABLE socios
(
carnet char(10),
	dni char(9) primary key,
	constraint FK_socios_personas foreign key (dni) references personas(dni) 
);

CREATE TABLE patrones
(
licencia char(10),
	dni char(9) primary key,
	constraint FK_patrones_personas foreign key (dni) references personas(dni) 
);

CREATE TABLE barcos
(
	matricula char(7) primary key,
	nombre_B VARCHAR (60),
	amarre integer,
	cuota money,
	dni char (9),
	constraint FK_barcos_socios foreign key (dni) references socios(dni)
	
);
CREATE TABLE salidas(
dni char(9),
	matricula char (7),
	f_salida date,
	h_salida integer,
	destino varchar (60),
	constraint PK_salidas primary key (dni,matricula),
	constraint FK_salidas_barcos foreign key (matricula) references socios(dni),
	constraint FK_salidas_patrones foreign key (dni) references patrones (dni)
);
insert into personas (dni,nombre_p,direccion)values('1234567A','Pon','Lacarney');
insert into socios (carnet,dni)values('12345678','1234567A');
delete from socios
where dni='1234567A';