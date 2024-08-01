package com.shakeel.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shakeel.model.Product;

@Repository
public interface ProdRepo extends JpaRepository<Product, Integer>{
	
	@Query("select pid from Product")
	List<Integer> fetchBids();

}
