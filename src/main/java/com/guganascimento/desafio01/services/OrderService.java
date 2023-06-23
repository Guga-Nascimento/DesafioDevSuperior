package com.guganascimento.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guganascimento.desafio01.entities.Order;
@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		double valorDesconto = ((order.getDiscount() / 100)* order.getBasic());
		
		return order.getBasic()-valorDesconto + shippingService.shipment(order);		
	}

}
//)