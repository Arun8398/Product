package com.onesoft.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	//@Query(value="SELECT * FROM product_details where id=?",nativeQuery=true)
	public  String deleteById(int id);
	

	

}
