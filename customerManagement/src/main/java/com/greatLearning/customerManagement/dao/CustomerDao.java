package com.greatLearning.customerManagement.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.greatLearning.customerManagement.entity.Customer;

@Component
public class CustomerDao {
	
	@Autowired
	private HibernateTemplate template;
	

	public List<Customer> getAll() {
		
		List<Customer> allStudents = template.loadAll(Customer.class);
		
		return allStudents;
	}

	@Transactional
	public void save(Customer customer) {
		
		this.template.save(customer);
		
	}
	
	@Transactional
	public void delete(int id) {
		
		Customer c = this.template.load(Customer.class, id);
		this.template.delete(c);
	} 
	
	public Customer get(int id) {
		
		Customer c = this.template.get(Customer.class, id);
		return c;
	}
	
	@Transactional
	public void update(Customer customer) {
		
		this.template.saveOrUpdate(customer);

	}


}
