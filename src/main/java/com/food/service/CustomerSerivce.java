package com.food.service;

import org.springframework.stereotype.Service;

import com.food.expection.CustomerExitsExpection;
import com.food.model.Customer;

@Service
public interface CustomerSerivce {

	public Customer save(Customer customer) throws CustomerExitsExpection;
}
