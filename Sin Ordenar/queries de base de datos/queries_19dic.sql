do $$
declare 
nombre varchar(20):='Juan lopez';
begin
raise notice 'Bienvenido %', nombre;
end
$$ language 'plpgsql';

do $$
declare 
edad int :=18;
begin
raise notice 'Su edad es %',edad;
end
$$ language 'plpgsql'

do $$
declare
genero char(1):='M';
begin
raise notice 'Tu generos es %',genero;
end
$$ language 'plpgsql';

-- Estructuras de control
--condicionales
--if

do $$
declare 
usuario varchar (20):='admin1';
begin
if(usuario='admin')then 
raise notice 'Bienvenido %',usuario;
else
raise notice 'No se puede logear, no tienes permisos';
end if;
end
$$ language 'plpgsql'

--Definir una variable de edad, y decir es mayor de edad o menor de edad
do $$
declare 
edad int:=18;
nombre varchar:= 'pepe';
begin
if(edad >= 18)then
raise notice '% eres mayor de edad, tienes % años',nombre,edad;
else
raise notice '% eres menor de edad, tienes % años',nombre,edad;
end if;
end
$$ language 'plpgsql';

--Definir una variable numerica y decir si es positivo o negativo
do $$
declare
numero int:= -1;
begin
if(numero >=0)then
raise notice 'El numero % es positivo',numero;
else
raise notice 'El numero % es negativo', numero;
end if;
end
$$ language 'plpgsql';

--case - estructura condicional evaluar el valor de una variable
do $$
declare
	estado_civil char:='S';
BEGIN
	case
	when(estado_civil= 'S') then raise notice 'Es soltero';
	when(estado_civil= 'C') then raise notice 'Es casado';
	when(estado_civil= 'V')then raise notice 'Es viudo';
	when(estado_civil= 'D')then raise notice 'Es divorsiado';
	else 
	raise notice 'Valor invalido';
	end case;
end
$$ language 'plpgsql';

-- con un valor numerico evaluar los dias de la semana con case
do $$
declare
dia int:=6;
begin
	case
	when (dia=1) then raise notice 'Es lunes :(';
	when (dia=2) then raise notice 'Es martes :(';
	when (dia=3) then raise notice 'Es miercoles :,(';
	when (dia=4) then raise notice 'Es jueves :/';
	when (dia=5) then raise notice 'Es viernes :)';
	when (dia=6) then raise notice 'Es sabado :D';
	when (dia=7) then raise notice 'Es domingo :,)';
	else 
	raise notice 'No existe ese dia XD';
	end case;
	end
	$$ language 'plpgsql';
	
-- Estructura de bucle
do $$
declare 
contador integer:=1;
begin
 LOOP
 raise notice 'interaccion %',contador;
 contador := contador +1;
 exit when contador =11;
 end LOOP;
end
$$ language 'plpgsql';
	
-- Otra forma
do $$
declare 
contador integer:=0;
begin
 while (contador <10) LOOP
 contador := contador +1;
 raise notice 'interaccion %',contador;
 end LOOP;
end
$$ language 'plpgsql';

--Mostrar por la consola la tabla de multiplicar de 3
do $$
declare
contador integer:=0;
multiplicacion integer:=0;
begin
while (contador<10) LOOP
contador := contador +1 ;
raise notice '3 x % = %',contador,contador*3;
end LOOP;
end
$$ language 'plpgsql';

--funciones 
create or replace function sin_param()
returns TEXT
as $$
begin
return 'Funciona';
END
$$
language 'plpgsql';

Select sin_param();

create or replace function cantidades_existencia()
returns integer
as $$
	declare
	cantidad_existencia integer;
begin
	select sum(units_in_stock) into cantidad_existencia
	from public.products;
	return cantidad_existencia;

end
$$ language 'plpgsql';

Select cantidades_existencia();
	
-- Obtener en base del id el nombre del producto
create or replace function buscar_producto(id integer)
returns varchar
as $$
	declare 
	buscar_nombreP varchar;
	begin
	select product_name into buscar_nombreP
	from public.products
	where product_id=id;
	return buscar_nombreP;
end
$$ language 'plpgsql';

Select buscar_producto(10);

--Obtener el numero de ordenes por empleado
create or replace function buscar_numeroordenes(id integer)
returns integer
as $$
	declare
	buscar_o integer;
	begin
	Select count(order_id) into buscar_o
	from public.orders
	where employee_id=id;
	return buscar_o;
	end 
$$ language 'plpgsql';

select buscar_numeroordenes(2)

--Obtener de detalles de ordenes para encontrar las cantidades vendidas mediante
-- product id

create or replace function buscar_cantidadesvendidas(id integer)
returns integer
as $$
	declare
	buscar_c integer;
	begin
	Select sum(quantity) into buscar_c
	from public.order_details
	where product_id=id;
	return buscar_c;
	end 
$$ language 'plpgsql';

select buscar_cantidadesvendidas(1)



