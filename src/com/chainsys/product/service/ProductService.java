package com.chainsys.product.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.chainsys.product.exception.ProductNotFoundException;
import com.chainsys.product.model.Product;

public interface ProductService {
	Set<Product> findAll();
	
	List<String> findAllName();
	
	List<Integer> findAllId();


	Product findById(int id) throws ProductNotFoundException;
	
	Product findByDate(LocalDate expiryDate) throws ProductNotFoundException;

	void save(Product Product);

	void update(Product Product) throws ProductNotFoundException;

	void delete(int id) throws ProductNotFoundException;

	Product findByname(String name) throws ProductNotFoundException;
	
	void updateexpire(Product Product) throws ProductNotFoundException;
	
	void delete_id(LocalDate expiryDate) throws ProductNotFoundException;
	
	void delete_name(String name)throws ProductNotFoundException;

	void delete(String name) throws ProductNotFoundException;
}
