package com.greatLearning.customerManagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.greatLearning.customerManagement.entity.Customer;
import com.greatLearning.customerManagement.service.CustomerService;

@Controller
public class CustomerController {

		@Autowired
		private CustomerService customerService;
		
		@RequestMapping("/All")
		public String allCustomers(Model model) {
			
			List<Customer> customers = customerService.getAllCustomers();
			System.out.println(customers);
			model.addAttribute("customers", customers);
			return "allCustomer";
			
		}
		
		@RequestMapping("/Delete/{customerId}")
		public RedirectView deleteCustomer(@PathVariable("customerId") int customerId, HttpServletRequest request) {
			
			customerService.deleteCustomer(customerId);
			RedirectView view = new RedirectView();
			view.setUrl(request.getContextPath() + "/All");
			return view;
			
		}
		
		@RequestMapping("/Add")
		public String addCustomer(Model m) {
			
			m.addAttribute("title","Add Customer");
			return "addCustomerForm";
			
		}
		
		@RequestMapping(value = "/handle-customer", method = RequestMethod.POST)
		public RedirectView handleCustomer(@ModelAttribute Customer customer, HttpServletRequest request) {
			
			customerService.saveCustomer(customer);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath()+ "/All");
			return redirectView;
			
		}
		
		@RequestMapping("/Update/{customerId}")
		public String updateCustomer(@PathVariable("customerId") int customerId, Model m) {
			
			Customer c = customerService.getCustomer(customerId);
			m.addAttribute("customer", c);
			return "updateCustomerForm";
			
		}
		
		@RequestMapping(value = "/update-customer", method = RequestMethod.POST)
		public RedirectView updateHandler(@ModelAttribute Customer customer, HttpServletRequest request) {
			
			customerService.updateCustomer(customer);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath()+ "/All");
			return redirectView;
			
		}

	
}
