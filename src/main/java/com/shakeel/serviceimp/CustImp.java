package com.shakeel.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakeel.model.Customer;
import com.shakeel.repo.CustRepo;
import com.shakeel.service.CustService;

@Service
public class CustImp implements CustService {
	
	@Autowired
	CustRepo srepo;	

	@Override
	public void addCustomer(Customer cust) {
		srepo.save(cust);
		
	}

	@Override
	public Customer getCustomer(int cid) {
		Optional<Customer> stud = srepo.findById(cid);
		return stud.orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return srepo.findAll();
	}

	@Override
	public void updateCustomer(Customer cust) {
		srepo.save(cust);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		srepo.deleteById(cid);
		
	}

}
