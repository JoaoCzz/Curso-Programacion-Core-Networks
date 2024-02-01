CREATE TABLE comunidades(
comunidad varchar (20) primary key
);
CREATE TABLE ciudades(
ciudad varchar (20)primary key,
	poblacion char (10000000) not null,
	comunidad varchar (20),
	constraint FK_ciudades_comunidades foreign key (comunidad) references comunidades (comunidad) 
);

CREATE TABLE Socios(
id_socio serial primary key,
	nombre varchar (10) not null,
	apeliido varchar (10) not null,
	DNI char (9) not null,
	ciudad varchar (20) not null,
	comunidad varchar (20)not null,
	CP char (6) not null,
	telefono char(10) not null,
	constraint FK_Socios_comunidad foreign key (comunidad) references comunidades(comunidad),
	constraint FK_Socios_ciudad foreign key (ciudad) references ciudades(ciudad)	
);

CREATE TABLE productos(
isbn serial primary key,
	titulo varchar (60) not null,
	autor varchar(60) not null,
	editorial varchar (60) not null,
	id_categoria integer not null,
	constraint FK_productos_categoria foreign key (id_categoria) references categoria (id_categoria)
);

CREATE TABLE pedidos(
id_pedido serial primary key,
	isbn integer not null,
	id_socio integer not null,
	comunidad varchar (20) not null,
	ciudad varchar (20) not null,
	constraint FK_pedidos_comunidad foreign key (comunidad) references comunidades(comunidad),
	constraint FK_pedidos_ciudad foreign key (ciudad) references ciudades(ciudad),
	constraint FK_pedidos_productos foreign key (isbn) references productos(isbn),
	constraint FK_pedidos_Socios foreign key (id_socio) references Socios(id_socio)
);
CREATE TABLE detalle_pedidos(
id_detalle serial primary key,
	id_pedido integer not null,
	cantidad char (100) not null,
	constraint FK_detalle_pedidos_pedidos foreign key (id_pedido) references pedidos(id_pedido)
	
);
CREATE TABLE almacen(
id_almacen serial primary key,
comunidad varchar (20) not null,
	ciudad varchar (20) not null,
	isbn integer not null;
	cantidad_stock char(100),
	constraint FK_almacen_productos foreign key (isbn) references productos(isbn)
	constraint FK_almacen_stock foreign key (isbn) references stock(isbn)
	
);
CREATE TABLE stock(
isbn integer primary key,
	cantidad_stock char(100),
	constraint FK_stock_productos foreign key (isbn) references productos(isbn)
);




