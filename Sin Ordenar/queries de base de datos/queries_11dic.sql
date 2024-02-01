--Ejemplos de filtros
--Obtener los productos de orden de details cuyo valor es mayor a 50
Select * from public.order_details 
where unit_price >50;
--Obtener productos de order_details cuya cantidad sea mayor a 3
Select * from public.order_details
where quantity >3;

--Obtener los empleados que contengan una w en su apellido
Select * from public.employees
where last_name like '%w%';

--Obtener los productos de order_details cuya cantidad se encuentre entre 75 y 150
Select product_id from public.order_details
where quantity between 75 and 150;

-- Obtener los productos cuya stock este entre 100 y 200
Select * from public.products
where units_in_stock between 100 and 200;

-- Obtener los productos cuyo nombre comience con C y termine con i
Select * from public.products
where product_name like 'C%i';

-- Obtener los producot cuyo nombre terminen con n
Select * from public.products
where product_name like '%n';

-- Obtener los productos cuyo proveedor sea 1,5,7,2
Select * from public.products
where supplier_id in (1,5,7,2);

--Obtener los productos cuyo nombre comienze con A,G,R ordenar por nombre del producto
Select * from public.products
where product_name like 'A%'
or product_name like 'G%'
or product_name like 'R%'
order by product_name;

--Ordenar las tabla de producto por nombre
Select * from products
order by product_name;

-- Ordenar las tablas de producto por id Descendentes
Select * from products
order by product_ID DESC;

--Ordenar la tabla de productos por categoria ascendete y proveedor descendente
Select * from products
order by category_id, supplier_id DESC;

--Obtener las filas de la tabla de producto
--(Las funciones de agregacion son: conut,sum,avg,max,min)
-- La unica que acepta el * es el count
-- El resto siempre tiene que tener el nombre de una columna o operacion aritmetica
Select count(*) as erdiavlo
from public.products;

--Obtener el numero de filas de la tabla de empleados
Select count(employee_id) as diavloloco
from public.employees;

Select count (region) as regionxd
from employees;


select * from public.customers;
--Gestion de nulos
create table datos
(a numeric);
insert into datos
values
(8),
(7),
(null),
(5);
Select * from datos;
select avg(a) from datos;

create table datos2
(a numeric, b numeric);

insert into datos2
values
(8,2),
(7,3),
(null,3),
(5,5);
Select * from datos2;
Select a+b as diavlo from datos2;


--Obtener el precio promedio, maximo y minimo de productos
Select avg(unit_price),max (unit_price),min (unit_price) from public.products;

--Obtener la cantidad promedio, maximo y minimo de order_details
Select avg(quantity),max(quantity),min(quantity) from public.order_details;

--Obtener todas las unidades en stock de los productos
Select sum(units_in_stock) from public.products;



