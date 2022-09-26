package com.navs.foxhole.logi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.navs.foxhole.logi.entity.Order;
import com.navs.foxhole.logi.service.OrderService;

@Controller
@RequestMapping( "/logi" )
public class LogiController {
	
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping( "/list" )
	public String listCustomers( Model theModel ) {
		
		// get customer from DAO from Service
		List<Order> lOrders = orderService.getOrder();
		
		// add the customer to the model
		theModel.addAttribute( "orders", lOrders );
		
		theModel.addAttribute( "order", new Order() );
		
		// later on the model will be given to the jsp
		
		return "list-logi";
	}
	
	@PostMapping( "/addOrder" )
	public String saveCustomer( @ModelAttribute("order")Order order ) {
		
		orderService.saveOrder( order );
		
		return "redirect:/logi/list";
	}
	
	@GetMapping( "/delete" )
	public String deleteCustomer( @RequestParam("id") int id ) {
		
		orderService.deleteOrder( id );
		
		return "redirect:/logi/list";
	}
	
	@GetMapping( "/showFormForAdd" )
	public String showFormForAdd( Model model ) {
		
		Order order = new Order();
		
		model.addAttribute( "order", order );
		
		return "order-form";
	}
	
	@GetMapping( "/showFormForUpdate" )
	public String showFormForUpdate( @RequestParam("customerId")int id, Model model ) {
		
		//get customer from DB
		Order order = orderService.getOrder( id );
		
		//set customer as a model attribute to pre-populate the form
		model.addAttribute( "order", order );
		
		//send over to our form
		
		return "order-form";
	}
}
