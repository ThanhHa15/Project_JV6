package edu.poly.duanjava6.service;

import java.util.List;
import java.util.Map;

import edu.poly.duanjava6.bean.Order;
import edu.poly.duanjava6.bean.OrderDetail;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {

	Order create(JsonNode order);

	Order findById(Long id);

	List<Order> findByUsername(String username);

//	Double sumCostInMonth(Integer month);

	List<Order> findOrderInMonth(Integer month);

	Integer countOrderInMonth(Integer month);
	
}
