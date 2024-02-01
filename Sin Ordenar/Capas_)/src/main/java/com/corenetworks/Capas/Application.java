package com.corenetworks.Capas;

import com.corenetworks.Capas.modelo.Pedido;
import com.corenetworks.Capas.repositorio.IPedidoRepositorio;
import com.corenetworks.Capas.servicio.IPedidoServicio;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class Application implements CommandLineRunner {
@Autowired
IPedidoServicio IS;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner teclado= new Scanner(System.in);
		System.out.println("CASO 1: INSERTAR,2 MODIFICAR,3 ELIMINAR");
		int caso= teclado.nextInt();
		teclado.nextLine();
		int id;
		String FP;
		double cantidad;
		Pedido p1= new Pedido();
		switch (caso){
			case 1:
				System.out.println("ID");
				id= teclado.nextInt();
				teclado.nextLine();
				System.out.println("Forma de pago");
				FP=teclado.nextLine();
				System.out.println("Cantidad");
				cantidad= teclado.nextDouble();
				p1.setIdPedido(id);
				p1.setFechaPedido(LocalDate.now());
				p1.setFormaPago(FP);
				p1.setImporte(cantidad);
				System.out.println(IS.insertar(p1));
				break;
			case 2:
				System.out.println("ID");
				 id= teclado.nextInt();
				teclado.nextLine();
				System.out.println("Forma de pago");
				 FP=teclado.nextLine();
				System.out.println("Cantidad");
				 cantidad= teclado.nextDouble();
				p1.setIdPedido(id);
				p1.setFechaPedido(LocalDate.now());
				p1.setFormaPago(FP);
				p1.setImporte(cantidad);
				System.out.println(IS.modificar(p1));
				break;
			case 3:
				System.out.println("ID");
				id= teclado.nextInt();
				IS.eliminar(id);
				break;
			default:
				break;
		}

		Optional <Pedido> op1= Optional.of(new Pedido(5,LocalDate.now(),"EFECT",100));
		System.out.println("Esta vacio? "+ op1.isEmpty());
		System.out.println("Existe un objeto"+op1.isPresent());
		System.out.println(IS.obtenerUno(5));
		System.out.println(IS.obtenerTodos());
	}
}
