package com.shakeel.service;

import java.util.List;

import com.shakeel.model.Customer;

public interface CustService {

	public void addCustomer(Customer cust);

	public Customer getCustomer(int cid);

	public List<Customer> getAllCustomers();

	public void updateCustomer(Customer cust);

	public void deleteCustomer(int cid);

}
