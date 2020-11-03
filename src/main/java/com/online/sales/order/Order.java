package com.online.sales.order;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Order {

	private int ID;
	private String PRODUCT;
	private int QUANTITY;
	private long price;
}
