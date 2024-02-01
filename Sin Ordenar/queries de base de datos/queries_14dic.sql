--Obtener el importe vendido de la tabla de order details 
--por categoria (nombre de la categoria) y proveedor (nombre de la empresa)
--tabla de producto, la de ordenes y la de proveedores

Select category_name,company_name,sum(od.unit_price*quantity) as importe
from order_details od
inner join products p
on od.product_id = p.product_id
inner join categories c
on c.category_id = p.category_id
inner join suppliers s
on p.supplier_id = s.supplier_id
group by category_name, company_name
order by category_name, company_name



create table TablaA
(
valor varchar(50));

create table TablaB
(
valor varchar(50));

insert into tablaA
values
('a'),
('b'),
('c'),
('d');

insert into tablaB
values
('a'),
('b'),
('e'),
('f');

select * from TablaA
select * from TAblaB;

select a.valor from tablaA A
inner join tablaB B
on a.valor = b.valor

select a.valor from tablaA A
left outer join tablaB B
on a.valor = b.valor

select a.valor, b.valor from tablaA A
right outer join tablaB B
on a.valor = b.valor

select a.valor, b.valor from tablaA A
full outer join tablaB B
on a.valor = b.valor

-- FORMAS DE HACER EL INSERT
--1. MENCIONAR LAS COLUMNAS
--2. SIN MENCIONAR LAS COLUMNAS
--3. AGREGAR VARIAS FILAS AL MISMO TIEMPO
INSERT INTO public.categories
(category_id,category_name,description )
VALUES
('100','PAPELERIA','ARTICULO PARA PAPELERIA');

SELECT * FROM public.categories
ORDER BY category_id DESC;

--2
INSERT INTO public.tablaa
VALUES ('Z');

--3
INSERT INTO  public.tablaa
VALUES
('X'),('Y');

Select * FROM  public.tablaa;

UPDATE public.categories
SET category_name= 'P. ecologicos'
WHERE category_id= 100; 

SELECT * FROM public.categories
ORDER BY category_id DESC;

--Consulta para obtener los productos que no tengan la categoria 100
SELECT category_id
from public.products
WHERE category_id <> 100;

--Borrar
DELETE FROM CATEGORIES
WHERE category_id=100;

-- Actualizar el precio de los productos para incrementarlos al 10%
UPDATE public.products
set unit_price= unit_price*1.10;



