package com.corenetworks.ExamenModulo4JoaoCozzarelli;

import com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio1.Modelo.Factura;
import com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio1.Modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamenModulo4JoaoCozzarelliApplication implements CommandLineRunner {
	@Autowired
	Factura f1;

	public static void main(String[] args) {
		SpringApplication.run(ExamenModulo4JoaoCozzarelliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Ejercicio 1
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto("Coca cola",1.00));
		f1.setProductos(productos);
		System.out.println( "Iva general= "+f1.CalcularTotalFactura());


	}
}
