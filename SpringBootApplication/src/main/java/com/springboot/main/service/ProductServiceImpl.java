package com.springboot.main.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.entity.Product;
import com.springboot.main.repository.ProductRepository;
import com.springboot.main.request.ProductRequest;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired

	public ProductRepository productRepository;

	@Override
	public Product saveProduct(ProductRequest productRequest) {

		Optional<Product> optional = productRepository.findByProductId(productRequest.getProductId());

		Product product = null;

		if (optional.isPresent()) {
			product = optional.get();
		} else {
			product = new Product();
		}
		BeanUtils.copyProperties(productRequest, product);
		return productRepository.save(product);
	}

}
