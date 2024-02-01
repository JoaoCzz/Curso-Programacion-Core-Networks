package com.corenetworks.demoSpring2;

import com.corenetworks.demoSpring2.Modelo.Cliente;
import com.corenetworks.demoSpring2.Persistencia.CapaPersistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpring2Application implements CommandLineRunner {
	@Autowired
Cliente c1;
	@Autowired
CapaPersistencia c2;
	public static void main(String[] args) {
		SpringApplication.run(DemoSpring2Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(c2.insertar(c1));
		System.out.println(c2.consultar(c1));
		System.out.println(c2.Eliminar(c1));
		System.out.println(c2.modificar(c1));


	}
}
