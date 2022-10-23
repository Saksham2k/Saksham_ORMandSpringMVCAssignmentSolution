package com.greatLearning.customerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatLearning.customerManagement.dao.CustomerDao;
import com.greatLearning.customerManagement.entity.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao dao;

	public List<Customer> getAllCustomers() {
		
		List<Customer> allCustomers = dao.getAll();		
		return allCustomers;
		
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		this.dao.save(customer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		
		this.dao.delete(id);
		
	}

	@Override
	public Customer getCustomer(int id) {
		
		Customer c = this.dao.get(id);
		return c;
		
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		this.dao.update(customer);
		
	}


}
