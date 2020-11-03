package com.online.sales.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.sales.dao.OrderDao;
import com.online.sales.order.Order;

@RestController
@RequestMapping("/sales")
public class OrderController {
	 
	@Autowired
	private OrderDao orderDao;

	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		 //return orderDao.getAllOrders(); // to return orders randomly.
		
		//@@ to return orders sorted by price
		//return orderDao.getAllOrders().stream().sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
		
		//@@ to return orders sorted by quantity
		return orderDao.getAllOrders().stream().sorted(Comparator.comparing(Order::getQUANTITY)).collect(Collectors.toList());
		
	}
}
 