-- Agrupar por
--Group by
-- Select - from
-- where
-- group by
-- having
-- order by

select * from products
order by category_id;

-- contar los productos por categoria
Select category_id, count(product_id)
from public.products
group by category_id;

--obtener el precio promedio por categoria de la media de la tabla
Select category_id, avg(unit_price)
from public.products
group by category_id
order by category_id;

--Obtener las unidades en stock, su maximo y minimo por proveedor
Select supplier_id, sum(units_in_stock), max (units_in_stock), min (units_in_stock)
from public.products
group by supplier_id
order by supplier_id;

--Obtener los productos vendidos por orden de la tabla detalle de ordenes
Select order_id, sum (quantity)
from public.order_details
group by order_id
order by order_id;

--Obtener la cantidad de ordenes por empleado de la tabla de ordenes
Select employee_id, count (order_id)
from public.orders
group by employee_id
order by employee_id;

--Obtener la cantidad de ordenes por cliente de la tabla de ordenes
Select customer_id, count (order_id)
from public.orders
group by customer_id
order by customer_id;

--Obtener el total de productos vendidos por producto de la tabla de detalles de ordenes
Select product_id, sum(quantity)
from public.order_details
group by product_id
order by product_id;

--Columnas calculadas
--Incrementar en 10% el precio de los productos de la tabla de productos
Select product_id, unit_price*1.1
from products;

--Calcular el valor del inventario igual a unidades stock* precio unitario
-- id de producto, nombre y valor de inventario.
Select units_in_stock*unit_price
from products;

-- en la tabla detalles de ordenes calcular el importe de cada producto
-- importe = cantidad * precio unitario
-- Los datos orden, precio, producto
Select order_id,product_id, quantity*unit_price
from public.order_details;

--Obtener el importe por orden de la tabla de detalle de ordenes
Select order_id,sum (quantity*unit_price) 
from public.order_details
group by order_id
order by order_id;

--Obtener una consulta que muestre el valor del inventario por categoria
Select category_id, sum (unit_price*units_in_stock)
from public.products
group by category_id
order by category_id;

-- contar los clientes por pais de la tabla de clientes
Select country , count(customer_id)
from public.customers
group by country
order by country;

--Combinacion de datos de dos tablas

--Obtener informacion de mas de una tabla
Select p.category_id,category_name,product_id,product_name
from public.categories c ,public.products p
where c.category_id = p.category_id;

Select p.category_id,category_name,product_id,product_name
from public.categories c
inner join products p
on c.category_id = p.category_id;

--Obtener el id orden, empleado y su nombre completo de las tablas ordenes y empleados
Select o.employee_id, order_id,first_name,last_name
from public.employees e
inner join public.orders o
on e.employee_id = o.employee_id;

--Obtener el producto id, nombre, el proveedor y nombre de la empresa de las tablas de productos y proveedores
Select p.supplier_id, product_name, company_name
from public.suppliers s
inner join public.products p
on s.supplier_id = p.supplier_id;

--Obtener las ordenes, fecha, cliente y su nombre
Select o.customer_id,company_name ,order_date,order_id, contact_name
from public.customers c
inner join public.orders o
on c.customer_id = o.customer_id;
