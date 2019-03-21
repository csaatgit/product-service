package com.order.management.productsservice;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	public Iterable<Product> getProductList(){
		return productDao.findAll();
	}
	
	public void updateProductQty(String id, Integer qty){
		Optional<Product> p = productDao.findById(id);
		if(p.isPresent()) {
			Product prod = p.get();
			if(prod.getQty() >= 0)
				prod.setQty(prod.getQty() + qty);
			if(prod.getQty() <= 0)
				prod.setIsAvailable(false);
			productDao.save(prod);
		}		
	}
}
