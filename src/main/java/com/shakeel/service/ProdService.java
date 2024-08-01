package com.shakeel.service;

import java.util.List;

import com.shakeel.model.Product;

public interface ProdService {

	public void addProduct(Product prod);

	public Product getProduct(int bid);

	public List<Product> getAllProducts();

	public void updateProduct(Product prod);

	public void deleteProduct(int bid);

}
