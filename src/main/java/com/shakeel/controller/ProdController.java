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

import com.shakeel.model.Product;
import com.shakeel.serviceimp.ProdImp;


@RestController
@RequestMapping("/prod")
@CrossOrigin("*")
public class ProdController {
	
	@Autowired
	ProdImp service;
	
	@PostMapping
	public String addBook(@RequestBody Product b) {
		String msg = "";
		try {
			service.addProduct(b);
			msg = "book added";
		} catch (Exception e) {
			msg = "failed";
		}

		return msg;
	}
	
	@GetMapping("{pid}")
	public Product getBook(@PathVariable("pid") int bid) {

		return service.getProduct(bid);
	}
	
	@GetMapping("/allBook")
	public List<Product> getBooks() {
		return service.getAllProducts();
	}
	
	@PutMapping
	public String updateBooks(@RequestBody Product bk) {
		String msg = "";
		try {
			service.updateProduct(bk);
			msg = "updated";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failed to update";
		}

		return msg;

	}

	@DeleteMapping("{pid}")
	public String delBook(@PathVariable("pid") int bid) {
		String msg = "";
		try {
			service.deleteProduct(bid);
			msg = "deleted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "not deleted";
		}

		return msg;
	}
	
	@GetMapping("/bidList")
	public List<Integer> getAllids(){
		return service.getAllBids();
		
	}


}
