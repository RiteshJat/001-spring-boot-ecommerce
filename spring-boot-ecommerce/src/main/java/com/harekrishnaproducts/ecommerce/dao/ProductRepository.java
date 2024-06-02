package com.harekrishnaproducts.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.harekrishnaproducts.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long>{
	Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
	//	SELECT * FROM product where category_id=? //behind the scene
	//	 http://localhost:8080/api/products/search/findByCategoryId?id=2

	Page<Product> findByNameContaining(@Param("name") String name, Pageable page);
	// SELECT * FROM product p WHERE p.name LIKE CONCAT('%',:name,'%'); //behind the scene
	
}
