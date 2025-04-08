package edu.poly.duanjava6.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.poly.duanjava6.bean.Order;
import edu.poly.duanjava6.service.OrderService;
import com.fasterxml.jackson.databind.JsonNode;

@CrossOrigin("*")
@RestController
public class OrderRestController {
	@Autowired 
	OrderService oService;
	
	@PostMapping("/rest/order")
	public Order create(@RequestBody JsonNode order) {
		return oService.create(order);
	}
}
