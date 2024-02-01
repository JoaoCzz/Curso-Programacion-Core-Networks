package com.corenetwork.springCoreFundamentos;

import com.corenetwork.springCoreFundamentos.modelo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringCoreFundamentosApplication implements CommandLineRunner {
	@Autowired
	SeguroCoche sC1;
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreFundamentosApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//Coche c1= new Coche("ABC1234","Ferrari");
		//TallerMecanico tm= new TallerMecanico();
		//SeguroCoche s1= new SeguroCoche(tm,"Mapfre");
		sC1.setAseguradora("Mutua");
		System.out.println(sC1.toString());
	}
}
