--Cuantos productos hay en tabla de productos
Select count(product_id)
from public.products;

--Sumar las cantidades en existencia 
--de la tabla de productos
Select sum (units_in_stock)
from public.products

--Promedio de los precios 
-- de la tabla de productos
Select avg(unit_price)
from public.products

--Numero de productos por categoria
Select count(product_id), category_id
from public.products
group by category_id

--Obtener el precio promedio por proveedor de la tabla de productos
Select avg(unit_price), supplier_id
from public.products
group by supplier_id

--Obtener la suma de inventario (UnitsInStock) por SupplierID
--De la tabla de productos (Products)
Select sum(units_in_stock), supplier_id
from public.products
group by supplier_id
order by supplier_id


--comprobaci�n
SELECT Supplier_ID, 
       Units_In_Stock
FROM products
ORDER BY Supplier_ID;

--Contar las ordenes por cliente de la tabla de orders
Select count (order_id), customer_id
from public.orders
group by customer_id

--Contar las ordenes por empleado
--De la tabla de ordenes
--Pero unicamente del empleado 1,3,5,6

select count(order_id),employee_id
from public.orders
WHere employee_id in ('1','3','5','6')
group by employee_id
--Obtener la suma del env�o (freight) por cliente
--De la tabla de ordenes
--Pero �nicamente de los registros cuya ShipCity sea 
--Madrid, Sevilla, Barcelona, Lisboa, London
--Ordenado por el campo de suma del env�o
select sum (freight),customer_id
from public.orders
where ship_city in ('Madrid','Sevilla','Barcelona','Lisboa','London')
group by customer_id


--Obtener los datos de productos ordenados descendentemente por precio unitario
--de la categor�a 1
Select product_id,unit_price
from public.products
where category_id=1 
group by unit_price, product_id 
order by unit_price DESC, product_id  



--Obtener los datos de los clientes(Customers) ordenados descendentemente por nombre(CompanyName) que se 
--encuentren en la ciudad(city) de barcelona, Lisboa
Select company_name,city
from public.customers
Where city in ('Barcelona','Lisboa')
group by company_name,city
order by company_name DESC,city

--Obtener los datos de las ordenes, ordenados descendentemente por la fecha de la orden
--cuyo cliente(CustomerId) sea ALFKI
Select order_date,customer_id
from public.orders
where customer_id in ('ALFKI')
group by order_date,customer_id
order by order_date DESC,customer_id 


--Obtener los datos del detalle de ordenes, ordenados ascendentemente por precio
--cuyo producto sea 1, 5 o 20
Select unit_price,product_id
from public.order_details
where product_id in ('1','5','20')
order by unit_price ASC ,product_id 


--Obtener los datos de las ordenes ordenados ascendentemente por la fecha de la orden
--cuyo empleado sea 2 o 4
Select order_date,employee_id
from public.orders
where employee_id in ('2','4')
order by order_date ASC,employee_id


--Obtener los productos cuyo precio est�n entre 30 y 60
--ordenado por nombre
Select product_name,unit_price
from public.products
where unit_price >=30 and unit_price <= 60
order by product_name

--OBTENER EL MAXIMO, MINIMO Y PROMEDIO DE PRECIO UNITARIO DE LA TABLA DE PRODUCTOS
--UTILIZANDO ALIAS
select max(unit_price) as maximo, min(unit_price) as minimo, avg(unit_price) as promedio
from public.products

--obtener el precio promedio de los productos por categoria
--sin contar con los productos descontinuados (Discontinued)
select avg(unit_price), category_id,discontinued
from public.products
where discontinued  <> 1
group by category_id,discontinued
order by category_id,discontinued

--Obtener la cantidad de productos por categoria,  aquellos cuyo precio se
--encuentre entre 10 y 60 que tengan m�s de 12 productos
select count (product_id),category_id
from public.products
where unit_price>=10 and unit_price <=60
group by category_id
having count (product_id)>9



--OBTENER LA SUMA DE LAS UNIDADES EN EXISTENCIA (UnitsInStock)
--POR CATEGORIA, Y TOMANDO EN CUENTA UNICAMENTE LOS PRODUCTOS CUYO
--PROVEEDOR (SupplierID) SEA IGUAL A 17, 19, 16.
--cuya categoria tenga menos de 100 unidades
--ordenado por unidades
select sum(units_in_stock) as suma, category_id 
from public.products
where supplier_id in (17,19,16)
group by category_id
having count(units_in_stock)<=200
order by suma