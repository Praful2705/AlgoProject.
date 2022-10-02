package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping("/product")
	public List<Product> getAllProduct(@RequestBody Product product) {
        
		return productService.getAllProduct();
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return (Product) productService.getProductById(id);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		productService.delete(id);
	}

	@PostMapping("/product")
	public long saveProduct(@RequestBody Product product) 
	{
		productService.saveOrUpdate(product);
		return product.getProduct();
	}

	@PutMapping("/product")
	public Product update(@RequestBody Product product) {
		productService.saveOrUpdate(product);
		return product;
	}

}
