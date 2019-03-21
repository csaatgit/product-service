package com.order.management.productsservice;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductDao extends CrudRepository<Product, String>{
	@Query(value="update Product set qty = :qty where id= :id")
	public void updateProductQty(@Param("id") String id);
}
