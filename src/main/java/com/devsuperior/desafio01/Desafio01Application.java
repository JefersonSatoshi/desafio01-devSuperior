package com.devsuperior.desafio01;

import com.devsuperior.desafio01.Services.OrderService;
import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("************************************************************************");

		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("Código do pedido: " + order1.getCode() + " Valor total: " + orderService.total(order1));

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Código do pedido: " + order2.getCode() + " Valor total: " + orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Código do pedido: " + order3.getCode() + " Valor total: " + orderService.total(order3));
	}
}
