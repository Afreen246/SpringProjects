package com.ciq.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.ciq.Model.Product;

@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	HibernateTemplate hbt;
	


	@Transactional
	public void createProduct(Product product) {
		//hbt.save(product);
		//saveOrUpdate() is used to if id present its update the value
		//if not present insert the new value
		hbt.save(product);
	}
	
	//get all products
	public List<Product> getProducts(){
		List<Product> all = hbt.loadAll(Product.class);
		return all;
	}
	
	//delete the single product
	@Transactional
	public void deleteProduct(int pid) {
		Product load1 = hbt.load(Product.class,pid);
		hbt.delete(load1);
	}
	
	//get by id
	public Product getProduct(int id) {
		return hbt.get(Product.class, id);
		
	}
	
	@Transactional
	public void updatepr(Product pid)
	{
		hbt.update(pid);
	}
	
}
