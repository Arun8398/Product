package com.onesoft.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired
	ProductDao pro;

	public String saveprods(List<Product> prods) {
		
		return pro.saveprods(prods);
		
	}
	

	public String updateprds(List<Product> prods) {
		
		return pro.updateprds(prods);
	}


	public List<Product> getprods() {
		// TODO Auto-generated method stub
		return pro.getprods();
	}


	public List<Product> setprodprice(int price,int price2) {
		
		return pro.getprods(price,price2);
	}


	public String deleteprodsbyid(int id) {
		
		return pro.deleteprodsbyid(id);
	}

}
