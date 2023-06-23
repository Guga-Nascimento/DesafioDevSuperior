package com.guganascimento.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guganascimento.desafio01.entities.Order;
import com.guganascimento.desafio01.services.OrderService;

@SpringBootApplication

public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.println("__________________________________________________________");
		System.out.print("Número do pedido: " + order1.getCode() + "\n");
		System.out.println("Valor total: R$ " +
		String.format("%.2f", orderService.total(order1)));
		System.out.println("__________________________________________________________");
		System.out.print("Número do pedido: " + order2.getCode() + "\n");
		System.out.println("Valor total: R$ " + 
		String.format("%.2f", orderService.total(order2)));
		System.out.println("__________________________________________________________");
		System.out.print("Número do pedido: " + order3.getCode() + "\n");
		System.out.println("Valor total: R$ " + 
		String.format("%.2f", orderService.total(order3)));

	}

}
