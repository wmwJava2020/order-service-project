package com.online.sales.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.online.sales.order.Order;

@Component
public class OrderDao {
	
	public List<Order> getAllOrders(){
		return Stream.of(new Order(101,"Fire",2,30000),
				         new Order(102,"Tire",5,10000),
				         new Order(103,"TV",1,40000),
				         new Order(103,"Desk",9,9000)
				
				).collect(Collectors.toList());
		
	}

}
