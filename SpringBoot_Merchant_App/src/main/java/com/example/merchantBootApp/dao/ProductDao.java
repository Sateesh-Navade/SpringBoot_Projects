package com.example.merchantBootApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.merchantBootApp.dto.Product;
import com.example.merchantBootApp.repository.ProductRepo;

@Repository
public class ProductDao {
	@Autowired
	private ProductRepo productRepo;

	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	public Optional<Product> findById(int id) {
		return productRepo.findById(id);
	}

	public List<Product> findByBrand(String brand) {
		return productRepo.findByBrand(brand);
	}

	public List<Product> findByCategory(String category) {
		return productRepo.findByCategory(category);
	}

	public List<Product> findByMerchantId(int merchant_id) {
		return productRepo.findByMerchantId(merchant_id);
	}

	public List<Product> findByMerchant(long phone, String password) {
		return productRepo.findByMerchantPhone$Password(phone, password);
	}
}