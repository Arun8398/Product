package com.onesoft.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/prod")
public class ProductController {
	@Autowired
	ProductService prdser;
	
	
	@PostMapping(value="/storeprods")
	public String saveprods(@RequestBody List<Product> prods) {
		
		return prdser.saveprods(prods);
	}

	@PutMapping(value="/prodsModify")
	public String updateprds(@RequestBody List<Product> prods){
		return prdser.updateprds(prods);
		
	}
	
	@GetMapping(value="/prodsview")
	public List<Product> getprods(){
		return prdser.getprods();
		
	}
	@GetMapping(value="/setbyprice/{price}/{price2}")
	public List<Product>setprodprice(@PathVariable int price, int price2){
		return prdser.setprodprice(price,price2);
	}
	@DeleteMapping(value="/deletebyid/{id}")
	
	public String deleteprods(@PathVariable int id) {
		
		return prdser.deleteprodsbyid(id);
	}
	
	
	
	
	
	
}
