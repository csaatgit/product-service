package com.order.management.productsservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@GetMapping("/get-product-list")
	public Iterable<Product> getProductList(){
		return productService.getProductList();
	}
	@PutMapping("/update-product/{id}/{qty}")
	public void updateProductQty(@PathVariable String id, @PathVariable Integer qty){
		productService.updateProductQty(id, -qty);
	}
}
