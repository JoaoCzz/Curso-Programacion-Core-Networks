--La segunda letra del apellido sea u
Select * from employees
where last_name like '_u%';

--Funciones de agregacion
-- Promedio de las cantidades vendidad de detalle de ordenes
Select avg(quantity)
from order_details;

--Suma de las cantidades vendidas por producto
Select product_id ,sum (quantity)
from order_details
group by product_id
order by product_id;

-- Obtener la orden id, fecha de orden, el empleado id, nombre
-- orders, employees

select o.employee_id,first_name,order_id,order_date
from orders o
inner join employees e
on o.employee_id = e.employee_id;

-- Obtener el pais que tenga mas de 10 ordenes
Select ship_country,count (order_id)
from public.orders
group by ship_country
having count (order_id)>10;

