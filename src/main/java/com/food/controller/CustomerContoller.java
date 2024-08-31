package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.food.expection.CustomerExitsExpection;
import com.food.model.Customer;
import com.food.serviceimp.CustomerServiceImp;

@RestController
public class CustomerContoller {

	@Autowired
	private CustomerServiceImp customerServiceImp;
	
	public Customer save(Customer customer) throws CustomerExitsExpection {
		return customerServiceImp.save(customer);
	}
}
