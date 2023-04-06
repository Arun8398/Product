package com.onesoft.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository prep;

	public String saveprods(List<Product> prods) {
		
		prep.saveAll(prods);
		
		return"sucessfully saved";
		
	}

	public String updateprds(List<Product> prods) {
		
		 prep.saveAll(prods);
		 return"Succesfully update";
	}

	public List<Product> getprods() {
		
		return prep.findAll();
	}

	public List<Product> getprods(int price, int price2) {
		// TODO Auto-generated method stub
		return prep.findAll();
	}

	public String deleteprodsbyid(int id) {
		
		
				prep.deleteById(id);
				
				
				return"sucessfully deleted";
	}
	

}
