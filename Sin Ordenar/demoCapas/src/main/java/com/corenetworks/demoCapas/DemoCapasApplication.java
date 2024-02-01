package com.corenetworks.demoCapas;

import com.corenetworks.demoCapas.modelo.Factura;
import com.corenetworks.demoCapas.modelo.Inmueble;
import com.corenetworks.demoCapas.modelo.Pedido;
import com.corenetworks.demoCapas.servicio.iServicioFactura;
import com.corenetworks.demoCapas.servicio.iServicioInmueble;
import com.corenetworks.demoCapas.servicio.iServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoCapasApplication implements CommandLineRunner {
	@Autowired
Pedido p1;
@Autowired
iServicioPedido capaservicio;
@Autowired
	iServicioFactura cservicio;
@Autowired
	iServicioInmueble cpServicio;

	public static void main(String[] args) {
		SpringApplication.run(DemoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(capaservicio.insertar(p1));
		Factura f1= new Factura(1,LocalDate.now(),350);
		System.out.println(cservicio.insertar(f1));
		Inmueble i1= new Inmueble("1234","inmueblepq.png","inmbuelegrande.png","Esta caro");
		System.out.println(cpServicio.insertar(i1));
	}
}
