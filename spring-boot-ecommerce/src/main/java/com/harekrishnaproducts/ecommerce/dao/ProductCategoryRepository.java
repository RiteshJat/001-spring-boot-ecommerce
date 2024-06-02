package com.harekrishnaproducts.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.harekrishnaproducts.ecommerce.entity.ProductCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category") //Name of JSON entry, /product-category 
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
