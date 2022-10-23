package com.greatLearning.customerManagement.service;

import java.util.List;


import com.greatLearning.customerManagement.entity.Customer;


public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	
	public void saveCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	public Customer getCustomer(int id);
	
	public void updateCustomer(Customer customer);

}
