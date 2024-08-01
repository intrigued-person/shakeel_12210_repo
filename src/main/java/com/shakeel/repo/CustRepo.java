package com.shakeel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shakeel.model.Customer;

@Repository
public interface CustRepo extends JpaRepository<Customer, Integer> {

}
