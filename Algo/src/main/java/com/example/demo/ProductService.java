package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProduct() {
		List<Product> product = new ArrayList<Product>();
		productRepository.findAll().forEach(product1 -> product.add(product1));
		return product;
	}

	public Product getProductById(int id) {

		return productRepository.findById(id).get();
	}

	public void delete(int id) {
		productRepository.deleteById(id);
	}

	public void saveOrUpdate(Product product) {
		productRepository.save(product);
	}

	public void update(Product product, int id) {
		productRepository.save(product);
	}

}
