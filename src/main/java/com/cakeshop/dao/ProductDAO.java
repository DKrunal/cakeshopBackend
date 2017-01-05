package com.cakeshop.dao;

import java.util.List;

import com.cakeshop.model.Product;


public interface ProductDAO {
	public List<Product> getProduct();
	public Product getProductById(String id);
	public Product isValid(String id, String password);
	public boolean save(Product product);
	public boolean update(Product product);
	public boolean delete(String id);

}
