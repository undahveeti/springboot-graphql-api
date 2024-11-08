package com.avtran.lil.hplus.controller;

import com.avtran.lil.hplus.data.CustomerRepository;

import com.avtran.lil.hplus.data.Customer;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;

public class CustomerController {
	private final CustomerRepository customerRepository;
	
	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@QueryMapping
	public Iterable<Customer> customers(){
		return this.customerRepository.findAll();
	}
	
	@QueryMapping
	public Customer customerById(@Argument Long id) {
		return this.customerRepository.findById(id).orElseThrow();
	}
	
	@QueryMapping
	public Customer customerbyEmail(@Argument String email) {
		return this.customerRepository.findCustomerByEmail(email);
	}
}
