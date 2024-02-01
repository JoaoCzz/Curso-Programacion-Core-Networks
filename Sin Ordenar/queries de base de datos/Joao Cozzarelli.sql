--1) Obtener todas las columnas y filas de la tabla de resultados
Select * from public.resultados;


--2) Obtener las columnas clase, tipo, pais y desplazamiento de la tabla de clases

Select clase,tipo,pais,desplazamiento from public.clases;
--3) Obtener las columnas clase,numarmas sumandole un 20%, calibre de la tabla de clases

Select clase,numarmas*0.20,calibre
from public.clases
group by clase

--4) Obtener los barcos que comiencen con C
Select nombre from public.barcos
where nombre LIKE 'C%'
--5) Obtener las batallas cuya segunda posicion sea o
Select nombre from public.batallas
where nombre LIKE '_o%'

--6) Nombres de clases de barco y países de las clases de barco que llevaban armas con un
--calibre mayor o igual a 16 pulgadas.
Select clase,pais
from public.clases
where calibre>=16
group by clase;

--resultado 4 registros

--7) Barcos con desplazamiento superior a 35.000 toneladas de la tabla de barcos.
Select  c.clase,nombre,desplazamiento
from public.clases c
inner join public.barcos b
on c.clase= b.clase
where desplazamiento>35000
group by b.nombre, c.clase;
--resultado 8

--8) Obtener el promedio de armas, el calibre mínimo de la tabla de clases
Select avg(numarmas), min(calibre)
from public.clases

--9) Obtener la información de resultados ordenado por resultado
Select resultado from public.resultados
group by resultado
order by resultado
--10) Para cada clase, encontrar el año en el que fue botado el barco más antiguo de la clase.
Select clase, botado from public.barcos
order by botado ASC
--11) Contar cuantos barcos tiene cada batalla de la tabla de resultados
Select count (barco), batalla
from public.resultados
group by batalla;
--12)Batallas en las que participaron barcos de la clase Congo.
Select b.nombre,clase,batalla
from public.barcos b
inner join public.resultados r
on b.nombre= r.barco
where clase in('Congo')
group by batalla,b.nombre
--resultado 2

--13) Nombre, desplazamiento y número de armas de todos los barcos que participaron en la
--batalla de Guadalcanal.
Select b.nombre,desplazamiento,numarmas,b.clase,batalla
from public.barcos b
inner join public.resultados r
on b.nombre= r.barco
inner join public.clases c
on b.clase = c.clase
where  batalla in('Guadalcanal')
group by b.nombre,desplazamiento,numarmas,r.batalla

--resultado 2

--14) Nombre de las clases de barcos tales que al menos dos barco de la clase se hundió en una
--batalla.
Select r.resultado, b.clase
from public.barcos b
inner join public.resultados r
on b.nombre= r.barco
where resultado  in('hundido') and b.clase in('North Carolina')
group by b.clase,r.resultado,b.nombre

--15) Batallas en las que participaron al menos tres barcos del mismo país.
Select b.nombre,pais
from public.barcos b
inner join public.resultados r
on b.nombre= r.barco
inner join public.clases c
on b.clase= c.clase
where pais in ('USA')
group by pais, b.nombre
--resultado 1






