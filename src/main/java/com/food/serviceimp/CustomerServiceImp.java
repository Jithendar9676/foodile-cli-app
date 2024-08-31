package com.food.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.food.expection.CustomerExitsExpection;
import com.food.model.Customer;
import com.food.repository.CustomerRepository;
import com.food.service.CustomerSerivce;

public class CustomerServiceImp implements CustomerSerivce {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) throws CustomerExitsExpection {
		Optional<Customer> exitingCustomer=customerRepository.findCustomerById(customer.getId());
		if(exitingCustomer.isPresent()) {
			throw new CustomerExitsExpection("Customer already exits");
		}else {
			return customer;
		}
		
	}

}
