package com.guganascimento.desafio01.services;

import org.springframework.stereotype.Service;

import com.guganascimento.desafio01.entities.Order;
@Service
public class ShippingService {
	
	public double shipment(Order order) {
		Double frete;
		if (order.getBasic() <= 100.00) {
			frete =  20.00;
		}else if (order.getBasic() > 100 && order.getBasic() <= 200.00 ) {
			frete =   12.00;
		}else {
			frete = 0.0;
		}
		return frete;
		
	}

}
