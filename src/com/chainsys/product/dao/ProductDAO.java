package com.chainsys.product.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.chainsys.product.model.Product;

public interface ProductDAO {
	Set<Product> findAll();

	Product findById(int id);
	
	List<String> findAllName();
	List<Integer> findAllId();
	
	Product findByDate(LocalDate expiryDate);

	void save(Product product);

	void update(Product product);

	void delete(int id);
	
	Product findByname(String name);
	
	void updateexpire(Product product );
	
	void delete_id(LocalDate expiryDate);
	
	void delete_name(String name);
}
