package com.food.repository;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.model.Customer;
import com.food.utils.CsvReader;

@Repository
public class CustomerRepository {

	@Autowired
	private CsvReader csvReader;
	
	private List<Customer> customersList;
	
	public List<Customer> getAllCustomers(){
	  customersList	= csvReader.readCustomerFromCsv();
	  return customersList;
	}
	
	public Customer save(Customer customer) {
		customersList.add(customer);
		return customer;
	}
	public Optional<Customer>findCustomerById(String id){
		Optional<Customer> exitsCustomer=customersList.stream().filter(customer->customer.getId().equals(id)).findFirst();
		return exitsCustomer;
	}
}
