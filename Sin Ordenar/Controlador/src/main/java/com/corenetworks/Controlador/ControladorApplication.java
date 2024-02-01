package com.corenetworks.Controlador;

import com.corenetworks.Controlador.modelo.Lugar;
import com.corenetworks.Controlador.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControladorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ControladorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
