package com.shakeel.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakeel.model.Product;
import com.shakeel.repo.ProdRepo;
import com.shakeel.service.ProdService;

@Service
public class ProdImp implements ProdService {
	
	@Autowired
	ProdRepo brepo;
	

	@Override
	public void addProduct(Product prod) {
		brepo.save(prod);
		
	}

	@Override
	public Product getProduct(int bid) {
		Optional<Product> book = brepo.findById(bid);
		return book.orElse(null);
	}

	@Override
	public List<Product> getAllProducts() {
		return brepo.findAll();
	}

	@Override
	public void updateProduct(Product prod) {
		brepo.save(prod);
		
	}

	@Override
	public void deleteProduct(int bid) {
		brepo.deleteById(bid);
		
	}
	
	public List<Integer> getAllBids() {
		return brepo.fetchBids();	
	}

}
