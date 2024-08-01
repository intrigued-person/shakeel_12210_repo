package com.shakeel.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakeel.model.Customer;
import com.shakeel.serviceimp.CustImp;
 
@RestController
@RequestMapping("/cust")
@CrossOrigin("*")
public class CustController {
 
    @Autowired
    CustImp service;
 
    @PostMapping
	public String insertStudent(@RequestBody Customer stud) {
		String msg = "";
		try {
			service.addCustomer(stud);
			msg = "inserted student";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failed to add";
		}

		return msg;

	}

	@GetMapping("{cid}")
	public Customer readStudent(@PathVariable("cid") int id) {

		return service.getCustomer(id);
	}

	@GetMapping("/all")
	public List<Customer> getStudents() {

		return service.getAllCustomers();
	}

	@PutMapping
	public String updateStudent(@RequestBody Customer stud) {
		String msg = "";
		try {
			service.updateCustomer(stud);
			msg = "update success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "update failure";
		}

		return msg;

	}

	@DeleteMapping("{cid}")
	public String delStudent(@PathVariable("cid") int id) {
		String msg = "";
		try {
			service.deleteCustomer(id);
			msg = "deleted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "not deleted";
		}

		return msg;
	}
}
