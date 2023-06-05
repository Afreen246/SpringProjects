package com.ciq.DAO;

import java.util.List;

import com.ciq.Model.Product;

public interface ProductDao {
	
	public void createProduct(Product pr);
	
	public List<Product> getProducts();
	
	public void deleteProduct(int id);
	
	public Product getProduct(int id);
	
	public void updatepr(Product pid);

}
